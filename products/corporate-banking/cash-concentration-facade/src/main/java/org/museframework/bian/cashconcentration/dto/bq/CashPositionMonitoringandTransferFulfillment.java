/*The configuration and execution of Cash Position Monitoring and Transfer Fulfillment arrangement within the Cash Position Monitoring and Transfer Fulfillment*/
package org.museframework.bian.cashconcentration.dto.bq;

public class CashPositionMonitoringandTransferFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Cash Position Monitoring and Transfer Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Cash Position Monitoring and Transfer Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility accountBalanceSweepingFacilityReference;

    /*Reference to Cash Position Monitoring and Transfer Fulfillment*/
    private org.museframework.bian.classes.Object cashPositionMonitoringandTransferFulfillmentReference;

    /*The type of Cash Position Monitoring and Transfer Fulfillment*/
    private String cashPositionMonitoringandTransferFulfillmentType;

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

    public void setAccountBalanceSweepingFacilityReference(org.museframework.bian.classes.FinancialFacility accountBalanceSweepingFacilityReference) {
        this.accountBalanceSweepingFacilityReference = accountBalanceSweepingFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getAccountBalanceSweepingFacilityReference() {
        return accountBalanceSweepingFacilityReference;
    }

    public void setCashPositionMonitoringandTransferFulfillmentReference(org.museframework.bian.classes.Object cashPositionMonitoringandTransferFulfillmentReference) {
        this.cashPositionMonitoringandTransferFulfillmentReference = cashPositionMonitoringandTransferFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getCashPositionMonitoringandTransferFulfillmentReference() {
        return cashPositionMonitoringandTransferFulfillmentReference;
    }

    public void setCashPositionMonitoringandTransferFulfillmentType(String cashPositionMonitoringandTransferFulfillmentType) {
        this.cashPositionMonitoringandTransferFulfillmentType = cashPositionMonitoringandTransferFulfillmentType;
    }

    public String getCashPositionMonitoringandTransferFulfillmentType() {
        return cashPositionMonitoringandTransferFulfillmentType;
    }
}