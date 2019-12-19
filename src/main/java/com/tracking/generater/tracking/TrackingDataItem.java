package com.tracking.generater.tracking;

import java.util.ArrayList;
import java.util.List;

public class TrackingDataItem {

    private String name;

    private String trackingDescription;

    private String trackingTiming;

    private String className;

    private String instanceName;

    private List<TrackingDataItemProperty> propertyList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrackingDescription() {
        return trackingDescription;
    }

    public void setTrackingDescription(String trackingDescription) {
        this.trackingDescription = trackingDescription;
    }

    public String getTrackingTiming() {
        return trackingTiming;
    }

    public void setTrackingTiming(String trackingTiming) {
        this.trackingTiming = trackingTiming;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<TrackingDataItemProperty> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<TrackingDataItemProperty> propertyList) {
        this.propertyList = propertyList;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }
}
