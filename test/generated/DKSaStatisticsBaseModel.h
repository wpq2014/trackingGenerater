// this is auto generated file, never change it by hand

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface DKSaStatisticsBaseModel : NSObject

/// 事件名字
@property (nonatomic, copy) NSString *eventName;

@end

//埋点事件名: App线上出房房源列表页查询结果
//埋点时机: 房源列表页搜索请求返回结果时触发
@interface DKAppSOLRoomListSearchResultModel : DKSaStatisticsBaseModel
//属性名: 租赁类型
@property (nonatomic, copy) NSString *rentType;
//属性名: 房间数
@property (nonatomic, copy) NSString *bedroomCount;
//属性名: 搜索词
@property (nonatomic, copy) NSString *searchText;
//属性名: 搜索词性
@property (nonatomic, copy) NSString *wordType;
//属性名: 附近
@property (nonatomic, copy) NSString *nearby;
//属性名: 商圈
@property (nonatomic, copy) NSString *block;
//属性名: 地铁
@property (nonatomic, copy) NSString *subway;
//属性名: 价格
@property (nonatomic, copy) NSString *price;
//属性名: 房屋特色
@property (nonatomic, copy) NSString *roomFeatures;
//属性名: 风格
@property (nonatomic, copy) NSString *styles;
//属性名: 房屋状态
@property (nonatomic, copy) NSString *status;
//属性名: 朝向
@property (nonatomic, copy) NSString *facings;
//属性名: 房间面积
@property (nonatomic, copy) NSString *areaLevels;
//属性名: 入住时间
@property (nonatomic, copy) NSString *rentTime;
//属性名: 文本框输入
@property (nonatomic, copy) NSString *textbox_input;
//属性名: 返回结果
@property (nonatomic, copy) NSString *result_code;
@end

//埋点事件名: App线上出房地图找房输入地区查询
//埋点时机: 地图找房页 输入小区/商圈/地铁后请求接口时触发
@interface DKAppSOLMapInputAreaSearchModel : DKSaStatisticsBaseModel
//属性名: 搜索词
@property (nonatomic, copy) NSString *search_text;
//属性名: 搜索词性
@property (nonatomic, copy) NSString *word_type;
//属性名: 商圈
@property (nonatomic, copy) NSString *block;
//属性名: 地铁
@property (nonatomic, copy) NSString *subway;
//属性名: 文本框输入
@property (nonatomic, copy) NSString *textbox_input;
@end

//埋点事件名: App线上出房地图找房选择地铁点击
//埋点时机: 
@interface DKAppSOLMapChooseSubwayClickModel : DKSaStatisticsBaseModel
//属性名: 地铁
@property (nonatomic, copy) NSString *subway;
@end

//埋点事件名: App线上出房地图找房筛选确认点击
//埋点时机: 
@interface DKAppSOLMapScreenOkClickModel : DKSaStatisticsBaseModel
//属性名: 租赁类型
@property (nonatomic, copy) NSString *rent_type;
//属性名: 房间数
@property (nonatomic, copy) NSString *bedroom_count;
//属性名: 价格
@property (nonatomic, copy) NSString *price;
//属性名: 房屋特色
@property (nonatomic, copy) NSString *room_features;
//属性名: 风格
@property (nonatomic, copy) NSString *room_styles;
//属性名: 房屋状态
@property (nonatomic, copy) NSString *room_status;
//属性名: 朝向
@property (nonatomic, copy) NSString *room_facings;
//属性名: 房间面积
@property (nonatomic, copy) NSString *room_area;
//属性名: 入住时间
@property (nonatomic, copy) NSString *rent_time;
//属性名: 模块类型
@property (nonatomic, copy) NSString *mode_type;
@end

//埋点事件名: App线上出房房源详情页面信息
//埋点时机: 
@interface DKAppSOLRoomDetailPageInfoModel : DKSaStatisticsBaseModel
//属性名: 房源编码
@property (nonatomic, copy) NSString *housedel_id;
//属性名: 来源类型
@property (nonatomic, copy) NSString *source_type;
//属性名: 户型
@property (nonatomic, copy) NSString *house_type;
//属性名: 小区名称
@property (nonatomic, copy) NSString *resblock_name;
//属性名: 房屋类型
@property (nonatomic, copy) NSString *house_rentway;
//属性名: 商圈
@property (nonatomic, copy) NSString *business_circle;
//属性名: 待确认
@property (nonatomic, copy) NSString *payment_way;
//属性名: 是否月租
@property (nonatomic, copy) NSString *is_monthly_rent;
//属性名: 活动价
@property (nonatomic, copy) NSString *activity_price;
//属性名: 原价
@property (nonatomic, copy) NSString *original_price;
//属性名: 房间面积
@property (nonatomic, copy) NSString *house_area;
//属性名: 活动名称
@property (nonatomic, copy) NSString *activity_name;
//属性名: 通勤地址
@property (nonatomic, copy) NSString *commute_address;
//属性名: 通勤时长
@property (nonatomic, copy) NSString *commute_duration;
//属性名: 通勤方式
@property (nonatomic, copy) NSString *commute_method;
@end

//埋点事件名: APP线上出房房源列表搜索无结果电话咨询唤起拨号成功
//埋点时机: 
@interface DKAppSOLRoomListSearchNoResultCallUpSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源详情页图片下面的电话咨询唤起拨号成功
//埋点时机: 
@interface DKAPPSOLRoomDetailIconCallUpSuccessModel : DKSaStatisticsBaseModel
//属性名: 房源编码
@property (nonatomic, copy) NSString *room_code;
@end

//埋点事件名: APP线上出房房源详情页蛋壳管家电话咨询唤起拨号成功
//埋点时机: 
@interface DKAPPSOLRoomDetailDkgjCallUpSuccessModel : DKSaStatisticsBaseModel
//属性名: 房源编码
@property (nonatomic, copy) NSString *room_code;
@end

//埋点事件名: APP线上出房房源详情页底部电话咨询唤起拨号成功
//埋点时机: 
@interface DKAPPSOLRoomDetailBottomCallUpSuccessModel : DKSaStatisticsBaseModel
//属性名: 房源编码
@property (nonatomic, copy) NSString *room_code;
@end

//埋点事件名: APP线上出房房源图片详情页底部电话咨询唤起拨号成功
//埋点时机: 
@interface DKAPPSOLRoomImageDetailBottomCallUpSuccessModel : DKSaStatisticsBaseModel
//属性名: 房源编码
@property (nonatomic, copy) NSString *room_code;
@end

//埋点事件名: APP线上出房房源地图周边页顶部电话咨询唤起拨号成功
//埋点时机: 
@interface DKAPPSOLRoomMapDetailTopCallUpSuccessModel : DKSaStatisticsBaseModel
//属性名: 房源编码
@property (nonatomic, copy) NSString *room_code;
@end

//埋点事件名: APP线上出房小区图片详情页底部电话咨询唤起拨号成功
//埋点时机: 
@interface DKAPPSOLCommunityMapDetailTopCallSuccessModel : DKSaStatisticsBaseModel
//属性名: 小区ID
@property (nonatomic, copy) NSString *community_id;
@end

//埋点事件名: App线上出房首页微信登录浮层窗入口登录成功
//埋点时机: 通过首页微信登录浮框入口登录成功时触发
@interface DKAppSOLHomeWechatSignupFloatEntrySignUpSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: App线上出房登录页手机号一键登录
//埋点时机: 打开页面时触发
@interface DKAppSOLSignupPhoneOneClickBroweModel : DKSaStatisticsBaseModel
@end

//埋点事件名: App线上出房房源列表页房源中轮播图点击
//埋点时机: 点击控件时触发
@interface DKAppSOLRoomListBetweenRoomBannerClickModel : DKSaStatisticsBaseModel
//属性名: 轮播图位置
@property (nonatomic, copy) NSString *banner_Location;
//属性名: 内容标题
@property (nonatomic, copy) NSString *content_title;
//属性名: 内容跳转地址
@property (nonatomic, copy) NSString *content_url;
@end

//埋点事件名: App线上出房启动页点击
//埋点时机: 点击控件时触发
@interface DKAppSOLStartUpPageClickModel : DKSaStatisticsBaseModel
//属性名: 内容标题
@property (nonatomic, copy) NSString *content_title;
//属性名: 内容跳转地址
@property (nonatomic, copy) NSString *content_url;
@end

//埋点事件名: App线上出房个人中心页租客中心广告位点击
//埋点时机: 点击控件时触发
@interface DKAppSOLPersonalCenterTenantCenterBannerClickModel : DKSaStatisticsBaseModel
//属性名: 轮播图位置
@property (nonatomic, copy) NSString *banner_Location;
//属性名: 内容标题
@property (nonatomic, copy) NSString *content_title;
//属性名: 内容跳转地址
@property (nonatomic, copy) NSString *content_url;
@end

//埋点事件名: App线上出房首页弹窗点击
//埋点时机: 点击控件时触发
@interface DKAppSOLHomePopupClickModel : DKSaStatisticsBaseModel
//属性名: 内容标题
@property (nonatomic, copy) NSString *content_title;
//属性名: 内容跳转地址
@property (nonatomic, copy) NSString *content_url;
@end


NS_ASSUME_NONNULL_END
