// this is auto generated file, never change it by hand
<#if package??>
package ${package};
</#if>

import java.util.Map;
import java.util.HashMap;

public class Tracking {

    protected String name;

    protected Map<String, Object> mParams = new HashMap<>();

    public String getName() {
        return name;
    }

    public Map<String, Object> getParams() {
        return mParams;
    }

    public void track() {
        //作神策tracking
        TrackingUtil.track(name, mParams);
        mParams.clear();
    }

    <#list trackingList as tracking>
    public static ${tracking.className} ${tracking.instanceName} = new ${tracking.className}();

    /**
     * 埋点事件名: ${tracking.trackingDescription!""}
     * 埋点时机: ${tracking.trackingTiming!""}
     */
    public static class ${tracking.className} extends Tracking {

        public ${tracking.className}() {
            super.name = "${tracking.name}";
        }

        <#list tracking.propertyList as property>
            <#if (property.name)?trim?length gt 1>
        //属性名: ${property.propNameDescription!""}
        public ${tracking.className} ${property.methodName}(Object ${property.name}) {
            mParams.put("${property.name}", ${property.name});
            return this;
        }

            </#if>
        </#list>
    }

    </#list>
}
