// this is auto generated file, never change it by hand

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface DKSaStatisticsBaseModel : NSObject

/// 事件名字
@property (nonatomic, copy) NSString *eventName;

@end

<#list trackingList as tracking>
//${tracking.trackingDescription!""}
//${tracking.trackingTiming!""}
@interface DK${tracking.className}Model : DKSaStatisticsBaseModel
    <#list tracking.propertyList as property>
    //${property.propNameDescription!""}
    @property (nonatomic, copy) NSString *${property.name};
    </#list>
@end
</#list>

NS_ASSUME_NONNULL_END
