/*Operate equipment and/or a largely automated facility  within ATM Network Operations. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.atmnetope.dto.bq;

public class DeviceTracking {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    private String deviceTrackingPreconditions;

    /*The schedule and timing of the function*/
    private String deviceTrackingFunctionSchedule;

    /*The ATMNetwork Operating Session specific Business Service*/
    private org.museframework.bian.classes.BusinessService deviceTracking;

    /*Reference to the specific business service type*/
    private String deviceTrackingServiceType;

    /*Description of the performed business service*/
    private String deviceTrackingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String deviceTrackingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String deviceTrackingServiceWorkProduct;

    /**/
    private String deviceTrackingServiceName;

    public void setDeviceTrackingPreconditions(String deviceTrackingPreconditions) {
        this.deviceTrackingPreconditions = deviceTrackingPreconditions;
    }

    public String getDeviceTrackingPreconditions() {
        return deviceTrackingPreconditions;
    }

    public void setDeviceTrackingFunctionSchedule(String deviceTrackingFunctionSchedule) {
        this.deviceTrackingFunctionSchedule = deviceTrackingFunctionSchedule;
    }

    public String getDeviceTrackingFunctionSchedule() {
        return deviceTrackingFunctionSchedule;
    }

    public void setDeviceTracking(org.museframework.bian.classes.BusinessService deviceTracking) {
        this.deviceTracking = deviceTracking;
    }

    public org.museframework.bian.classes.BusinessService getDeviceTracking() {
        return deviceTracking;
    }

    public void setDeviceTrackingServiceType(String deviceTrackingServiceType) {
        this.deviceTrackingServiceType = deviceTrackingServiceType;
    }

    public String getDeviceTrackingServiceType() {
        return deviceTrackingServiceType;
    }

    public void setDeviceTrackingServiceDescription(String deviceTrackingServiceDescription) {
        this.deviceTrackingServiceDescription = deviceTrackingServiceDescription;
    }

    public String getDeviceTrackingServiceDescription() {
        return deviceTrackingServiceDescription;
    }

    public void setDeviceTrackingServiceInputsandOuputs(String deviceTrackingServiceInputsandOuputs) {
        this.deviceTrackingServiceInputsandOuputs = deviceTrackingServiceInputsandOuputs;
    }

    public String getDeviceTrackingServiceInputsandOuputs() {
        return deviceTrackingServiceInputsandOuputs;
    }

    public void setDeviceTrackingServiceWorkProduct(String deviceTrackingServiceWorkProduct) {
        this.deviceTrackingServiceWorkProduct = deviceTrackingServiceWorkProduct;
    }

    public String getDeviceTrackingServiceWorkProduct() {
        return deviceTrackingServiceWorkProduct;
    }

    public void setDeviceTrackingServiceName(String deviceTrackingServiceName) {
        this.deviceTrackingServiceName = deviceTrackingServiceName;
    }

    public String getDeviceTrackingServiceName() {
        return deviceTrackingServiceName;
    }
}