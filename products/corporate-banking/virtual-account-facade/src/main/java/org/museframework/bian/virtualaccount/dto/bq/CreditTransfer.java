/*The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment*/
package org.museframework.bian.virtualaccount.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditTransfer {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String creditTransferPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String creditTransferFeatureSchedule;

    /*The Credit Transfer specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String creditTransferPostconditions;

    /*Reference to the specific [BS] business service type*/
    @MetaField
    private String creditTransferServiceType;

    /*Description of the performed [BS] business service*/
    @MetaField
    private String creditTransferServiceDescription;

    /*Mandatory and optional inputs and output information for the BS business service*/
    @MetaField
    private String creditTransferServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the [BS] business service*/
    @MetaField
    private String creditTransferServiceWorkProduct;

    /**/
    @MetaField
    private String creditTransferServiceName;

    public void setCreditTransferPreconditions(String creditTransferPreconditions) {
        this.creditTransferPreconditions = creditTransferPreconditions;
    }

    public String getCreditTransferPreconditions() {
        return creditTransferPreconditions;
    }

    public void setCreditTransferFeatureSchedule(String creditTransferFeatureSchedule) {
        this.creditTransferFeatureSchedule = creditTransferFeatureSchedule;
    }

    public String getCreditTransferFeatureSchedule() {
        return creditTransferFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setCreditTransferPostconditions(String creditTransferPostconditions) {
        this.creditTransferPostconditions = creditTransferPostconditions;
    }

    public String getCreditTransferPostconditions() {
        return creditTransferPostconditions;
    }

    public void setCreditTransferServiceType(String creditTransferServiceType) {
        this.creditTransferServiceType = creditTransferServiceType;
    }

    public String getCreditTransferServiceType() {
        return creditTransferServiceType;
    }

    public void setCreditTransferServiceDescription(String creditTransferServiceDescription) {
        this.creditTransferServiceDescription = creditTransferServiceDescription;
    }

    public String getCreditTransferServiceDescription() {
        return creditTransferServiceDescription;
    }

    public void setCreditTransferServiceInputsandOuputs(String creditTransferServiceInputsandOuputs) {
        this.creditTransferServiceInputsandOuputs = creditTransferServiceInputsandOuputs;
    }

    public String getCreditTransferServiceInputsandOuputs() {
        return creditTransferServiceInputsandOuputs;
    }

    public void setCreditTransferServiceWorkProduct(String creditTransferServiceWorkProduct) {
        this.creditTransferServiceWorkProduct = creditTransferServiceWorkProduct;
    }

    public String getCreditTransferServiceWorkProduct() {
        return creditTransferServiceWorkProduct;
    }

    public void setCreditTransferServiceName(String creditTransferServiceName) {
        this.creditTransferServiceName = creditTransferServiceName;
    }

    public String getCreditTransferServiceName() {
        return creditTransferServiceName;
    }
}