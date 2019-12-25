// this is auto generated file, never change it by hand

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface DKSaStatisticsBaseModel : NSObject

/// 事件名字
@property (nonatomic, copy) NSString *eventName;

@end

//埋点事件名: 登录
//埋点时机: 点击登录触发
@interface DKLoginModel : DKSaStatisticsBaseModel
//属性名: 手机号
@property (nonatomic, copy) NSString *mobile;
//属性名: 登录成功或失败
@property (nonatomic, copy) NSString *result;
@end


NS_ASSUME_NONNULL_END
