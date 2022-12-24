/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.leasing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.IssuedDevice
@MetaDto
public class IssuedDevice {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String issuedDevicePreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String issuedDeviceFeatureSchedule;

    /*The Leasing Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String issuedDevicePostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String issuedDeviceServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String issuedDeviceServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String issuedDeviceServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String issuedDeviceServiceWorkProduct;

    /**/
    @MetaField
    private String issuedDeviceServiceName;

    public void setIssuedDevicePreconditions(String issuedDevicePreconditions) {
        this.issuedDevicePreconditions = issuedDevicePreconditions;
    }

    public String getIssuedDevicePreconditions() {
        return issuedDevicePreconditions;
    }

    public void setIssuedDeviceFeatureSchedule(String issuedDeviceFeatureSchedule) {
        this.issuedDeviceFeatureSchedule = issuedDeviceFeatureSchedule;
    }

    public String getIssuedDeviceFeatureSchedule() {
        return issuedDeviceFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setIssuedDevicePostconditions(String issuedDevicePostconditions) {
        this.issuedDevicePostconditions = issuedDevicePostconditions;
    }

    public String getIssuedDevicePostconditions() {
        return issuedDevicePostconditions;
    }

    public void setIssuedDeviceServiceType(String issuedDeviceServiceType) {
        this.issuedDeviceServiceType = issuedDeviceServiceType;
    }

    public String getIssuedDeviceServiceType() {
        return issuedDeviceServiceType;
    }

    public void setIssuedDeviceServiceDescription(String issuedDeviceServiceDescription) {
        this.issuedDeviceServiceDescription = issuedDeviceServiceDescription;
    }

    public String getIssuedDeviceServiceDescription() {
        return issuedDeviceServiceDescription;
    }

    public void setIssuedDeviceServiceInputsandOuputs(String issuedDeviceServiceInputsandOuputs) {
        this.issuedDeviceServiceInputsandOuputs = issuedDeviceServiceInputsandOuputs;
    }

    public String getIssuedDeviceServiceInputsandOuputs() {
        return issuedDeviceServiceInputsandOuputs;
    }

    public void setIssuedDeviceServiceWorkProduct(String issuedDeviceServiceWorkProduct) {
        this.issuedDeviceServiceWorkProduct = issuedDeviceServiceWorkProduct;
    }

    public String getIssuedDeviceServiceWorkProduct() {
        return issuedDeviceServiceWorkProduct;
    }

    public void setIssuedDeviceServiceName(String issuedDeviceServiceName) {
        this.issuedDeviceServiceName = issuedDeviceServiceName;
    }

    public String getIssuedDeviceServiceName() {
        return issuedDeviceServiceName;
    }
}