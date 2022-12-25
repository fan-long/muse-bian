/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Advertising.*/
package org.museframework.bian.advertising.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.AdvertisingCampaignManagementPlan
@MetaDto
public class AdvertisingCampaignManagementPlan {
    /*The collection of advertising campaigns that is used to assess performance and coverage and direct development and execution activity*/
    @MetaField(0)
    private String advertisingCampaignPortfolio;

    /*The type of advertising campaign (e.g. media, mailshot, web-based)*/
    @MetaField(0)
    private String advertisingCampaignType;

    /*A description of the campaign that clarifies the content and media to be used in the advertising campaign and outlines the target audience*/
    @MetaField(0)
    private String advertisingCampaignDescription;

    /*Metrics that are defined to assess the target and actual impact of the campaign*/
    @MetaField(0)
    private String advertisingCampaignMetrics;

    /*A description of the metric, defining how it is to be measured in deployment*/
    @MetaField(0)
    private String advertisingCampaignMetricDefinition;

    /*A description of the target performance for the metric that can be defined for different usage scenarios as appropriate*/
    @MetaField(0)
    private String advertisingCampaignMetricGoal;

    /*Maintains a record of the use and impact of the advertising campaign*/
    @MetaField(0)
    private String advertisingCampaignPerformanceRecord;

    /*Reference to the advertising campaign execution*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object advertisingCampaignProcedureInstanceReference;

    /*The execution plan for the advertising campaign, including external agencies employed, content development and execution tasks*/
    @MetaField(0)
    private String advertisingCampaignExecutionPlan;

    /*Reference to the business unit responsible for the campaign execution*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*The period over which the advertising is executed*/
    @MetaField(0)
    private String advertisingCampaignDuration;

    /*The result/impact of the overall advertising campaign event (can refer to any detected up-tick in sales or servicing activity)*/
    @MetaField(0)
    private String advertisingCampaignProcedureResult;

    public void setAdvertisingCampaignPortfolio(String advertisingCampaignPortfolio) {
        this.advertisingCampaignPortfolio = advertisingCampaignPortfolio;
    }

    public String getAdvertisingCampaignPortfolio() {
        return advertisingCampaignPortfolio;
    }

    public void setAdvertisingCampaignType(String advertisingCampaignType) {
        this.advertisingCampaignType = advertisingCampaignType;
    }

    public String getAdvertisingCampaignType() {
        return advertisingCampaignType;
    }

    public void setAdvertisingCampaignDescription(String advertisingCampaignDescription) {
        this.advertisingCampaignDescription = advertisingCampaignDescription;
    }

    public String getAdvertisingCampaignDescription() {
        return advertisingCampaignDescription;
    }

    public void setAdvertisingCampaignMetrics(String advertisingCampaignMetrics) {
        this.advertisingCampaignMetrics = advertisingCampaignMetrics;
    }

    public String getAdvertisingCampaignMetrics() {
        return advertisingCampaignMetrics;
    }

    public void setAdvertisingCampaignMetricDefinition(String advertisingCampaignMetricDefinition) {
        this.advertisingCampaignMetricDefinition = advertisingCampaignMetricDefinition;
    }

    public String getAdvertisingCampaignMetricDefinition() {
        return advertisingCampaignMetricDefinition;
    }

    public void setAdvertisingCampaignMetricGoal(String advertisingCampaignMetricGoal) {
        this.advertisingCampaignMetricGoal = advertisingCampaignMetricGoal;
    }

    public String getAdvertisingCampaignMetricGoal() {
        return advertisingCampaignMetricGoal;
    }

    public void setAdvertisingCampaignPerformanceRecord(String advertisingCampaignPerformanceRecord) {
        this.advertisingCampaignPerformanceRecord = advertisingCampaignPerformanceRecord;
    }

    public String getAdvertisingCampaignPerformanceRecord() {
        return advertisingCampaignPerformanceRecord;
    }

    public void setAdvertisingCampaignProcedureInstanceReference(org.museframework.bian.classes.Object advertisingCampaignProcedureInstanceReference) {
        this.advertisingCampaignProcedureInstanceReference = advertisingCampaignProcedureInstanceReference;
    }

    public org.museframework.bian.classes.Object getAdvertisingCampaignProcedureInstanceReference() {
        return advertisingCampaignProcedureInstanceReference;
    }

    public void setAdvertisingCampaignExecutionPlan(String advertisingCampaignExecutionPlan) {
        this.advertisingCampaignExecutionPlan = advertisingCampaignExecutionPlan;
    }

    public String getAdvertisingCampaignExecutionPlan() {
        return advertisingCampaignExecutionPlan;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setAdvertisingCampaignDuration(String advertisingCampaignDuration) {
        this.advertisingCampaignDuration = advertisingCampaignDuration;
    }

    public String getAdvertisingCampaignDuration() {
        return advertisingCampaignDuration;
    }

    public void setAdvertisingCampaignProcedureResult(String advertisingCampaignProcedureResult) {
        this.advertisingCampaignProcedureResult = advertisingCampaignProcedureResult;
    }

    public String getAdvertisingCampaignProcedureResult() {
        return advertisingCampaignProcedureResult;
    }
}