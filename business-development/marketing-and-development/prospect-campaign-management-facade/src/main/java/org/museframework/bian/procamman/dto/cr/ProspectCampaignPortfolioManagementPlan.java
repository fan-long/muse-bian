/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Prospect Campaign Management.*/
package org.museframework.bian.procamman.dto.cr;

public class ProspectCampaignPortfolioManagementPlan {
    /*The collection/portfolio of available prospect campaigns. The details are used to assess performance and coverage and direct development and execution activity*/
    private String prospectCampaignPortfolio;

    /*The type or category of prospect campaign (e.g. mailshot, targeted solicitation, discounted product incentive)*/
    private String prospectCampaignType;

    /*A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact*/
    private String prospectCampaignDescription;

    /*Metrics that are defined to assess the target and actual impact of the campaign*/
    private String prospectCampaignMetrics;

    /*A description of the metric, defining how it is to be measured in deployment*/
    private String prospectCampaignMetricDefinition;

    /*A description of the target performance for the metric that can be defined for different usage scenarios as appropriate*/
    private String prospectCampaignMetricGoal;

    /*Maintains a record of the use and impact of prospect campaign versions over the life of the campaign*/
    private String prospectCampaignPerformanceRecord;

    /*Reference to the prospect campaign execution event*/
    private org.museframework.bian.classes.Object prospectCampaignProcedureInstanceReference;

    /*Reference to the business unit responsible for the campaign execution*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Details of the deployment set-up/configuration of the campaign for reference*/
    private String prospectCampaignProcedureSet_up;

    /*The prospect campaign version number used in the event*/
    private String prospectCampaignProcedureVersionNumber;

    /*The result/impact of the overall prospect campaign event (that can include multiple identified prospects)*/
    private String prospectCampaignProcedureResult;

    public void setProspectCampaignPortfolio(String prospectCampaignPortfolio) {
        this.prospectCampaignPortfolio = prospectCampaignPortfolio;
    }

    public String getProspectCampaignPortfolio() {
        return prospectCampaignPortfolio;
    }

    public void setProspectCampaignType(String prospectCampaignType) {
        this.prospectCampaignType = prospectCampaignType;
    }

    public String getProspectCampaignType() {
        return prospectCampaignType;
    }

    public void setProspectCampaignDescription(String prospectCampaignDescription) {
        this.prospectCampaignDescription = prospectCampaignDescription;
    }

    public String getProspectCampaignDescription() {
        return prospectCampaignDescription;
    }

    public void setProspectCampaignMetrics(String prospectCampaignMetrics) {
        this.prospectCampaignMetrics = prospectCampaignMetrics;
    }

    public String getProspectCampaignMetrics() {
        return prospectCampaignMetrics;
    }

    public void setProspectCampaignMetricDefinition(String prospectCampaignMetricDefinition) {
        this.prospectCampaignMetricDefinition = prospectCampaignMetricDefinition;
    }

    public String getProspectCampaignMetricDefinition() {
        return prospectCampaignMetricDefinition;
    }

    public void setProspectCampaignMetricGoal(String prospectCampaignMetricGoal) {
        this.prospectCampaignMetricGoal = prospectCampaignMetricGoal;
    }

    public String getProspectCampaignMetricGoal() {
        return prospectCampaignMetricGoal;
    }

    public void setProspectCampaignPerformanceRecord(String prospectCampaignPerformanceRecord) {
        this.prospectCampaignPerformanceRecord = prospectCampaignPerformanceRecord;
    }

    public String getProspectCampaignPerformanceRecord() {
        return prospectCampaignPerformanceRecord;
    }

    public void setProspectCampaignProcedureInstanceReference(org.museframework.bian.classes.Object prospectCampaignProcedureInstanceReference) {
        this.prospectCampaignProcedureInstanceReference = prospectCampaignProcedureInstanceReference;
    }

    public org.museframework.bian.classes.Object getProspectCampaignProcedureInstanceReference() {
        return prospectCampaignProcedureInstanceReference;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setProspectCampaignProcedureSet_up(String prospectCampaignProcedureSet_up) {
        this.prospectCampaignProcedureSet_up = prospectCampaignProcedureSet_up;
    }

    public String getProspectCampaignProcedureSet_up() {
        return prospectCampaignProcedureSet_up;
    }

    public void setProspectCampaignProcedureVersionNumber(String prospectCampaignProcedureVersionNumber) {
        this.prospectCampaignProcedureVersionNumber = prospectCampaignProcedureVersionNumber;
    }

    public String getProspectCampaignProcedureVersionNumber() {
        return prospectCampaignProcedureVersionNumber;
    }

    public void setProspectCampaignProcedureResult(String prospectCampaignProcedureResult) {
        this.prospectCampaignProcedureResult = prospectCampaignProcedureResult;
    }

    public String getProspectCampaignProcedureResult() {
        return prospectCampaignProcedureResult;
    }
}