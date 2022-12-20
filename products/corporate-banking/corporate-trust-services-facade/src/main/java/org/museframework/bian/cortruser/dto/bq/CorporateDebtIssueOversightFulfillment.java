/*The configuration and execution of Trust Court Administration Fulfillment arrangement within the Trust Court Administration Fulfillment*/
package org.museframework.bian.cortruser.dto.bq;

public class CorporateDebtIssueOversightFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Corporate Debt Issue Oversight Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Corporate Debt Issue Oversight Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility corporateTrustServicesFacilityReference;

    /*Reference to Corporate Debt Issue Oversight Fulfillment*/
    private org.museframework.bian.classes.Object corporateDebtIssueOversightFulfillmentReference;

    /*The type of Corporate Debt Issue Oversight Fulfillment*/
    private String corporateDebtIssueOversightFulfillmentType;

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

    public void setCorporateTrustServicesFacilityReference(org.museframework.bian.classes.FinancialFacility corporateTrustServicesFacilityReference) {
        this.corporateTrustServicesFacilityReference = corporateTrustServicesFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getCorporateTrustServicesFacilityReference() {
        return corporateTrustServicesFacilityReference;
    }

    public void setCorporateDebtIssueOversightFulfillmentReference(org.museframework.bian.classes.Object corporateDebtIssueOversightFulfillmentReference) {
        this.corporateDebtIssueOversightFulfillmentReference = corporateDebtIssueOversightFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getCorporateDebtIssueOversightFulfillmentReference() {
        return corporateDebtIssueOversightFulfillmentReference;
    }

    public void setCorporateDebtIssueOversightFulfillmentType(String corporateDebtIssueOversightFulfillmentType) {
        this.corporateDebtIssueOversightFulfillmentType = corporateDebtIssueOversightFulfillmentType;
    }

    public String getCorporateDebtIssueOversightFulfillmentType() {
        return corporateDebtIssueOversightFulfillmentType;
    }
}