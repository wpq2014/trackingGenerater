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
         public AppSOLRoomListBetweenRoomBannerClick bannerLocation(Object banner_location) {
         mParams.put("banner_location", banner_location);
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
    public static AppSOLGuideClick appSOLGuideClick = new AppSOLGuideClick();
    /**
     * 埋点事件名: App线上出房引导页点击
     * 埋点时机: 点击控件时触发
     */
    public static class AppSOLGuideClick extends Tracking {

        public AppSOLGuideClick(){
            super.name = "App_SOL_Guide_Click";
        }

         //属性名: 内容标题
         public AppSOLGuideClick contentTitle(Object content_title) {
         mParams.put("content_title", content_title);
         return this;
         }

         //属性名: 内容跳转地址
         public AppSOLGuideClick contentUrl(Object content_url) {
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
         public AppSOLPersonalCenterTenantCenterBannerClick bannerLocation(Object banner_location) {
         mParams.put("banner_location", banner_location);
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
    public static AppStart appStart = new AppStart();
    /**
     * 埋点事件名: App启动
     * 埋点时机: 
     */
    public static class AppStart extends Tracking {

        public AppStart(){
            super.name = "App_Start";
        }


    }
    public static AppInstall appInstall = new AppInstall();
    /**
     * 埋点事件名: App激活
     * 埋点时机: 
     */
    public static class AppInstall extends Tracking {

        public AppInstall(){
            super.name = "App_Install";
        }


    }
    public static AppSignup appSignup = new AppSignup();
    /**
     * 埋点事件名: App登录
     * 埋点时机: 用户登录成功时触发
     */
    public static class AppSignup extends Tracking {

        public AppSignup(){
            super.name = "App_Signup";
        }

         //属性名: 注册方式
         public AppSignup signUpMethod(Object sign_up_method) {
         mParams.put("sign_up_method", sign_up_method);
         return this;
         }

         //属性名: 是否新用户
         public AppSignup isNewUser(Object is_new_user) {
         mParams.put("is_new_user", is_new_user);
         return this;
         }

    }
    public static AppSOLRoomListSearch appSOLRoomListSearch = new AppSOLRoomListSearch();
    /**
     * 埋点事件名: App线上出房房源列表页查询
     * 埋点时机: 
     */
    public static class AppSOLRoomListSearch extends Tracking {

        public AppSOLRoomListSearch(){
            super.name = "App_SOL_RoomList_Search";
        }

         //属性名: 租赁类型
         public AppSOLRoomListSearch rentType(Object rent_type) {
         mParams.put("rent_type", rent_type);
         return this;
         }

         //属性名: 房间数
         public AppSOLRoomListSearch bedroomCount(Object bedroom_count) {
         mParams.put("bedroom_count", bedroom_count);
         return this;
         }

         //属性名: 搜索词
         public AppSOLRoomListSearch searchText(Object search_text) {
         mParams.put("search_text", search_text);
         return this;
         }

         //属性名: 搜索词性
         public AppSOLRoomListSearch wordType(Object word_type) {
         mParams.put("word_type", word_type);
         return this;
         }

         //属性名: 附近
         public AppSOLRoomListSearch nearBy(Object near_by) {
         mParams.put("near_by", near_by);
         return this;
         }

         //属性名: 商圈
         public AppSOLRoomListSearch block(Object block) {
         mParams.put("block", block);
         return this;
         }

         //属性名: 地铁
         public AppSOLRoomListSearch subway(Object subway) {
         mParams.put("subway", subway);
         return this;
         }

         //属性名: 区
         public AppSOLRoomListSearch district(Object district) {
         mParams.put("district", district);
         return this;
         }

         //属性名: 价格
         public AppSOLRoomListSearch price(Object price) {
         mParams.put("price", price);
         return this;
         }

         //属性名: 房屋特色
         public AppSOLRoomListSearch roomFeatures(Object room_features) {
         mParams.put("room_features", room_features);
         return this;
         }

         //属性名: 风格
         public AppSOLRoomListSearch roomStyles(Object room_styles) {
         mParams.put("room_styles", room_styles);
         return this;
         }

         //属性名: 房屋状态
         public AppSOLRoomListSearch roomStatus(Object room_status) {
         mParams.put("room_status", room_status);
         return this;
         }

         //属性名: 朝向
         public AppSOLRoomListSearch roomFacings(Object room_facings) {
         mParams.put("room_facings", room_facings);
         return this;
         }

         //属性名: 房间面积
         public AppSOLRoomListSearch roomArea(Object room_area) {
         mParams.put("room_area", room_area);
         return this;
         }

         //属性名: 入住时间
         public AppSOLRoomListSearch rentTime(Object rent_time) {
         mParams.put("rent_time", rent_time);
         return this;
         }

         //属性名: 搜索的session_id
         public AppSOLRoomListSearch searchSessionId(Object search_session_id) {
         mParams.put("search_session_id", search_session_id);
         return this;
         }

         //属性名: 搜索的method_id
         public AppSOLRoomListSearch searchMethodId(Object search_method_id) {
         mParams.put("search_method_id", search_method_id);
         return this;
         }

         //属性名: 文本框输入
         public AppSOLRoomListSearch textboxInput(Object textbox_input) {
         mParams.put("textbox_input", textbox_input);
         return this;
         }

         //属性名: 查询方式
         public AppSOLRoomListSearch searchMethod(Object search_method) {
         mParams.put("search_method", search_method);
         return this;
         }

    }
    public static AppSOLRoomListSearchResult appSOLRoomListSearchResult = new AppSOLRoomListSearchResult();
    /**
     * 埋点事件名: App线上出房房源列表页查询结果
     * 埋点时机: 
     */
    public static class AppSOLRoomListSearchResult extends Tracking {

        public AppSOLRoomListSearchResult(){
            super.name = "App_SOL_RoomList_Search_Result";
        }

         //属性名: 租赁类型
         public AppSOLRoomListSearchResult rentType(Object rent_type) {
         mParams.put("rent_type", rent_type);
         return this;
         }

         //属性名: 房间数
         public AppSOLRoomListSearchResult bedroomCount(Object bedroom_count) {
         mParams.put("bedroom_count", bedroom_count);
         return this;
         }

         //属性名: 搜索词
         public AppSOLRoomListSearchResult searchText(Object search_text) {
         mParams.put("search_text", search_text);
         return this;
         }

         //属性名: 搜索词性
         public AppSOLRoomListSearchResult wordType(Object word_type) {
         mParams.put("word_type", word_type);
         return this;
         }

         //属性名: 附近
         public AppSOLRoomListSearchResult nearBy(Object near_by) {
         mParams.put("near_by", near_by);
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
         public AppSOLRoomListSearchResult roomFeatures(Object room_features) {
         mParams.put("room_features", room_features);
         return this;
         }

         //属性名: 风格
         public AppSOLRoomListSearchResult roomStyles(Object room_styles) {
         mParams.put("room_styles", room_styles);
         return this;
         }

         //属性名: 房屋状态
         public AppSOLRoomListSearchResult roomStatus(Object room_status) {
         mParams.put("room_status", room_status);
         return this;
         }

         //属性名: 朝向
         public AppSOLRoomListSearchResult roomFacings(Object room_facings) {
         mParams.put("room_facings", room_facings);
         return this;
         }

         //属性名: 房间面积
         public AppSOLRoomListSearchResult roomArea(Object room_area) {
         mParams.put("room_area", room_area);
         return this;
         }

         //属性名: 入住时间
         public AppSOLRoomListSearchResult rentTime(Object rent_time) {
         mParams.put("rent_time", rent_time);
         return this;
         }

         //属性名: 搜索的session_id
         public AppSOLRoomListSearchResult searchSessionId(Object search_session_id) {
         mParams.put("search_session_id", search_session_id);
         return this;
         }

         //属性名: 搜索的method_id
         public AppSOLRoomListSearchResult searchMethodId(Object search_method_id) {
         mParams.put("search_method_id", search_method_id);
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

         //属性名: 查询方式
         public AppSOLRoomListSearchResult searchMethod(Object search_method) {
         mParams.put("search_method", search_method);
         return this;
         }

    }
    public static AppSOLMapInputAreaSearch appSOLMapInputAreaSearch = new AppSOLMapInputAreaSearch();
    /**
     * 埋点事件名: App线上出房地图找房输入地区查询
     * 埋点时机: 点击控件时触发
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

         //属性名: 查询方式
         public AppSOLMapInputAreaSearch searchMethod(Object search_method) {
         mParams.put("search_method", search_method);
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
    public static AppSOLMapCommunityClick appSOLMapCommunityClick = new AppSOLMapCommunityClick();
    /**
     * 埋点事件名: App线上出房地图找房小区点击
     * 埋点时机: 
     */
    public static class AppSOLMapCommunityClick extends Tracking {

        public AppSOLMapCommunityClick(){
            super.name = "App_SOL_Map_Community_Click";
        }

         //属性名: 是否有上新
         public AppSOLMapCommunityClick isNew(Object is_new) {
         mParams.put("is_new", is_new);
         return this;
         }

         //属性名: 是否足迹
         public AppSOLMapCommunityClick isFootprint(Object is_footprint) {
         mParams.put("is_footprint", is_footprint);
         return this;
         }

         //属性名: 模块类型
         public AppSOLMapCommunityClick modeType(Object mode_type) {
         mParams.put("mode_type", mode_type);
         return this;
         }

         //属性名: 小区名称
         public AppSOLMapCommunityClick community(Object community) {
         mParams.put("community", community);
         return this;
         }

    }
    public static AppSOLMapCommunityOnConcernClick appSOLMapCommunityOnConcernClick = new AppSOLMapCommunityOnConcernClick();
    /**
     * 埋点事件名: App线上出房地图找房小区关注点击
     * 埋点时机: 
     */
    public static class AppSOLMapCommunityOnConcernClick extends Tracking {

        public AppSOLMapCommunityOnConcernClick(){
            super.name = "App_SOL_Map_CommunityOnConcern_Click";
        }

         //属性名: 小区名称
         public AppSOLMapCommunityOnConcernClick community(Object community) {
         mParams.put("community", community);
         return this;
         }

    }
    public static AppSOLMapCommunityOffConcernClick appSOLMapCommunityOffConcernClick = new AppSOLMapCommunityOffConcernClick();
    /**
     * 埋点事件名: App线上出房地图找房小区取关点击
     * 埋点时机: 
     */
    public static class AppSOLMapCommunityOffConcernClick extends Tracking {

        public AppSOLMapCommunityOffConcernClick(){
            super.name = "App_SOL_Map_CommunityOffConcern_Click";
        }

         //属性名: 小区名称
         public AppSOLMapCommunityOffConcernClick community(Object community) {
         mParams.put("community", community);
         return this;
         }

    }
    public static AppSOLMapCommunityDetailClick appSOLMapCommunityDetailClick = new AppSOLMapCommunityDetailClick();
    /**
     * 埋点事件名: App线上出房地图找房小区详情点击
     * 埋点时机: 
     */
    public static class AppSOLMapCommunityDetailClick extends Tracking {

        public AppSOLMapCommunityDetailClick(){
            super.name = "App_SOL_Map_CommunityDetail_Click";
        }

         //属性名: 小区名称
         public AppSOLMapCommunityDetailClick community(Object community) {
         mParams.put("community", community);
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
            super.name = "App_SOL_RoomDetail_PageInfo";
        }

         //属性名: 房源编码
         public AppSOLRoomDetailPageInfo roomCode(Object room_code) {
         mParams.put("room_code", room_code);
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
         public AppSOLRoomDetailPageInfo community(Object community) {
         mParams.put("community", community);
         return this;
         }

         //属性名: 房屋类型
         public AppSOLRoomDetailPageInfo rentType(Object rent_type) {
         mParams.put("rent_type", rent_type);
         return this;
         }

         //属性名: 商圈
         public AppSOLRoomDetailPageInfo block(Object block) {
         mParams.put("block", block);
         return this;
         }

         //属性名: 待确认
         public AppSOLRoomDetailPageInfo paymentWay(Object payment_way) {
         mParams.put("payment_way", payment_way);
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
         public AppSOLRoomDetailPageInfo roomArea(Object room_area) {
         mParams.put("room_area", room_area);
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
    public static AppSOLRoomListSearchNoResultCallClick appSOLRoomListSearchNoResultCallClick = new AppSOLRoomListSearchNoResultCallClick();
    /**
     * 埋点事件名: APP线上出房房源列表搜索无结果电话咨询点击
     * 埋点时机: 
     */
    public static class AppSOLRoomListSearchNoResultCallClick extends Tracking {

        public AppSOLRoomListSearchNoResultCallClick(){
            super.name = "App_SOL_RoomList_SearchNoResultCall_Click";
        }


    }
    public static AppSOLRoomListSearchNoResultCallSuccess appSOLRoomListSearchNoResultCallSuccess = new AppSOLRoomListSearchNoResultCallSuccess();
    /**
     * 埋点事件名: APP线上出房房源列表搜索无结果电话咨询点击成功
     * 埋点时机: 
     */
    public static class AppSOLRoomListSearchNoResultCallSuccess extends Tracking {

        public AppSOLRoomListSearchNoResultCallSuccess(){
            super.name = "App_SOL_RoomList_SearchNoResultCall_Success";
        }


    }
    public static AppSOLRoomListSearchNoResultAppointClick appSOLRoomListSearchNoResultAppointClick = new AppSOLRoomListSearchNoResultAppointClick();
    /**
     * 埋点事件名: APP线上出房房源列表搜索无结果预约看房点击
     * 埋点时机: 
     */
    public static class AppSOLRoomListSearchNoResultAppointClick extends Tracking {

        public AppSOLRoomListSearchNoResultAppointClick(){
            super.name = "App_SOL_RoomList_SearchNoResultAppoint_Click";
        }


    }
    public static AppSOLRoomListSearchNoResultAppointSuccess appSOLRoomListSearchNoResultAppointSuccess = new AppSOLRoomListSearchNoResultAppointSuccess();
    /**
     * 埋点事件名: APP线上出房房源列表搜索无结果预约看房提交成功
     * 埋点时机: 
     */
    public static class AppSOLRoomListSearchNoResultAppointSuccess extends Tracking {

        public AppSOLRoomListSearchNoResultAppointSuccess(){
            super.name = "App_SOL_RoomList_SearchNoResultAppoint_Success";
        }


    }
    public static APPSOLRoomDetailIconCallClick aPPSOLRoomDetailIconCallClick = new APPSOLRoomDetailIconCallClick();
    /**
     * 埋点事件名: APP线上出房房源详情页图片下面的电话咨询图标点击
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailIconCallClick extends Tracking {

        public APPSOLRoomDetailIconCallClick(){
            super.name = "APP_SOL_RoomDetail_IconCall_Click";
        }


    }
    public static APPSOLRoomDetailIconCallSuccess aPPSOLRoomDetailIconCallSuccess = new APPSOLRoomDetailIconCallSuccess();
    /**
     * 埋点事件名: APP线上出房房源详情页图片下面的电话咨询图标点击成功
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailIconCallSuccess extends Tracking {

        public APPSOLRoomDetailIconCallSuccess(){
            super.name = "APP_SOL_RoomDetail_IconCall_Success";
        }


    }
    public static APPSOLRoomDetailDkgjCallClick aPPSOLRoomDetailDkgjCallClick = new APPSOLRoomDetailDkgjCallClick();
    /**
     * 埋点事件名: APP线上出房房源详情页蛋壳管家电话咨询点击
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailDkgjCallClick extends Tracking {

        public APPSOLRoomDetailDkgjCallClick(){
            super.name = "APP_SOL_RoomDetail_DkgjCall_Click";
        }


    }
    public static APPSOLRoomDetailDkgjCallSuccess aPPSOLRoomDetailDkgjCallSuccess = new APPSOLRoomDetailDkgjCallSuccess();
    /**
     * 埋点事件名: APP线上出房房源详情页蛋壳管家电话咨询点击成功
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailDkgjCallSuccess extends Tracking {

        public APPSOLRoomDetailDkgjCallSuccess(){
            super.name = "APP_SOL_RoomDetail_DkgjCall_Success";
        }


    }
    public static APPSOLRoomDetailBottomCallClick aPPSOLRoomDetailBottomCallClick = new APPSOLRoomDetailBottomCallClick();
    /**
     * 埋点事件名: APP线上出房房源详情页底部电话咨询点击
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailBottomCallClick extends Tracking {

        public APPSOLRoomDetailBottomCallClick(){
            super.name = "APP_SOL_RoomDetail_BottomCall_Click";
        }


    }
    public static APPSOLRoomDetailBottomCallSuccess aPPSOLRoomDetailBottomCallSuccess = new APPSOLRoomDetailBottomCallSuccess();
    /**
     * 埋点事件名: APP线上出房房源详情页底部电话咨询成功
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailBottomCallSuccess extends Tracking {

        public APPSOLRoomDetailBottomCallSuccess(){
            super.name = "APP_SOL_RoomDetail_BottomCall_Success";
        }


    }
    public static APPSOLRoomDetailBottomAppointClick aPPSOLRoomDetailBottomAppointClick = new APPSOLRoomDetailBottomAppointClick();
    /**
     * 埋点事件名: APP线上出房房源详情页底部预约看房点击
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailBottomAppointClick extends Tracking {

        public APPSOLRoomDetailBottomAppointClick(){
            super.name = "APP_SOL_RoomDetail_BottomAppoint_Click";
        }


    }
    public static APPSOLRoomDetailBottomAppointChooseTimeClick aPPSOLRoomDetailBottomAppointChooseTimeClick = new APPSOLRoomDetailBottomAppointChooseTimeClick();
    /**
     * 埋点事件名: APP线上出房房源详情页底部预约看房选择时间点击
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailBottomAppointChooseTimeClick extends Tracking {

        public APPSOLRoomDetailBottomAppointChooseTimeClick(){
            super.name = "APP_SOL_RoomDetail_BottomAppointChooseTime_Click";
        }


    }
    public static APPSOLRoomDetailBottomAppointSuccess aPPSOLRoomDetailBottomAppointSuccess = new APPSOLRoomDetailBottomAppointSuccess();
    /**
     * 埋点事件名: APP线上出房房源详情页预约看房提交成功
     * 埋点时机: 
     */
    public static class APPSOLRoomDetailBottomAppointSuccess extends Tracking {

        public APPSOLRoomDetailBottomAppointSuccess(){
            super.name = "APP_SOL_RoomDetail_BottomAppoint_Success";
        }


    }
    public static APPSOLRoomImageDetailBottomCallClick aPPSOLRoomImageDetailBottomCallClick = new APPSOLRoomImageDetailBottomCallClick();
    /**
     * 埋点事件名: APP线上出房房源图片详情页底部电话咨询点击
     * 埋点时机: 
     */
    public static class APPSOLRoomImageDetailBottomCallClick extends Tracking {

        public APPSOLRoomImageDetailBottomCallClick(){
            super.name = "APP_SOL_RoomImageDetail_BottomCall_Click";
        }


    }
    public static APPSOLRoomImageDetailBottomCallSuccess aPPSOLRoomImageDetailBottomCallSuccess = new APPSOLRoomImageDetailBottomCallSuccess();
    /**
     * 埋点事件名: APP线上出房房源图片详情页底部电话咨询成功
     * 埋点时机: 
     */
    public static class APPSOLRoomImageDetailBottomCallSuccess extends Tracking {

        public APPSOLRoomImageDetailBottomCallSuccess(){
            super.name = "APP_SOL_RoomImageDetail_BottomCall_Success";
        }


    }
    public static APPSOLRoomImageDetailBottomAppointClick aPPSOLRoomImageDetailBottomAppointClick = new APPSOLRoomImageDetailBottomAppointClick();
    /**
     * 埋点事件名: APP线上出房房源图片详情页底部预约看房按钮
     * 埋点时机: 
     */
    public static class APPSOLRoomImageDetailBottomAppointClick extends Tracking {

        public APPSOLRoomImageDetailBottomAppointClick(){
            super.name = "APP_SOL_RoomImageDetail_BottomAppoint_Click";
        }


    }
    public static APPSOLRoomImageDetailBottomAppointChooseTimeClick aPPSOLRoomImageDetailBottomAppointChooseTimeClick = new APPSOLRoomImageDetailBottomAppointChooseTimeClick();
    /**
     * 埋点事件名: APP线上出房房源图片详情页底部预约看房选择时间点击
     * 埋点时机: 
     */
    public static class APPSOLRoomImageDetailBottomAppointChooseTimeClick extends Tracking {

        public APPSOLRoomImageDetailBottomAppointChooseTimeClick(){
            super.name = "APP_SOL_RoomImageDetail_BottomAppointChooseTime_Click";
        }


    }
    public static APPSOLRoomImageDetailBottomAppointSuccess aPPSOLRoomImageDetailBottomAppointSuccess = new APPSOLRoomImageDetailBottomAppointSuccess();
    /**
     * 埋点事件名: APP线上出房房源图片详情页底部预约看房成功
     * 埋点时机: 
     */
    public static class APPSOLRoomImageDetailBottomAppointSuccess extends Tracking {

        public APPSOLRoomImageDetailBottomAppointSuccess(){
            super.name = "APP_SOL_RoomImageDetail_BottomAppoint_Success";
        }


    }
    public static APPSOLRoomMapDetailTopCallClick aPPSOLRoomMapDetailTopCallClick = new APPSOLRoomMapDetailTopCallClick();
    /**
     * 埋点事件名: APP线上出房房源地图周边页顶部电话咨询按钮
     * 埋点时机: 
     */
    public static class APPSOLRoomMapDetailTopCallClick extends Tracking {

        public APPSOLRoomMapDetailTopCallClick(){
            super.name = "APP_SOL_RoomMapDetail_TopCall_Click";
        }


    }
    public static APPSOLRoomMapDetailTopCallSuccess aPPSOLRoomMapDetailTopCallSuccess = new APPSOLRoomMapDetailTopCallSuccess();
    /**
     * 埋点事件名: APP线上出房房源地图周边页顶部电话咨询成功
     * 埋点时机: 
     */
    public static class APPSOLRoomMapDetailTopCallSuccess extends Tracking {

        public APPSOLRoomMapDetailTopCallSuccess(){
            super.name = "APP_SOL_RoomMapDetail_TopCall_Success";
        }


    }
    public static APPSOLCommunityMapDetailTopCallClick aPPSOLCommunityMapDetailTopCallClick = new APPSOLCommunityMapDetailTopCallClick();
    /**
     * 埋点事件名: APP线上出房小区图片详情页底部电话咨询点击
     * 埋点时机: 
     */
    public static class APPSOLCommunityMapDetailTopCallClick extends Tracking {

        public APPSOLCommunityMapDetailTopCallClick(){
            super.name = "APP_SOL_CommunityMapDetail_TopCall_Click";
        }


    }
    public static APPSOLCommunityMapDetailTopCallSuccess aPPSOLCommunityMapDetailTopCallSuccess = new APPSOLCommunityMapDetailTopCallSuccess();
    /**
     * 埋点事件名: APP线上出房小区图片详情页底部电话咨询成功
     * 埋点时机: 
     */
    public static class APPSOLCommunityMapDetailTopCallSuccess extends Tracking {

        public APPSOLCommunityMapDetailTopCallSuccess(){
            super.name = "APP_SOL_CommunityMapDetail_TopCall_Success";
        }


    }
    public static APPSOLCommunityMapDetailBottomAppointClick aPPSOLCommunityMapDetailBottomAppointClick = new APPSOLCommunityMapDetailBottomAppointClick();
    /**
     * 埋点事件名: APP线上出房小区图片详情页底部预约看房按钮
     * 埋点时机: 
     */
    public static class APPSOLCommunityMapDetailBottomAppointClick extends Tracking {

        public APPSOLCommunityMapDetailBottomAppointClick(){
            super.name = "APP_SOL_CommunityMapDetail_BottomAppoint_Click";
        }


    }
    public static APPSOLCommunityMapDetailBottomAppointChooseTimeClick aPPSOLCommunityMapDetailBottomAppointChooseTimeClick = new APPSOLCommunityMapDetailBottomAppointChooseTimeClick();
    /**
     * 埋点事件名: APP线上出房小区图片详情页底部预约看房选择时间点击
     * 埋点时机: 
     */
    public static class APPSOLCommunityMapDetailBottomAppointChooseTimeClick extends Tracking {

        public APPSOLCommunityMapDetailBottomAppointChooseTimeClick(){
            super.name = "APP_SOL_CommunityMapDetail_BottomAppointChooseTime_Click";
        }


    }
    public static APPSOLCommunityMapDetailBottomAppointSuccess aPPSOLCommunityMapDetailBottomAppointSuccess = new APPSOLCommunityMapDetailBottomAppointSuccess();
    /**
     * 埋点事件名: APP线上出房小区图片详情页底部预约看房成功
     * 埋点时机: 
     */
    public static class APPSOLCommunityMapDetailBottomAppointSuccess extends Tracking {

        public APPSOLCommunityMapDetailBottomAppointSuccess(){
            super.name = "APP_SOL_CommunityMapDetail_BottomAppoint_Success";
        }


    }
    public static APPSOLFootPrintListRoomAppointClick aPPSOLFootPrintListRoomAppointClick = new APPSOLFootPrintListRoomAppointClick();
    /**
     * 埋点事件名: APP线上出房足迹列表页房源预约看房点击
     * 埋点时机: 
     */
    public static class APPSOLFootPrintListRoomAppointClick extends Tracking {

        public APPSOLFootPrintListRoomAppointClick(){
            super.name = "APP_SOL_FootPrintList_RoomAppoint_Click";
        }


    }
    public static APPSOLFootPrintListRoomAppointChooseTimeClick aPPSOLFootPrintListRoomAppointChooseTimeClick = new APPSOLFootPrintListRoomAppointChooseTimeClick();
    /**
     * 埋点事件名: APP线上出房足迹列表页房源预约看房选择时间点击
     * 埋点时机: 
     */
    public static class APPSOLFootPrintListRoomAppointChooseTimeClick extends Tracking {

        public APPSOLFootPrintListRoomAppointChooseTimeClick(){
            super.name = "APP_SOL_FootPrintList_RoomAppointChooseTime_Click";
        }


    }


}
