package test.test.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import test.test.tracking.TrackingDataItem;
import test.test.tracking.TrackingDataItemProperty;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

    public static String underlineToCamelCase(String origin) {

        String result = origin;
        int index = result.indexOf("_");
        while (index != -1) {
            result = result.substring(0, index) + result.substring(index+1, index + 2).toUpperCase() + result.substring(index + 2);
            index = result.indexOf("_");
        }


        return result;
    }

    public static boolean isEmptyRow(XSSFRow row) {
        //第一位埋点定义和第三位置属性定义必须有一个
        if ((row.getCell(1)!= null && !row.getCell(1).getStringCellValue().trim().equalsIgnoreCase(""))
                || (row.getCell(3)!= null && !row.getCell(3).getStringCellValue().trim().equalsIgnoreCase(""))) {
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
            if (cell != null && cell.getCellType()== Cell.CELL_TYPE_STRING && cell.getStringCellValue().trim().equalsIgnoreCase("事件编号")) {
                trackingDefineStart = i;
                continue;
            }

            //过滤结束的空行
            if (isEmptyRow(row)) {
                continue;
            }

            //埋点定义内容开始
            if (i > trackingDefineStart) {

                cell = row.getCell(1);
                if (cell != null && !cell.getStringCellValue().trim().equalsIgnoreCase("")) {//第一列有数据，新埋点开始

                    if (dataItem != null) {//保存上一条埋点数据
                        dataItem.setPropertyList(propertyList);
                        resultList.add(dataItem);
                    }

                    dataItem = new TrackingDataItem();
                    propertyList = new ArrayList<>();

                    dataItem.setName(row.getCell(1).getStringCellValue().trim());
                    dataItem.setTrackingDescription(row.getCell(2).getStringCellValue());
                    dataItem.setTrackingTiming(row.getCell(8).getStringCellValue());
                    dataItem.setClassName(dataItem.getName().replaceAll("_", "").trim());

                    String className = dataItem.getClassName();
                    String instanceName = className.substring(0,1).toLowerCase().concat(className.substring(1, className.length()));
                    dataItem.setInstanceName(instanceName.trim());


                    TrackingDataItemProperty trackingDataItemProperty = new TrackingDataItemProperty();
                    trackingDataItemProperty.setName(row.getCell(3).getStringCellValue().trim());
                    trackingDataItemProperty.setPropNameDescription(row.getCell(4).getStringCellValue());
                    trackingDataItemProperty.setPropType(row.getCell(5).getStringCellValue());
                    trackingDataItemProperty.setPropTypeDescription(row.getCell(6).getStringCellValue());
                    trackingDataItemProperty.setMethodName(underlineToCamelCase(trackingDataItemProperty.getName()));
                    propertyList.add(trackingDataItemProperty);

                } else {//这是一条只有属性相关定义
                    TrackingDataItemProperty trackingDataItemProperty = new TrackingDataItemProperty();
                    trackingDataItemProperty.setName(row.getCell(3).getStringCellValue());
                    trackingDataItemProperty.setPropNameDescription(row.getCell(4).getStringCellValue());
                    trackingDataItemProperty.setPropType(row.getCell(5).getStringCellValue());
                    trackingDataItemProperty.setPropTypeDescription(row.getCell(6).getStringCellValue());
                    trackingDataItemProperty.setMethodName(underlineToCamelCase(trackingDataItemProperty.getName()));
                    propertyList.add(trackingDataItemProperty);
                }

            }

        }

        return resultList;

    }

//    public static void main(String args[]) throws Exception {
//        String filePath = "/Users/bingao/Downloads/用户增长埋点_1.29.xlsx";
//        List<TrackingDataItem> result = readXls(filePath, "事件表");
//        System.out.println("result = " + result);
//    }
}
