// this is auto generated file, never change it by hand
package test.test1.tracking;

import java.util.HashMap;

public class Tracking {

    protected String name;

    protected HashMap<String, Object> mParams;

    public void track() {
        //做神策tracking;
        mParams.clear();
    }

    public static AppUGHRoomListBetweenRoomBannerClick appUGHRoomListBetweenRoomBannerClick = new AppUGHRoomListBetweenRoomBannerClick();
    /**
     * App用户增长房源列表页房源中轮播图点击
     * 点击控件时触发
     */
    public static class AppUGHRoomListBetweenRoomBannerClick extends Tracking {

        public AppUGHRoomListBetweenRoomBannerClick(){
            super.name = "App_UGH_RoomList_BetweenRoomBanner_Click";
        }

        //轮播图位置
        public AppUGHRoomListBetweenRoomBannerClick banner_location(Object banner_location) {
            mParams.put("banner_location", banner_location);
            return this;
        }

        //内容标题
        public AppUGHRoomListBetweenRoomBannerClick content_title(Object content_title) {
            mParams.put("content_title", content_title);
            return this;
        }

        //内容跳转地址
        public AppUGHRoomListBetweenRoomBannerClick content_url(Object content_url) {
            mParams.put("content_url", content_url);
            return this;
        }

    }
    public static AppUGHGuideClick appUGHGuideClick = new AppUGHGuideClick();
    /**
     * App用户增长引导页点击
     * 点击控件时触发
     */
    public static class AppUGHGuideClick extends Tracking {

        public AppUGHGuideClick(){
            super.name = "App_UGH_Guide_Click";
        }

        //内容标题
        public AppUGHGuideClick content_title(Object content_title) {
            mParams.put("content_title", content_title);
            return this;
        }

        //内容跳转地址
        public AppUGHGuideClick content_url(Object content_url) {
            mParams.put("content_url", content_url);
            return this;
        }

    }
    public static AppUGHPersonalCenterTenantCenterBannerClick appUGHPersonalCenterTenantCenterBannerClick = new AppUGHPersonalCenterTenantCenterBannerClick();
    /**
     * App用户增长个人中心页租客中心广告位点击
     * 点击控件时触发
     */
    public static class AppUGHPersonalCenterTenantCenterBannerClick extends Tracking {

        public AppUGHPersonalCenterTenantCenterBannerClick(){
            super.name = "App_UGH_PersonalCenter_TenantCenterBanner_Click";
        }

        //轮播图位置
        public AppUGHPersonalCenterTenantCenterBannerClick banner_location(Object banner_location) {
            mParams.put("banner_location", banner_location);
            return this;
        }

        //内容标题
        public AppUGHPersonalCenterTenantCenterBannerClick content_title(Object content_title) {
            mParams.put("content_title", content_title);
            return this;
        }

        //内容跳转地址
        public AppUGHPersonalCenterTenantCenterBannerClick content_url(Object content_url) {
            mParams.put("content_url", content_url);
            return this;
        }

    }


}
