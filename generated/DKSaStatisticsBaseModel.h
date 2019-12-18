// this is auto generated file, never change it by hand

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface DKSaStatisticsBaseModel : NSObject

/// 事件名字
@property (nonatomic, copy) NSString *eventName;

@end

//App用户增长房源列表页房源中轮播图点击
//点击控件时触发
@interface DKAppUGHRoomListBetweenRoomBannerClickModel : DKSaStatisticsBaseModel
    //轮播图位置
    @property (nonatomic, copy) NSString *banner_location;
    //内容标题
    @property (nonatomic, copy) NSString *content_title;
    //内容跳转地址
    @property (nonatomic, copy) NSString *content_url;
@end
//App用户增长引导页点击
//点击控件时触发
@interface DKAppUGHGuideClickModel : DKSaStatisticsBaseModel
    //内容标题
    @property (nonatomic, copy) NSString *content_title;
    //内容跳转地址
    @property (nonatomic, copy) NSString *content_url;
@end
//App用户增长个人中心页租客中心广告位点击
//点击控件时触发
@interface DKAppUGHPersonalCenterTenantCenterBannerClickModel : DKSaStatisticsBaseModel
    //轮播图位置
    @property (nonatomic, copy) NSString *banner_location;
    //内容标题
    @property (nonatomic, copy) NSString *content_title;
    //内容跳转地址
    @property (nonatomic, copy) NSString *content_url;
@end

NS_ASSUME_NONNULL_END
