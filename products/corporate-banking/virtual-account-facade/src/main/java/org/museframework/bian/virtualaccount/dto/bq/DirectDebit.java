/*The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment*/
package org.museframework.bian.virtualaccount.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DirectDebit {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String directDebitPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String directDebitFeatureSchedule;

    /*The Direct Debit specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String directDebitPostconditions;

    /*Reference to the specific [BS] business service type*/
    @MetaField(0)
    private String directDebitServiceType;

    /*Description of the performed [BS] business service*/
    @MetaField(0)
    private String directDebitServiceDescription;

    /*Mandatory and optional inputs and output information for the BS business service*/
    @MetaField(0)
    private String directDebitServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the [BS] business service*/
    @MetaField(0)
    private String directDebitServiceWorkProduct;

    /**/
    @MetaField(0)
    private String directDebitServiceName;

    public void setDirectDebitPreconditions(String directDebitPreconditions) {
        this.directDebitPreconditions = directDebitPreconditions;
    }

    public String getDirectDebitPreconditions() {
        return directDebitPreconditions;
    }

    public void setDirectDebitFeatureSchedule(String directDebitFeatureSchedule) {
        this.directDebitFeatureSchedule = directDebitFeatureSchedule;
    }

    public String getDirectDebitFeatureSchedule() {
        return directDebitFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setDirectDebitPostconditions(String directDebitPostconditions) {
        this.directDebitPostconditions = directDebitPostconditions;
    }

    public String getDirectDebitPostconditions() {
        return directDebitPostconditions;
    }

    public void setDirectDebitServiceType(String directDebitServiceType) {
        this.directDebitServiceType = directDebitServiceType;
    }

    public String getDirectDebitServiceType() {
        return directDebitServiceType;
    }

    public void setDirectDebitServiceDescription(String directDebitServiceDescription) {
        this.directDebitServiceDescription = directDebitServiceDescription;
    }

    public String getDirectDebitServiceDescription() {
        return directDebitServiceDescription;
    }

    public void setDirectDebitServiceInputsandOuputs(String directDebitServiceInputsandOuputs) {
        this.directDebitServiceInputsandOuputs = directDebitServiceInputsandOuputs;
    }

    public String getDirectDebitServiceInputsandOuputs() {
        return directDebitServiceInputsandOuputs;
    }

    public void setDirectDebitServiceWorkProduct(String directDebitServiceWorkProduct) {
        this.directDebitServiceWorkProduct = directDebitServiceWorkProduct;
    }

    public String getDirectDebitServiceWorkProduct() {
        return directDebitServiceWorkProduct;
    }

    public void setDirectDebitServiceName(String directDebitServiceName) {
        this.directDebitServiceName = directDebitServiceName;
    }

    public String getDirectDebitServiceName() {
        return directDebitServiceName;
    }
}