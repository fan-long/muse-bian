/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Customer Campaign Management.*/
package org.museframework.bian.cuscamman.dto.cr;

public class CustomerCampaignPortfolioManagementPlan {
    /*The collection/portfolio of available customer campaigns. The details are used to assess performance and coverage and direct development and execution activity*/
    private String customerCampaignPortfolio;

    /*The type or category of customer campaign (e.g. cross-sell, up-sell, retention)*/
    private String customerCampaignType;

    /*A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact*/
    private String customerCampaignDescription;

    /*Metrics that are defined to assess the target and actual impact of the campaign*/
    private String customerCampaignMetrics;

    /*A description of the metric, defining how it is to be measured in deployment*/
    private String customerCampaignMetricDefinition;

    /*A description of the target performance for the metric that can be defined for different usage scenarios as appropriate*/
    private String customerCampaignMetricGoal;

    /*Maintains a record of the use and impact of customer campaign versions over the life of the campaign*/
    private String customerCampaignPerformanceRecord;

    /*Reference to the customer campaign execution event*/
    private org.museframework.bian.classes.Object customerCampaignProcedureInstanceReference;

    /*Reference to the business unit responsible for the campaign execution*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Details of the deployment set-up/configuration of the campaign for reference*/
    private String customerCampaignProcedureSet_up;

    /*The customer campaign version number used in the event*/
    private String customerCampaignProcedureVersionNumber;

    /*The result/impact of the overall customer campaign event (that can include multiple identified leads/opportunities)*/
    private String customerCampaignProcedureResult;

    public void setCustomerCampaignPortfolio(String customerCampaignPortfolio) {
        this.customerCampaignPortfolio = customerCampaignPortfolio;
    }

    public String getCustomerCampaignPortfolio() {
        return customerCampaignPortfolio;
    }

    public void setCustomerCampaignType(String customerCampaignType) {
        this.customerCampaignType = customerCampaignType;
    }

    public String getCustomerCampaignType() {
        return customerCampaignType;
    }

    public void setCustomerCampaignDescription(String customerCampaignDescription) {
        this.customerCampaignDescription = customerCampaignDescription;
    }

    public String getCustomerCampaignDescription() {
        return customerCampaignDescription;
    }

    public void setCustomerCampaignMetrics(String customerCampaignMetrics) {
        this.customerCampaignMetrics = customerCampaignMetrics;
    }

    public String getCustomerCampaignMetrics() {
        return customerCampaignMetrics;
    }

    public void setCustomerCampaignMetricDefinition(String customerCampaignMetricDefinition) {
        this.customerCampaignMetricDefinition = customerCampaignMetricDefinition;
    }

    public String getCustomerCampaignMetricDefinition() {
        return customerCampaignMetricDefinition;
    }

    public void setCustomerCampaignMetricGoal(String customerCampaignMetricGoal) {
        this.customerCampaignMetricGoal = customerCampaignMetricGoal;
    }

    public String getCustomerCampaignMetricGoal() {
        return customerCampaignMetricGoal;
    }

    public void setCustomerCampaignPerformanceRecord(String customerCampaignPerformanceRecord) {
        this.customerCampaignPerformanceRecord = customerCampaignPerformanceRecord;
    }

    public String getCustomerCampaignPerformanceRecord() {
        return customerCampaignPerformanceRecord;
    }

    public void setCustomerCampaignProcedureInstanceReference(org.museframework.bian.classes.Object customerCampaignProcedureInstanceReference) {
        this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
    }

    public org.museframework.bian.classes.Object getCustomerCampaignProcedureInstanceReference() {
        return customerCampaignProcedureInstanceReference;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerCampaignProcedureSet_up(String customerCampaignProcedureSet_up) {
        this.customerCampaignProcedureSet_up = customerCampaignProcedureSet_up;
    }

    public String getCustomerCampaignProcedureSet_up() {
        return customerCampaignProcedureSet_up;
    }

    public void setCustomerCampaignProcedureVersionNumber(String customerCampaignProcedureVersionNumber) {
        this.customerCampaignProcedureVersionNumber = customerCampaignProcedureVersionNumber;
    }

    public String getCustomerCampaignProcedureVersionNumber() {
        return customerCampaignProcedureVersionNumber;
    }

    public void setCustomerCampaignProcedureResult(String customerCampaignProcedureResult) {
        this.customerCampaignProcedureResult = customerCampaignProcedureResult;
    }

    public String getCustomerCampaignProcedureResult() {
        return customerCampaignProcedureResult;
    }
}