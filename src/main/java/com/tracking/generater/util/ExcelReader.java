package com.tracking.generater.util;

import com.tracking.generater.tracking.TrackingDataItem;
import com.tracking.generater.tracking.TrackingDataItemProperty;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

    public static String underlineToCamelCase(String origin) {

        String result = origin;
        int index = result.indexOf("_");
        while (index != -1) {
            result = result.substring(0, index) + result.substring(index + 1, index + 2).toUpperCase() + result.substring(index + 2);
            index = result.indexOf("_");
        }


        return result;
    }

    public static boolean isEmptyRow(XSSFRow row) {
        //第一位埋点定义和第三位置属性定义必须有一个
        if ((row.getCell(1) != null && !row.getCell(1).getStringCellValue().trim().equalsIgnoreCase(""))
                || (row.getCell(3) != null && !row.getCell(3).getStringCellValue().trim().equalsIgnoreCase(""))) {
            return false;
        }
        return true;

    }

    public static List<TrackingDataItem> readXls(String path, String sheetName) throws Exception {
        XSSFWorkbook work = new XSSFWorkbook(new FileInputStream(path));
        XSSFSheet sheet = work.getSheet(sheetName);

        List<TrackingDataItem> resultList = new ArrayList<>();
        TrackingDataItem dataItem = null;
        List<TrackingDataItemProperty> propertyList = new ArrayList<>();

        Integer trackingDefineStart = Integer.MAX_VALUE;

        for (int i = 0, snum = sheet.getPhysicalNumberOfRows(); i < snum; i++) {
            XSSFRow row = sheet.getRow(i);
            //忽略空行
            if (row == null) {
                continue;
            }
            XSSFCell cell = row.getCell(0);

            //找到埋点定义表头
            if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING && cell.getStringCellValue().trim().equalsIgnoreCase("事件编号")) {
                trackingDefineStart = i;
                continue;
            }

            //跳过结束的空行
            if (isEmptyRow(row)) {
                continue;
            }

            //埋点定义内容开始
            if (i > trackingDefineStart) {
                cell = row.getCell(1);
                if (cell != null && !cell.getStringCellValue().trim().equalsIgnoreCase("")) {//第一列有数据，新埋点开始
                    dataItem = new TrackingDataItem();
                    propertyList = new ArrayList<>();

                    //设置埋点定义
                    dataItem.setName(row.getCell(1).getStringCellValue().trim());
                    dataItem.setTrackingDescription(row.getCell(2).getStringCellValue());
                    dataItem.setTrackingTiming(row.getCell(8).getStringCellValue());
                    dataItem.setClassName(dataItem.getName().replaceAll("_", "").trim());

                    String className = dataItem.getClassName();
                    String instanceName = className.substring(0, 1).toLowerCase().concat(className.substring(1, className.length()));
                    dataItem.setInstanceName(instanceName.trim());

                    //设置属性
                    extractPropertyFromXSSFRow(propertyList, row);

                    //保存埋点数据
                    if (dataItem != null) {
                        dataItem.setPropertyList(propertyList);
                        resultList.add(dataItem);
                    }
                } else {//这是一条只有属性相关定义
                    extractPropertyFromXSSFRow(propertyList, row);
                }
            }
        }
        return resultList;
    }

    private static void extractPropertyFromXSSFRow(List<TrackingDataItemProperty> propertyList, XSSFRow row) {
        TrackingDataItemProperty trackingDataItemProperty = new TrackingDataItemProperty();
        trackingDataItemProperty.setName(row.getCell(3).getStringCellValue().trim());
        trackingDataItemProperty.setPropNameDescription(row.getCell(4).getStringCellValue());
        trackingDataItemProperty.setPropType(row.getCell(5).getStringCellValue());
        trackingDataItemProperty.setPropTypeDescription(row.getCell(6).getStringCellValue());
        trackingDataItemProperty.setMethodName(underlineToCamelCase(trackingDataItemProperty.getName()));
        propertyList.add(trackingDataItemProperty);
    }

}
