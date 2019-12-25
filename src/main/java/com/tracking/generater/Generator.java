package com.tracking.generater;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import com.tracking.generater.tracking.TrackingDataItem;
import com.tracking.generater.util.ExcelReader;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generator {

    private static Template getDefinedTemplate(String templateName) throws IOException {
        //配置类
        Configuration cfg = new Configuration();
        File file = new File(".");
        System.out.println("file = " + file.getAbsolutePath());
        cfg.setDirectoryForTemplateLoading(new File("./src/main/resources/template/"));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        return cfg.getTemplate(templateName);
    }

    public static void main(String[] args) throws Exception {
//        String filePath = "./src/main/resources/埋点.xlsx";
        String filePath = "/Users/wupuquan/Downloads/1.29.0/线上出房前端埋点_1.29_1224.xlsx";
        List<TrackingDataItem> trackingList = ExcelReader.readXls(filePath, "事件表");

        Map<String, Object> root = new HashMap<>();
        root.put("trackingList", trackingList);
        String savePath = "./generated/";
        File file = new File(savePath);
        if (!file.exists()) {
            file.mkdirs();
        }

        //generater android java file
        Template template = getDefinedTemplate("TrackingAndroid.ftl");
        root.put("package", "com.dankegongyu.customer");
        writeToFile(root, savePath, template, "Tracking.java");

        //generater iOS h file
        template = getDefinedTemplate("TrackingIOS.h.ftl");
        writeToFile(root, savePath, template, "DKSaStatisticsBaseModel.h");

        //generater iOS m file
        template = getDefinedTemplate("TrackingIOS.m.ftl");
        writeToFile(root, savePath, template, "DKSaStatisticsBaseModel.m");
    }

    private static void writeToFile(Map<String, Object> root, String savePath, Template template, String fileName) throws TemplateException, IOException {
        OutputStream fos = new FileOutputStream( new File(savePath, fileName));
        Writer out = new OutputStreamWriter(fos);
        template.process(root, out);
        fos.flush();
        fos.close();
    }

}
