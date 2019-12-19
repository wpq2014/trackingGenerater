// this is auto generated file, never change it by hand

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface DKSaStatisticsBaseModel : NSObject

/// 事件名字
@property (nonatomic, copy) NSString *eventName;

@end

<#list trackingList as tracking>
//埋点事件名: ${tracking.trackingDescription!""}
//埋点时机: ${tracking.trackingTiming!""}
@interface DK${tracking.className}Model : DKSaStatisticsBaseModel
    <#list tracking.propertyList as property>
        <#if (property.name)?trim?length gt 1>
//属性名: ${property.propNameDescription!""}
@property (nonatomic, copy) NSString *${property.name};
        </#if>
    </#list>
@end

</#list>

NS_ASSUME_NONNULL_END
