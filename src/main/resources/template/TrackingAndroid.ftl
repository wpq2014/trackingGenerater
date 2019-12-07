// this is auto
<#if package??>
package ${package};
</#if>

import java.util.HashMap;

public class Tracking {

    protected String name;

    protected HashMap<String, Object> mParams;

    public void track() {
        //做神策tracking;
        mParams.clear();
    }

    <#list trackingList as tracking>
    public static ${tracking.className} ${tracking.instanceName} = new ${tracking.className}();
    /**
     * ${tracking.trackingDescription!""}
     * ${tracking.trackingTiming!""}
     */
    public static class ${tracking.className} extends Tracking {

        public ${tracking.className}(){
            super.name = "${tracking.name}";
        }

         <#list tracking.propertyList as property>
        //${property.propNameDescription!""}
        public ${tracking.className} ${property.name}(Object ${property.name}) {
            mParams.put("${property.name}", ${property.name});
            return this;
        }

        </#list>
    }
    </#list>


}
