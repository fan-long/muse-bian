/**/
package org.museframework.bian.merchandisingloan.dto.bq;

public class Billing {
    /*The required status/situation prior to the implementation of the feature*/
    private String billingPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String billingFeatureSchedule;

    /*The Merchandising Loan Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String billingPostconditions;

    /*Reference to the specific business service type*/
    private String billingServiceType;

    /*Description of the performed business service*/
    private String billingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String billingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String billingServiceWorkProduct;

    /**/
    private String billingServiceName;

    public void setBillingPreconditions(String billingPreconditions) {
        this.billingPreconditions = billingPreconditions;
    }

    public String getBillingPreconditions() {
        return billingPreconditions;
    }

    public void setBillingFeatureSchedule(String billingFeatureSchedule) {
        this.billingFeatureSchedule = billingFeatureSchedule;
    }

    public String getBillingFeatureSchedule() {
        return billingFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setBillingPostconditions(String billingPostconditions) {
        this.billingPostconditions = billingPostconditions;
    }

    public String getBillingPostconditions() {
        return billingPostconditions;
    }

    public void setBillingServiceType(String billingServiceType) {
        this.billingServiceType = billingServiceType;
    }

    public String getBillingServiceType() {
        return billingServiceType;
    }

    public void setBillingServiceDescription(String billingServiceDescription) {
        this.billingServiceDescription = billingServiceDescription;
    }

    public String getBillingServiceDescription() {
        return billingServiceDescription;
    }

    public void setBillingServiceInputsandOuputs(String billingServiceInputsandOuputs) {
        this.billingServiceInputsandOuputs = billingServiceInputsandOuputs;
    }

    public String getBillingServiceInputsandOuputs() {
        return billingServiceInputsandOuputs;
    }

    public void setBillingServiceWorkProduct(String billingServiceWorkProduct) {
        this.billingServiceWorkProduct = billingServiceWorkProduct;
    }

    public String getBillingServiceWorkProduct() {
        return billingServiceWorkProduct;
    }

    public void setBillingServiceName(String billingServiceName) {
        this.billingServiceName = billingServiceName;
    }

    public String getBillingServiceName() {
        return billingServiceName;
    }
}