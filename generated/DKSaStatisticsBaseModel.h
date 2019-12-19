// this is auto generated file, never change it by hand

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface DKSaStatisticsBaseModel : NSObject

/// 事件名字
@property (nonatomic, copy) NSString *eventName;

@end

//埋点事件名: App线上出房房源列表页房源中轮播图点击
//埋点时机: 点击控件时触发
@interface DKAppSOLRoomListBetweenRoomBannerClickModel : DKSaStatisticsBaseModel
//属性名: 轮播图位置
@property (nonatomic, copy) NSString *banner_location;
//属性名: 内容标题
@property (nonatomic, copy) NSString *content_title;
//属性名: 内容跳转地址
@property (nonatomic, copy) NSString *content_url;
@end

//埋点事件名: App线上出房引导页点击
//埋点时机: 点击控件时触发
@interface DKAppSOLGuideClickModel : DKSaStatisticsBaseModel
//属性名: 内容标题
@property (nonatomic, copy) NSString *content_title;
//属性名: 内容跳转地址
@property (nonatomic, copy) NSString *content_url;
@end

//埋点事件名: App线上出房个人中心页租客中心广告位点击
//埋点时机: 点击控件时触发
@interface DKAppSOLPersonalCenterTenantCenterBannerClickModel : DKSaStatisticsBaseModel
//属性名: 轮播图位置
@property (nonatomic, copy) NSString *banner_location;
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

//埋点事件名: App启动
//埋点时机: 
@interface DKAppStartModel : DKSaStatisticsBaseModel
@end

//埋点事件名: App激活
//埋点时机: 
@interface DKAppInstallModel : DKSaStatisticsBaseModel
@end

//埋点事件名: App登录
//埋点时机: 用户登录成功时触发
@interface DKAppSignupModel : DKSaStatisticsBaseModel
//属性名: 注册方式
@property (nonatomic, copy) NSString *sign_up_method;
//属性名: 是否新用户
@property (nonatomic, copy) NSString *is_new_user;
@end

//埋点事件名: App线上出房房源列表页查询
//埋点时机: 
@interface DKAppSOLRoomListSearchModel : DKSaStatisticsBaseModel
//属性名: 租赁类型
@property (nonatomic, copy) NSString *rent_type;
//属性名: 房间数
@property (nonatomic, copy) NSString *bedroom_count;
//属性名: 搜索词
@property (nonatomic, copy) NSString *search_text;
//属性名: 搜索词性
@property (nonatomic, copy) NSString *word_type;
//属性名: 附近
@property (nonatomic, copy) NSString *near_by;
//属性名: 商圈
@property (nonatomic, copy) NSString *block;
//属性名: 地铁
@property (nonatomic, copy) NSString *subway;
//属性名: 区
@property (nonatomic, copy) NSString *district;
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
//属性名: 搜索的session_id
@property (nonatomic, copy) NSString *search_session_id;
//属性名: 搜索的method_id
@property (nonatomic, copy) NSString *search_method_id;
//属性名: 文本框输入
@property (nonatomic, copy) NSString *textbox_input;
//属性名: 查询方式
@property (nonatomic, copy) NSString *search_method;
@end

//埋点事件名: App线上出房房源列表页查询结果
//埋点时机: 
@interface DKAppSOLRoomListSearchResultModel : DKSaStatisticsBaseModel
//属性名: 租赁类型
@property (nonatomic, copy) NSString *rent_type;
//属性名: 房间数
@property (nonatomic, copy) NSString *bedroom_count;
//属性名: 搜索词
@property (nonatomic, copy) NSString *search_text;
//属性名: 搜索词性
@property (nonatomic, copy) NSString *word_type;
//属性名: 附近
@property (nonatomic, copy) NSString *near_by;
//属性名: 商圈
@property (nonatomic, copy) NSString *block;
//属性名: 地铁
@property (nonatomic, copy) NSString *subway;
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
//属性名: 搜索的session_id
@property (nonatomic, copy) NSString *search_session_id;
//属性名: 搜索的method_id
@property (nonatomic, copy) NSString *search_method_id;
//属性名: 文本框输入
@property (nonatomic, copy) NSString *textbox_input;
//属性名: 返回结果
@property (nonatomic, copy) NSString *result_code;
//属性名: 查询方式
@property (nonatomic, copy) NSString *search_method;
@end

//埋点事件名: App线上出房地图找房输入地区查询
//埋点时机: 点击控件时触发
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
//属性名: 查询方式
@property (nonatomic, copy) NSString *search_method;
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

//埋点事件名: App线上出房地图找房小区点击
//埋点时机: 
@interface DKAppSOLMapCommunityClickModel : DKSaStatisticsBaseModel
//属性名: 是否有上新
@property (nonatomic, copy) NSString *is_new;
//属性名: 是否足迹
@property (nonatomic, copy) NSString *is_footprint;
//属性名: 模块类型
@property (nonatomic, copy) NSString *mode_type;
//属性名: 小区名称
@property (nonatomic, copy) NSString *community;
@end

//埋点事件名: App线上出房地图找房小区关注点击
//埋点时机: 
@interface DKAppSOLMapCommunityOnConcernClickModel : DKSaStatisticsBaseModel
//属性名: 小区名称
@property (nonatomic, copy) NSString *community;
@end

//埋点事件名: App线上出房地图找房小区取关点击
//埋点时机: 
@interface DKAppSOLMapCommunityOffConcernClickModel : DKSaStatisticsBaseModel
//属性名: 小区名称
@property (nonatomic, copy) NSString *community;
@end

//埋点事件名: App线上出房地图找房小区详情点击
//埋点时机: 
@interface DKAppSOLMapCommunityDetailClickModel : DKSaStatisticsBaseModel
//属性名: 小区名称
@property (nonatomic, copy) NSString *community;
@end

//埋点事件名: App线上出房房源详情页面信息
//埋点时机: 
@interface DKAppSOLRoomDetailPageInfoModel : DKSaStatisticsBaseModel
//属性名: 房源编码
@property (nonatomic, copy) NSString *room_code;
//属性名: 来源类型
@property (nonatomic, copy) NSString *source_type;
//属性名: 户型
@property (nonatomic, copy) NSString *house_type;
//属性名: 小区名称
@property (nonatomic, copy) NSString *community;
//属性名: 房屋类型
@property (nonatomic, copy) NSString *rent_type;
//属性名: 商圈
@property (nonatomic, copy) NSString *block;
//属性名: 待确认
@property (nonatomic, copy) NSString *payment_way;
//属性名: 活动价
@property (nonatomic, copy) NSString *activity_price;
//属性名: 原价
@property (nonatomic, copy) NSString *original_price;
//属性名: 房间面积
@property (nonatomic, copy) NSString *room_area;
//属性名: 通勤地址
@property (nonatomic, copy) NSString *commute_address;
//属性名: 通勤时长
@property (nonatomic, copy) NSString *commute_duration;
//属性名: 通勤方式
@property (nonatomic, copy) NSString *commute_method;
@end

//埋点事件名: APP线上出房房源列表搜索无结果电话咨询点击
//埋点时机: 
@interface DKAppSOLRoomListSearchNoResultCallClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源列表搜索无结果电话咨询点击成功
//埋点时机: 
@interface DKAppSOLRoomListSearchNoResultCallSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源列表搜索无结果预约看房点击
//埋点时机: 
@interface DKAppSOLRoomListSearchNoResultAppointClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源列表搜索无结果预约看房提交成功
//埋点时机: 
@interface DKAppSOLRoomListSearchNoResultAppointSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源详情页图片下面的电话咨询图标点击
//埋点时机: 
@interface DKAPPSOLRoomDetailIconCallClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源详情页图片下面的电话咨询图标点击成功
//埋点时机: 
@interface DKAPPSOLRoomDetailIconCallSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源详情页蛋壳管家电话咨询点击
//埋点时机: 
@interface DKAPPSOLRoomDetailDkgjCallClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源详情页蛋壳管家电话咨询点击成功
//埋点时机: 
@interface DKAPPSOLRoomDetailDkgjCallSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源详情页底部电话咨询点击
//埋点时机: 
@interface DKAPPSOLRoomDetailBottomCallClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源详情页底部电话咨询成功
//埋点时机: 
@interface DKAPPSOLRoomDetailBottomCallSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源详情页底部预约看房点击
//埋点时机: 
@interface DKAPPSOLRoomDetailBottomAppointClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源详情页底部预约看房选择时间点击
//埋点时机: 
@interface DKAPPSOLRoomDetailBottomAppointChooseTimeClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源详情页预约看房提交成功
//埋点时机: 
@interface DKAPPSOLRoomDetailBottomAppointSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源图片详情页底部电话咨询点击
//埋点时机: 
@interface DKAPPSOLRoomImageDetailBottomCallClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源图片详情页底部电话咨询成功
//埋点时机: 
@interface DKAPPSOLRoomImageDetailBottomCallSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源图片详情页底部预约看房按钮
//埋点时机: 
@interface DKAPPSOLRoomImageDetailBottomAppointClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源图片详情页底部预约看房选择时间点击
//埋点时机: 
@interface DKAPPSOLRoomImageDetailBottomAppointChooseTimeClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源图片详情页底部预约看房成功
//埋点时机: 
@interface DKAPPSOLRoomImageDetailBottomAppointSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源地图周边页顶部电话咨询按钮
//埋点时机: 
@interface DKAPPSOLRoomMapDetailTopCallClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房房源地图周边页顶部电话咨询成功
//埋点时机: 
@interface DKAPPSOLRoomMapDetailTopCallSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房小区图片详情页底部电话咨询点击
//埋点时机: 
@interface DKAPPSOLCommunityMapDetailTopCallClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房小区图片详情页底部电话咨询成功
//埋点时机: 
@interface DKAPPSOLCommunityMapDetailTopCallSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房小区图片详情页底部预约看房按钮
//埋点时机: 
@interface DKAPPSOLCommunityMapDetailBottomAppointClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房小区图片详情页底部预约看房选择时间点击
//埋点时机: 
@interface DKAPPSOLCommunityMapDetailBottomAppointChooseTimeClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房小区图片详情页底部预约看房成功
//埋点时机: 
@interface DKAPPSOLCommunityMapDetailBottomAppointSuccessModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房足迹列表页房源预约看房点击
//埋点时机: 
@interface DKAPPSOLFootPrintListRoomAppointClickModel : DKSaStatisticsBaseModel
@end

//埋点事件名: APP线上出房足迹列表页房源预约看房选择时间点击
//埋点时机: 
@interface DKAPPSOLFootPrintListRoomAppointChooseTimeClickModel : DKSaStatisticsBaseModel
@end


NS_ASSUME_NONNULL_END
