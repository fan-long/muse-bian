/*The configuration and execution of Check Clearing and Settlement Fulfillment arrangement within the Check Clearing and Settlement Fulfillment*/
package org.museframework.bian.chelocbox.dto.bq;

public class LockBoxReportingandIssueResolutionFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Lock Box Reporting and Issue Resolution Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Lock Box Reporting and Issue Resolution Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility lockBoxFacilityReference;

    /*Reference to Lock Box Reporting and Issue Resolution Fulfillment*/
    private org.museframework.bian.classes.Object lockBoxReportingandIssueResolutionFulfillmentReference;

    /*The type of Lock Box Reporting and Issue Resolution Fulfillment*/
    private String lockBoxReportingandIssueResolutionFulfillmentType;

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

    public void setLockBoxFacilityReference(org.museframework.bian.classes.FinancialFacility lockBoxFacilityReference) {
        this.lockBoxFacilityReference = lockBoxFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getLockBoxFacilityReference() {
        return lockBoxFacilityReference;
    }

    public void setLockBoxReportingandIssueResolutionFulfillmentReference(org.museframework.bian.classes.Object lockBoxReportingandIssueResolutionFulfillmentReference) {
        this.lockBoxReportingandIssueResolutionFulfillmentReference = lockBoxReportingandIssueResolutionFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getLockBoxReportingandIssueResolutionFulfillmentReference() {
        return lockBoxReportingandIssueResolutionFulfillmentReference;
    }

    public void setLockBoxReportingandIssueResolutionFulfillmentType(String lockBoxReportingandIssueResolutionFulfillmentType) {
        this.lockBoxReportingandIssueResolutionFulfillmentType = lockBoxReportingandIssueResolutionFulfillmentType;
    }

    public String getLockBoxReportingandIssueResolutionFulfillmentType() {
        return lockBoxReportingandIssueResolutionFulfillmentType;
    }
}