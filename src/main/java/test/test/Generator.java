package test.test;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import test.test.tracking.TrackingDataItem;
import test.test.tracking.TrackingDataItemProperty;

import java.io.*;
import java.util.ArrayList;
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

    public static void main(String[] args) throws IOException, TemplateException {

        List<TrackingDataItem> trackingList = createTestData();

        String savePath = "./test/target/generated-sources/test/test1/tracking";
        File file = new File(savePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        Template template = getDefinedTemplate("TrackingAndroid.ftl");

        Map<String, Object> root = new HashMap<>();
        root.put("trackingList", trackingList);
        root.put("package", "test.test1.tracking");
        OutputStream fos = new FileOutputStream( new File(savePath, "Tracking.java"));
        Writer out = new OutputStreamWriter(fos);
        template.process(root, out);
        fos.flush();
        fos.close();

    }

    public static List<TrackingDataItem> createTestData() {

        ArrayList<TrackingDataItem> resultList = new ArrayList<>();

        TrackingDataItem trackingDataItem =  new TrackingDataItem();
        trackingDataItem.setName("App_Concern_Icon_Click");
        trackingDataItem.setClassName("AppConcernIconClick");
        trackingDataItem.setInstanceName("appConcernIconClick");
        trackingDataItem.setTrackingDescription("我的关注页，取消关注按钮点击或点编辑后删除");
        trackingDataItem.setTrackingTiming("我的关注页，取消关注按钮点击或点编辑后删除");

        ArrayList<TrackingDataItemProperty> propertyArrayList = new ArrayList<>();

        TrackingDataItemProperty property1 = new TrackingDataItemProperty();
        property1.setName("concern_type");
        property1.setPropNameDescription("关注类型");
        propertyArrayList.add(property1);

        TrackingDataItemProperty property2 = new TrackingDataItemProperty();
        property2.setName("community_id");
        property2.setPropNameDescription("小区id");
        propertyArrayList.add(property2);

        TrackingDataItemProperty property3 = new TrackingDataItemProperty();
        property3.setName("subscribe_id");
        property3.setPropNameDescription("关注id");
        propertyArrayList.add(property3);

        TrackingDataItemProperty property4 = new TrackingDataItemProperty();
        property4.setName("room_id");
        property4.setPropNameDescription("房源id");
        propertyArrayList.add(property4);

        trackingDataItem.setPropertyList(propertyArrayList);

        resultList.add(trackingDataItem);

        trackingDataItem =  new TrackingDataItem();
        trackingDataItem.setName("App_Concern_Icon_Click1");
        trackingDataItem.setClassName("AppConcernIconClick1");
        trackingDataItem.setInstanceName("appConcernIconClick1");

        propertyArrayList = new ArrayList<>();

         property1 = new TrackingDataItemProperty();
        property1.setName("concern_type");
        propertyArrayList.add(property1);

        property2 = new TrackingDataItemProperty();
        property2.setName("community_id");
        property2.setPropNameDescription("小区id");
        propertyArrayList.add(property2);

        trackingDataItem.setPropertyList(propertyArrayList);

        resultList.add(trackingDataItem);

        for (int i = 2; i< 50; i++) {
            trackingDataItem =  new TrackingDataItem();
            trackingDataItem.setName("App_Concern_Icon_Click" + i);
            trackingDataItem.setClassName("AppConcernIconClick" +i);
            trackingDataItem.setInstanceName("appConcernIconClick1" + i);
            trackingDataItem.setTrackingDescription("我的关注页，取消关注按钮点击或点编辑后删除");
            trackingDataItem.setTrackingTiming("我的关注页，取消关注按钮点击或点编辑后删除");

            propertyArrayList = new ArrayList<>();

            property1 = new TrackingDataItemProperty();
            property1.setName("concern_type");
            property2.setPropNameDescription("关注id");
            propertyArrayList.add(property1);

            property2 = new TrackingDataItemProperty();
            property2.setName("community_id");
            property2.setPropNameDescription("小区id");
            propertyArrayList.add(property2);

            trackingDataItem.setPropertyList(propertyArrayList);

            resultList.add(trackingDataItem);

        }

        return resultList;
    }

    public static List<TrackingDataItem> readFromSource() {
        return null;

    }

}
