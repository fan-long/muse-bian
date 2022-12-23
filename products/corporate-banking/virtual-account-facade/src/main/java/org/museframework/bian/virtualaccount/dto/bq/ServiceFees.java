/*The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment*/
package org.museframework.bian.virtualaccount.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ServiceFees {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String feePreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String feeFeatureSchedule;

    /*The Fee specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String feePostconditions;

    /*Reference to the specific [BS] business service type*/
    @MetaField
    private String feeServiceType;

    /*Description of the performed [BS] business service*/
    @MetaField
    private String feeServiceDescription;

    /*Mandatory and optional inputs and output information for the BS business service*/
    @MetaField
    private String feeServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the [BS] business service*/
    @MetaField
    private String feeServiceWorkProduct;

    /**/
    @MetaField
    private String feeServiceName;

    public void setFeePreconditions(String feePreconditions) {
        this.feePreconditions = feePreconditions;
    }

    public String getFeePreconditions() {
        return feePreconditions;
    }

    public void setFeeFeatureSchedule(String feeFeatureSchedule) {
        this.feeFeatureSchedule = feeFeatureSchedule;
    }

    public String getFeeFeatureSchedule() {
        return feeFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setFeePostconditions(String feePostconditions) {
        this.feePostconditions = feePostconditions;
    }

    public String getFeePostconditions() {
        return feePostconditions;
    }

    public void setFeeServiceType(String feeServiceType) {
        this.feeServiceType = feeServiceType;
    }

    public String getFeeServiceType() {
        return feeServiceType;
    }

    public void setFeeServiceDescription(String feeServiceDescription) {
        this.feeServiceDescription = feeServiceDescription;
    }

    public String getFeeServiceDescription() {
        return feeServiceDescription;
    }

    public void setFeeServiceInputsandOuputs(String feeServiceInputsandOuputs) {
        this.feeServiceInputsandOuputs = feeServiceInputsandOuputs;
    }

    public String getFeeServiceInputsandOuputs() {
        return feeServiceInputsandOuputs;
    }

    public void setFeeServiceWorkProduct(String feeServiceWorkProduct) {
        this.feeServiceWorkProduct = feeServiceWorkProduct;
    }

    public String getFeeServiceWorkProduct() {
        return feeServiceWorkProduct;
    }

    public void setFeeServiceName(String feeServiceName) {
        this.feeServiceName = feeServiceName;
    }

    public String getFeeServiceName() {
        return feeServiceName;
    }
}