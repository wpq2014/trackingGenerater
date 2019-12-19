package test.test;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import test.test.tracking.TrackingDataItem;
import test.test.util.ExcelReader;

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
        cfg.setDirectoryForTemplateLoading(new File("./test/src/main/resources/template/"));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        return cfg.getTemplate(templateName);
    }

    public static void main(String[] args) throws Exception {
        String filePath = "/Users/bingao/Downloads/线上出房埋点_1.29.xlsx";
        List<TrackingDataItem> trackingList = ExcelReader.readXls(filePath, "事件表");


        Map<String, Object> root = new HashMap<>();
        root.put("trackingList", trackingList);
        String savePath = "./test/generated/";
        File file = new File(savePath);
        if (!file.exists()) {
            file.mkdirs();
        }


        //generate android java file
        Template template = getDefinedTemplate("TrackingAndroid.ftl");
        root.put("package", "com.dankegongyu.customer");
        writeToFile(root, savePath, template, "Tracking.java");

        //generate iOS h file
        template = getDefinedTemplate("TrackingIOS.h.ftl");
        writeToFile(root, savePath, template, "DKSaStatisticsBaseModel.h");


        //generate iOS m file
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
