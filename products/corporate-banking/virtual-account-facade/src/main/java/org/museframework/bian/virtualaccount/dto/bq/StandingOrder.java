/*The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment*/
package org.museframework.bian.virtualaccount.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class StandingOrder {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String standingOrderPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String standingOrderFeatureSchedule;

    /*The Standing Order specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String standingOrderPostconditions;

    /*Reference to the specific [BS] business service type*/
    @MetaField(0)
    private String standingOrderServiceType;

    /*Description of the performed [BS] business service*/
    @MetaField(0)
    private String standingOrderServiceDescription;

    /*Mandatory and optional inputs and output information for the BS business service*/
    @MetaField(0)
    private String standingOrderServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the [BS] business service*/
    @MetaField(0)
    private String standingOrderServiceWorkProduct;

    /**/
    @MetaField(0)
    private String standingOrderServiceName;

    public void setStandingOrderPreconditions(String standingOrderPreconditions) {
        this.standingOrderPreconditions = standingOrderPreconditions;
    }

    public String getStandingOrderPreconditions() {
        return standingOrderPreconditions;
    }

    public void setStandingOrderFeatureSchedule(String standingOrderFeatureSchedule) {
        this.standingOrderFeatureSchedule = standingOrderFeatureSchedule;
    }

    public String getStandingOrderFeatureSchedule() {
        return standingOrderFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setStandingOrderPostconditions(String standingOrderPostconditions) {
        this.standingOrderPostconditions = standingOrderPostconditions;
    }

    public String getStandingOrderPostconditions() {
        return standingOrderPostconditions;
    }

    public void setStandingOrderServiceType(String standingOrderServiceType) {
        this.standingOrderServiceType = standingOrderServiceType;
    }

    public String getStandingOrderServiceType() {
        return standingOrderServiceType;
    }

    public void setStandingOrderServiceDescription(String standingOrderServiceDescription) {
        this.standingOrderServiceDescription = standingOrderServiceDescription;
    }

    public String getStandingOrderServiceDescription() {
        return standingOrderServiceDescription;
    }

    public void setStandingOrderServiceInputsandOuputs(String standingOrderServiceInputsandOuputs) {
        this.standingOrderServiceInputsandOuputs = standingOrderServiceInputsandOuputs;
    }

    public String getStandingOrderServiceInputsandOuputs() {
        return standingOrderServiceInputsandOuputs;
    }

    public void setStandingOrderServiceWorkProduct(String standingOrderServiceWorkProduct) {
        this.standingOrderServiceWorkProduct = standingOrderServiceWorkProduct;
    }

    public String getStandingOrderServiceWorkProduct() {
        return standingOrderServiceWorkProduct;
    }

    public void setStandingOrderServiceName(String standingOrderServiceName) {
        this.standingOrderServiceName = standingOrderServiceName;
    }

    public String getStandingOrderServiceName() {
        return standingOrderServiceName;
    }
}