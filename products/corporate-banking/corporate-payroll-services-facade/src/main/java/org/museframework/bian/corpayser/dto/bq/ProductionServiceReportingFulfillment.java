/*The configuration and execution of Employee Payroll Details Maintenance Fulfillment arrangement within the Employee Payroll Details Maintenance Fulfillment*/
package org.museframework.bian.corpayser.dto.bq;

public class ProductionServiceReportingFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Production Service Reporting Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Production Service Reporting Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility employeePaymentServicesFacilityReference;

    /*Reference to Production Service Reporting Fulfillment*/
    private org.museframework.bian.classes.Object productionServiceReportingFulfillmentReference;

    /*The type of Production Service Reporting Fulfillment*/
    private String productionServiceReportingFulfillmentType;

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

    public void setEmployeePaymentServicesFacilityReference(org.museframework.bian.classes.FinancialFacility employeePaymentServicesFacilityReference) {
        this.employeePaymentServicesFacilityReference = employeePaymentServicesFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getEmployeePaymentServicesFacilityReference() {
        return employeePaymentServicesFacilityReference;
    }

    public void setProductionServiceReportingFulfillmentReference(org.museframework.bian.classes.Object productionServiceReportingFulfillmentReference) {
        this.productionServiceReportingFulfillmentReference = productionServiceReportingFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getProductionServiceReportingFulfillmentReference() {
        return productionServiceReportingFulfillmentReference;
    }

    public void setProductionServiceReportingFulfillmentType(String productionServiceReportingFulfillmentType) {
        this.productionServiceReportingFulfillmentType = productionServiceReportingFulfillmentType;
    }

    public String getProductionServiceReportingFulfillmentType() {
        return productionServiceReportingFulfillmentType;
    }
}