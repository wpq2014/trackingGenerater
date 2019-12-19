package test.test;

import freemarker.template.Configuration;
import freemarker.template.Template;
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
//        String filePath = "/Users/bingao/Downloads/用户增长埋点_1.29.xlsx";
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
        OutputStream fos = new FileOutputStream( new File(savePath, "Tracking.java"));
        Writer out = new OutputStreamWriter(fos);
        template.process(root, out);
        fos.flush();
        fos.close();

        //generate iOS h file

        template = getDefinedTemplate("TrackingIOS.h.ftl");
        fos = new FileOutputStream( new File(savePath, "DKSaStatisticsBaseModel.h"));
        out = new OutputStreamWriter(fos);
        template.process(root, out);
        fos.flush();
        fos.close();

        //generate iOS m file
        savePath = "./test/generated/";
        file = new File(savePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        template = getDefinedTemplate("TrackingIOS.m.ftl");

        fos = new FileOutputStream( new File(savePath, "DKSaStatisticsBaseModel.m"));
        out = new OutputStreamWriter(fos);
        template.process(root, out);
        fos.flush();
        fos.close();
    }

}
