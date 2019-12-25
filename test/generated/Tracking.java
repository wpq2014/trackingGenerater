// this is auto generated file, never change it by hand
package com.dankegongyu.customer;

import java.util.HashMap;

public class Tracking {

    protected String name;

    protected HashMap<String, Object> mParams;

    public String getName() {
        return name;
    }

    public HashMap<String, Object> getParams() {
        return mParams;
    }

    public void track() {
        //作神策tracking
        TrackingUtil.track(name, mParams);
        mParams.clear();
    }

    public static AppSOLRoomListSearchResult appSOLRoomListSearchResult = new AppSOLRoomListSearchResult();
    /**
     * 埋点事件名: App线上出房房源列表页查询结果
     * 埋点时机: 房源列表页搜索请求返回结果时触发
     */
    public static class AppSOLRoomListSearchResult extends Tracking {

        public AppSOLRoomListSearchResult(){
            super.name = "App_SOL_RoomList_Search_Result";
        }

         //属性名: 租赁类型
         public AppSOLRoomListSearchResult rentType(Object rentType) {
         mParams.put("rentType", rentType);
         return this;
         }

         //属性名: 房间数
         public AppSOLRoomListSearchResult bedroomCount(Object bedroomCount) {
         mParams.put("bedroomCount", bedroomCount);
         return this;
         }

         //属性名: 搜索词
         public AppSOLRoomListSearchResult searchText(Object searchText) {
         mParams.put("searchText", searchText);
         return this;
         }

         //属性名: 搜索词性
         public AppSOLRoomListSearchResult wordType(Object wordType) {
         mParams.put("wordType", wordType);
         return this;
         }

         //属性名: 附近
         public AppSOLRoomListSearchResult nearby(Object nearby) {
         mParams.put("nearby", nearby);
         return this;
         }

         //属性名: 商圈
         public AppSOLRoomListSearchResult block(Object block) {
         mParams.put("block", block);
         return this;
         }

         //属性名: 地铁
         public AppSOLRoomListSearchResult subway(Object subway) {
         mParams.put("subway", subway);
         return this;
         }

         //属性名: 价格
         public AppSOLRoomListSearchResult price(Object price) {
         mParams.put("price", price);
         return this;
         }

         //属性名: 房屋特色
         public AppSOLRoomListSearchResult roomFeatures(Object roomFeatures) {
         mParams.put("roomFeatures", roomFeatures);
         return this;
         }

         //属性名: 风格
         public AppSOLRoomListSearchResult styles(Object styles) {
         mParams.put("styles", styles);
         return this;
         }

         //属性名: 房屋状态
         public AppSOLRoomListSearchResult status(Object status) {
         mParams.put("status", status);
         return this;
         }

         //属性名: 朝向
         public AppSOLRoomListSearchResult facings(Object facings) {
         mParams.put("facings", facings);
         return this;
         }

         //属性名: 房间面积
         public AppSOLRoomListSearchResult areaLevels(Object areaLevels) {
         mParams.put("areaLevels", areaLevels);
         return this;
         }

         //属性名: 入住时间
         public AppSOLRoomListSearchResult rentTime(Object rentTime) {
         mParams.put("rentTime", rentTime);
         return this;
         }

         //属性名: 文本框输入
         public AppSOLRoomListSearchResult textboxInput(Object textbox_input) {
         mParams.put("textbox_input", textbox_input);
         return this;
         }

         //属性名: 返回结果
         public AppSOLRoomListSearchResult resultCode(Object result_code) {
         mParams.put("result_code", result_code);
         return this;
         }

    }
    public static AppSOLMapInputAreaSearch appSOLMapInputAreaSearch = new AppSOLMapInputAreaSearch();
    /**
     * 埋点事件名: App线上出房地图找房输入地区查询
     * 埋点时机: 地图找房页 输入小区/商圈/地铁后请求接口时触发
     */
    public static class AppSOLMapInputAreaSearch extends Tracking {

        public AppSOLMapInputAreaSearch(){
            super.name = "App_SOL_Map_InputArea_Search";
        }

         //属性名: 搜索词
         public AppSOLMapInputAreaSearch searchText(Object search_text) {
         mParams.put("search_text", search_text);
         return this;
         }

         //属性名: 搜索词性
         public AppSOLMapInputAreaSearch wordType(Object word_type) {
         mParams.put("word_type", word_type);
         return this;
         }

         //属性名: 商圈
         public AppSOLMapInputAreaSearch block(Object block) {
         mParams.put("block", block);
         return this;
         }

         //属性名: 地铁
         public AppSOLMapInputAreaSearch subway(Object subway) {
         mParams.put("subway", subway);
         return this;
         }

         //属性名: 文本框输入
         public AppSOLMapInputAreaSearch textboxInput(Object textbox_input) {
         mParams.put("textbox_input", textbox_input);
         return this;
         }

    }
    public static AppSOLMapChooseSubwayClick appSOLMapChooseSubwayClick = new AppSOLMapChooseSubwayClick();
    /**
     * 埋点事件名: App线上出房地图找房选择地铁点击
     * 埋点时机: 
     */
    public static class AppSOLMapChooseSubwayClick extends Tracking {

        public AppSOLMapChooseSubwayClick(){
            super.name = "App_SOL_Map_ChooseSubway_Click";
        }

         //属性名: 地铁
         public AppSOLMapChooseSubwayClick subway(Object subway) {
         mParams.put("subway", subway);
         return this;
         }

    }
    public static AppSOLMapScreenOkClick appSOLMapScreenOkClick = new AppSOLMapScreenOkClick();
    /**
     * 埋点事件名: App线上出房地图找房筛选确认点击
     * 埋点时机: 
     */
    public static class AppSOLMapScreenOkClick extends Tracking {

        public AppSOLMapScreenOkClick(){
            super.name = "App_SOL_Map_ScreenOk_Click";
        }

         //属性名: 租赁类型
         public AppSOLMapScreenOkClick rentType(Object rent_type) {
         mParams.put("rent_type", rent_type);
         return this;
         }

         //属性名: 房间数
         public AppSOLMapScreenOkClick bedroomCount(Object bedroom_count) {
         mParams.put("bedroom_count", bedroom_count);
         return this;
         }

         //属性名: 价格
         public AppSOLMapScreenOkClick price(Object price) {
         mParams.put("price", price);
         return this;
         }

         //属性名: 房屋特色
         public AppSOLMapScreenOkClick roomFeatures(Object room_features) {
         mParams.put("room_features", room_features);
         return this;
         }

         //属性名: 风格
         public AppSOLMapScreenOkClick roomStyles(Object room_styles) {
         mParams.put("room_styles", room_styles);
         return this;
         }

         //属性名: 房屋状态
         public AppSOLMapScreenOkClick roomStatus(Object room_status) {
         mParams.put("room_status", room_status);
         return this;
         }

         //属性名: 朝向
         public AppSOLMapScreenOkClick roomFacings(Object room_facings) {
         mParams.put("room_facings", room_facings);
         return this;
         }

         //属性名: 房间面积
         public AppSOLMapScreenOkClick roomArea(Object room_area) {
         mParams.put("room_area", room_area);
         return this;
         }

         //属性名: 入住时间
         public AppSOLMapScreenOkClick rentTime(Object rent_time) {
         mParams.put("rent_time", rent_time);
         return this;
         }

         //属性名: 模块类型
         public AppSOLMapScreenOkClick modeType(Object mode_type) {
         mParams.put("mode_type", mode_type);
         return this;
         }

    }
    public static AppSOLRoomDetailPageInfo appSOLRoomDetailPageInfo = new AppSOLRoomDetailPageInfo();
    /**
     * 埋点事件名: App线上出房房源详情页面信息
     * 埋点时机: 
     */
    public static class AppSOLRoomDetailPageInfo extends Tracking {

        public AppSOLRoomDetailPageInfo(){
            super.name = "App_SOL_RoomDetailPage_Info";
        }

         //属性名: 房源编码
         public AppSOLRoomDetailPageInfo housedelId(Object housedel_id) {
         mParams.put("housedel_id", housedel_id);
         return this;
         }

         //属性名: 来源类型
         public AppSOLRoomDetailPageInfo sourceType(Object source_type) {
         mParams.put("source_type", source_type);
         return this;
         }

         //属性名: 户型
         public AppSOLRoomDetailPageInfo houseType(Object house_type) {
         mParams.put("house_type", house_type);
         return this;
         }

         //属性名: 小区名称
         public AppSOLRoomDetailPageInfo resblockName(Object resblock_name) {
         mParams.put("resblock_name", resblock_name);
         return this;
         }

         //属性名: 房屋类型
         public AppSOLRoomDetailPageInfo houseRentway(Object house_rentway) {
         mParams.put("house_rentway", house_rentway);
         return this;
         }

         //属性名: 商圈
         public AppSOLRoomDetailPageInfo businessCircle(Object business_circle) {
         mParams.put("business_circle", business_circle);
         return this;
         }

         //属性名: 待确认
         public AppSOLRoomDetailPageInfo paymentWay(Object payment_way) {
         mParams.put("payment_way", payment_way);
         return this;
         }

         //属性名: 是否月租
         public AppSOLRoomDetailPageInfo isMonthlyRent(Object is_monthly_rent) {
         mParams.put("is_monthly_rent", is_monthly_rent);
         return this;
         }

         //属性名: 活动价
         public AppSOLRoomDetailPageInfo activityPrice(Object activity_price) {
         mParams.put("activity_price", activity_price);
         return this;
         }

         //属性名: 原价
         public AppSOLRoomDetailPageInfo originalPrice(Object original_price) {
         mParams.put("original_price", original_price);
         return this;
         }

         //属性名: 房间面积
         public AppSOLRoomDetailPageInfo houseArea(Object house_area) {
         mParams.put("house_area", house_area);
         return this;
         }

         //属性名: 活动名称
         public AppSOLRoomDetailPageInfo activityName(Object activity_name) {
         mParams.put("activity_name", activity_name);
         return this;
         }

         //属性名: 通勤地址
         public AppSOLRoomDetailPageInfo commuteAddress(Object commute_address) {
         mParams.put("commute_address", commute_address);
         return this;
         }

         //属性名: 通勤时长
         public AppSOLRoomDetailPageInfo commuteDuration(Object commute_duration) {
         mParams.put("commute_duration", commute_duration);
         return this;
         }

         //属性名: 通勤方式
         public AppSOLRoomDetailPageInfo commuteMethod(Object commute_method) {
         mParams.put("commute_method", commute_method);
         return this;
         }

    }
    public static AppSOLRoomListSearchNoResultCallUpSuccess appSOLRoomListSearchNoResultCallUpSuccess = new AppSOLRoomListSearchNoResultCallUpSuccess();
    /**
     * 埋点事件名: APP线上出房房源列表搜索无结果电话咨询唤起拨号成功
     * 埋点时机: 
     */
    public static class AppSOLRoomListSearchNoResultCallUpSuccess extends Tracking {

        public AppSOLRoomListSearchNoResultCallUpSuccess(){
            super.name = "App_SOL_RoomList_SearchNoResultCallUp_Success";
        }


    }
    public static APPSOLRoomDetailIconCallUpSuccess aPPSOLRoomDetailIconCallUpSuccess = new APPSOLRoomDetailIconCallUpSuccess();
    /**
     * 埋点事件名: APP线上出房房源详情页图片下面的电话咨询唤起拨号成功
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailIconCallUpSuccess extends Tracking {

        public APPSOLRoomDetailIconCallUpSuccess(){
            super.name = "APP_SOL_RoomDetail_IconCallUp_Success";
        }

         //属性名: 房源编码
         public APPSOLRoomDetailIconCallUpSuccess roomCode(Object room_code) {
         mParams.put("room_code", room_code);
         return this;
         }

    }
    public static APPSOLRoomDetailDkgjCallUpSuccess aPPSOLRoomDetailDkgjCallUpSuccess = new APPSOLRoomDetailDkgjCallUpSuccess();
    /**
     * 埋点事件名: APP线上出房房源详情页蛋壳管家电话咨询唤起拨号成功
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailDkgjCallUpSuccess extends Tracking {

        public APPSOLRoomDetailDkgjCallUpSuccess(){
            super.name = "APP_SOL_RoomDetail_DkgjCallUp_Success";
        }

         //属性名: 房源编码
         public APPSOLRoomDetailDkgjCallUpSuccess roomCode(Object room_code) {
         mParams.put("room_code", room_code);
         return this;
         }

    }
    public static APPSOLRoomDetailBottomCallUpSuccess aPPSOLRoomDetailBottomCallUpSuccess = new APPSOLRoomDetailBottomCallUpSuccess();
    /**
     * 埋点事件名: APP线上出房房源详情页底部电话咨询唤起拨号成功
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailBottomCallUpSuccess extends Tracking {

        public APPSOLRoomDetailBottomCallUpSuccess(){
            super.name = "APP_SOL_RoomDetail_BottomCallUp_Success";
        }

         //属性名: 房源编码
         public APPSOLRoomDetailBottomCallUpSuccess roomCode(Object room_code) {
         mParams.put("room_code", room_code);
         return this;
         }

    }
    public static APPSOLRoomImageDetailBottomCallUpSuccess aPPSOLRoomImageDetailBottomCallUpSuccess = new APPSOLRoomImageDetailBottomCallUpSuccess();
    /**
     * 埋点事件名: APP线上出房房源图片详情页底部电话咨询唤起拨号成功
     * 埋点时机: 
     */
    public static class APPSOLRoomImageDetailBottomCallUpSuccess extends Tracking {

        public APPSOLRoomImageDetailBottomCallUpSuccess(){
            super.name = "APP_SOL_RoomImageDetail_BottomCallUp_Success";
        }

         //属性名: 房源编码
         public APPSOLRoomImageDetailBottomCallUpSuccess roomCode(Object room_code) {
         mParams.put("room_code", room_code);
         return this;
         }

    }
    public static APPSOLRoomMapDetailTopCallUpSuccess aPPSOLRoomMapDetailTopCallUpSuccess = new APPSOLRoomMapDetailTopCallUpSuccess();
    /**
     * 埋点事件名: APP线上出房房源地图周边页顶部电话咨询唤起拨号成功
     * 埋点时机: 
     */
    public static class APPSOLRoomMapDetailTopCallUpSuccess extends Tracking {

        public APPSOLRoomMapDetailTopCallUpSuccess(){
            super.name = "APP_SOL_RoomMapDetail_TopCallUp_Success";
        }

         //属性名: 房源编码
         public APPSOLRoomMapDetailTopCallUpSuccess roomCode(Object room_code) {
         mParams.put("room_code", room_code);
         return this;
         }

    }
    public static APPSOLCommunityMapDetailTopCallSuccess aPPSOLCommunityMapDetailTopCallSuccess = new APPSOLCommunityMapDetailTopCallSuccess();
    /**
     * 埋点事件名: APP线上出房小区图片详情页底部电话咨询唤起拨号成功
     * 埋点时机: 
     */
    public static class APPSOLCommunityMapDetailTopCallSuccess extends Tracking {

        public APPSOLCommunityMapDetailTopCallSuccess(){
            super.name = "APP_SOL_CommunityMapDetail_TopCall_Success";
        }

         //属性名: 小区ID
         public APPSOLCommunityMapDetailTopCallSuccess communityId(Object community_id) {
         mParams.put("community_id", community_id);
         return this;
         }

    }
    public static AppSOLHomeWechatSignupFloatEntrySignUpSuccess appSOLHomeWechatSignupFloatEntrySignUpSuccess = new AppSOLHomeWechatSignupFloatEntrySignUpSuccess();
    /**
     * 埋点事件名: App线上出房首页微信登录浮层窗入口登录成功
     * 埋点时机: 通过首页微信登录浮框入口登录成功时触发
     */
    public static class AppSOLHomeWechatSignupFloatEntrySignUpSuccess extends Tracking {

        public AppSOLHomeWechatSignupFloatEntrySignUpSuccess(){
            super.name = "App_SOL_Home_WechatSignupFloatEntrySignUp_Success";
        }


    }
    public static AppSOLSignupPhoneOneClickBrowe appSOLSignupPhoneOneClickBrowe = new AppSOLSignupPhoneOneClickBrowe();
    /**
     * 埋点事件名: App线上出房登录页手机号一键登录
     * 埋点时机: 打开页面时触发
     */
    public static class AppSOLSignupPhoneOneClickBrowe extends Tracking {

        public AppSOLSignupPhoneOneClickBrowe(){
            super.name = "App_SOL_Signup_PhoneOneClick_Browe";
        }


    }
    public static AppSOLRoomListBetweenRoomBannerClick appSOLRoomListBetweenRoomBannerClick = new AppSOLRoomListBetweenRoomBannerClick();
    /**
     * 埋点事件名: App线上出房房源列表页房源中轮播图点击
     * 埋点时机: 点击控件时触发
     */
    public static class AppSOLRoomListBetweenRoomBannerClick extends Tracking {

        public AppSOLRoomListBetweenRoomBannerClick(){
            super.name = "App_SOL_RoomList_BetweenRoomBanner_Click";
        }

         //属性名: 轮播图位置
         public AppSOLRoomListBetweenRoomBannerClick bannerLocation(Object banner_Location) {
         mParams.put("banner_Location", banner_Location);
         return this;
         }

         //属性名: 内容标题
         public AppSOLRoomListBetweenRoomBannerClick contentTitle(Object content_title) {
         mParams.put("content_title", content_title);
         return this;
         }

         //属性名: 内容跳转地址
         public AppSOLRoomListBetweenRoomBannerClick contentUrl(Object content_url) {
         mParams.put("content_url", content_url);
         return this;
         }

    }
    public static AppSOLStartUpPageClick appSOLStartUpPageClick = new AppSOLStartUpPageClick();
    /**
     * 埋点事件名: App线上出房启动页点击
     * 埋点时机: 点击控件时触发
     */
    public static class AppSOLStartUpPageClick extends Tracking {

        public AppSOLStartUpPageClick(){
            super.name = "App_SOL_StartUpPage_Click";
        }

         //属性名: 内容标题
         public AppSOLStartUpPageClick contentTitle(Object content_title) {
         mParams.put("content_title", content_title);
         return this;
         }

         //属性名: 内容跳转地址
         public AppSOLStartUpPageClick contentUrl(Object content_url) {
         mParams.put("content_url", content_url);
         return this;
         }

    }
    public static AppSOLPersonalCenterTenantCenterBannerClick appSOLPersonalCenterTenantCenterBannerClick = new AppSOLPersonalCenterTenantCenterBannerClick();
    /**
     * 埋点事件名: App线上出房个人中心页租客中心广告位点击
     * 埋点时机: 点击控件时触发
     */
    public static class AppSOLPersonalCenterTenantCenterBannerClick extends Tracking {

        public AppSOLPersonalCenterTenantCenterBannerClick(){
            super.name = "App_SOL_PersonalCenter_TenantCenterBanner_Click";
        }

         //属性名: 轮播图位置
         public AppSOLPersonalCenterTenantCenterBannerClick bannerLocation(Object banner_Location) {
         mParams.put("banner_Location", banner_Location);
         return this;
         }

         //属性名: 内容标题
         public AppSOLPersonalCenterTenantCenterBannerClick contentTitle(Object content_title) {
         mParams.put("content_title", content_title);
         return this;
         }

         //属性名: 内容跳转地址
         public AppSOLPersonalCenterTenantCenterBannerClick contentUrl(Object content_url) {
         mParams.put("content_url", content_url);
         return this;
         }

    }
    public static AppSOLHomePopupClick appSOLHomePopupClick = new AppSOLHomePopupClick();
    /**
     * 埋点事件名: App线上出房首页弹窗点击
     * 埋点时机: 点击控件时触发
     */
    public static class AppSOLHomePopupClick extends Tracking {

        public AppSOLHomePopupClick(){
            super.name = "App_SOL_Home_Popup_Click";
        }

         //属性名: 内容标题
         public AppSOLHomePopupClick contentTitle(Object content_title) {
         mParams.put("content_title", content_title);
         return this;
         }

         //属性名: 内容跳转地址
         public AppSOLHomePopupClick contentUrl(Object content_url) {
         mParams.put("content_url", content_url);
         return this;
         }

    }


}
