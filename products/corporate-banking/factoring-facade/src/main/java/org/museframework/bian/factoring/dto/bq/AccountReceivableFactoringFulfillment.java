/*The configuration and execution of Account Receivable Factoring Fulfillment arrangement within the Account Receivable Factoring Fulfillment*/
package org.museframework.bian.factoring.dto.bq;

public class AccountReceivableFactoringFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Account Receivable Factoring Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Account Receivable Factoring Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility factoringFacilityReference;

    /*Reference to Account Receivable Factoring Fulfillment*/
    private org.museframework.bian.classes.Object accountReceivableFactoringFulfillmentReference;

    /*The type of Account Receivable Factoring Fulfillment*/
    private String accountReceivableFactoringFulfillmentType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setFactoringFacilityReference(org.museframework.bian.classes.FinancialFacility factoringFacilityReference) {
        this.factoringFacilityReference = factoringFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getFactoringFacilityReference() {
        return factoringFacilityReference;
    }

    public void setAccountReceivableFactoringFulfillmentReference(org.museframework.bian.classes.Object accountReceivableFactoringFulfillmentReference) {
        this.accountReceivableFactoringFulfillmentReference = accountReceivableFactoringFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getAccountReceivableFactoringFulfillmentReference() {
        return accountReceivableFactoringFulfillmentReference;
    }

    public void setAccountReceivableFactoringFulfillmentType(String accountReceivableFactoringFulfillmentType) {
        this.accountReceivableFactoringFulfillmentType = accountReceivableFactoringFulfillmentType;
    }

    public String getAccountReceivableFactoringFulfillmentType() {
        return accountReceivableFactoringFulfillmentType;
    }
}