/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.leasing.dto.bq;

public class FinancialAccounting {
    /*The required status/situation prior to the implementation of the feature*/
    private String financialAccountingPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String financialAccountingFeatureSchedule;

    /*The Leasing Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService financialAccounting;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String financialAccountingPostconditions;

    /*Reference to the specific business service type*/
    private String financialAccountingFinancialAccountingServiceType;

    /*Description of the performed business service*/
    private String financialAccountingFinancialAccountingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String financialAccountingFinancialAccountingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String financialAccountingFinancialAccountingServiceWorkProduct;

    /**/
    private String financialAccountingFinancialAccountingServiceName;

    public void setFinancialAccountingPreconditions(String financialAccountingPreconditions) {
        this.financialAccountingPreconditions = financialAccountingPreconditions;
    }

    public String getFinancialAccountingPreconditions() {
        return financialAccountingPreconditions;
    }

    public void setFinancialAccountingFeatureSchedule(String financialAccountingFeatureSchedule) {
        this.financialAccountingFeatureSchedule = financialAccountingFeatureSchedule;
    }

    public String getFinancialAccountingFeatureSchedule() {
        return financialAccountingFeatureSchedule;
    }

    public void setFinancialAccounting(org.museframework.bian.classes.BusinessService financialAccounting) {
        this.financialAccounting = financialAccounting;
    }

    public org.museframework.bian.classes.BusinessService getFinancialAccounting() {
        return financialAccounting;
    }

    public void setFinancialAccountingPostconditions(String financialAccountingPostconditions) {
        this.financialAccountingPostconditions = financialAccountingPostconditions;
    }

    public String getFinancialAccountingPostconditions() {
        return financialAccountingPostconditions;
    }

    public void setFinancialAccountingFinancialAccountingServiceType(String financialAccountingFinancialAccountingServiceType) {
        this.financialAccountingFinancialAccountingServiceType = financialAccountingFinancialAccountingServiceType;
    }

    public String getFinancialAccountingFinancialAccountingServiceType() {
        return financialAccountingFinancialAccountingServiceType;
    }

    public void setFinancialAccountingFinancialAccountingServiceDescription(String financialAccountingFinancialAccountingServiceDescription) {
        this.financialAccountingFinancialAccountingServiceDescription = financialAccountingFinancialAccountingServiceDescription;
    }

    public String getFinancialAccountingFinancialAccountingServiceDescription() {
        return financialAccountingFinancialAccountingServiceDescription;
    }

    public void setFinancialAccountingFinancialAccountingServiceInputsandOuputs(String financialAccountingFinancialAccountingServiceInputsandOuputs) {
        this.financialAccountingFinancialAccountingServiceInputsandOuputs = financialAccountingFinancialAccountingServiceInputsandOuputs;
    }

    public String getFinancialAccountingFinancialAccountingServiceInputsandOuputs() {
        return financialAccountingFinancialAccountingServiceInputsandOuputs;
    }

    public void setFinancialAccountingFinancialAccountingServiceWorkProduct(String financialAccountingFinancialAccountingServiceWorkProduct) {
        this.financialAccountingFinancialAccountingServiceWorkProduct = financialAccountingFinancialAccountingServiceWorkProduct;
    }

    public String getFinancialAccountingFinancialAccountingServiceWorkProduct() {
        return financialAccountingFinancialAccountingServiceWorkProduct;
    }

    public void setFinancialAccountingFinancialAccountingServiceName(String financialAccountingFinancialAccountingServiceName) {
        this.financialAccountingFinancialAccountingServiceName = financialAccountingFinancialAccountingServiceName;
    }

    public String getFinancialAccountingFinancialAccountingServiceName() {
        return financialAccountingFinancialAccountingServiceName;
    }
}