// this is auto generated file, never change it by hand

#import "DKSaStatisticsBaseModel.h"

@implementation DKSaStatisticsBaseModel

@end

<#list trackingList as tracking>
@implementation DK${tracking.className}Model

-(instancetype)init
{
    self = [super init];
    if (self) {
        self.eventName = @"${tracking.name}";
    }
    return self;
}
@end


</#list>

