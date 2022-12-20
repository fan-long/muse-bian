/*The configuration and execution of Account Receivable Factoring Fulfillment arrangement within the Account Receivable Factoring Fulfillment*/
package org.museframework.bian.factoring.dto.bq;

public class AccountsReceivableEvaluationFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Accounts Receivable Evaluation Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Accounts Receivable Evaluation Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility factoringFacilityReference;

    /*Reference to Accounts Receivable Evaluation Fulfillment*/
    private org.museframework.bian.classes.Object accountsReceivableEvaluationFulfillmentReference;

    /*The type of Accounts Receivable Evaluation Fulfillment*/
    private String accountsReceivableEvaluationFulfillmentType;

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

    public void setAccountsReceivableEvaluationFulfillmentReference(org.museframework.bian.classes.Object accountsReceivableEvaluationFulfillmentReference) {
        this.accountsReceivableEvaluationFulfillmentReference = accountsReceivableEvaluationFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getAccountsReceivableEvaluationFulfillmentReference() {
        return accountsReceivableEvaluationFulfillmentReference;
    }

    public void setAccountsReceivableEvaluationFulfillmentType(String accountsReceivableEvaluationFulfillmentType) {
        this.accountsReceivableEvaluationFulfillmentType = accountsReceivableEvaluationFulfillmentType;
    }

    public String getAccountsReceivableEvaluationFulfillmentType() {
        return accountsReceivableEvaluationFulfillmentType;
    }
}