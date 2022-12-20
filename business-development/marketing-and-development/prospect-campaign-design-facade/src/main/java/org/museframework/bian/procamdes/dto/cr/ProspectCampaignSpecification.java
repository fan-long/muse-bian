/*Create and maintain a design for a procedure, product/service model or other such entity  within Prospect Campaign Design. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.procamdes.dto.cr;

public class ProspectCampaignSpecification {
    /*The type or category of prospect campaign (e.g. direct acquisition, product discount incentive)*/
    private String prospectCampaignType;

    /*A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact*/
    private String prospectCampaignDescription;

    /*Metrics that are defined to assess the target and actual impact of the campaign*/
    private String prospectCampaignMetrics;

    /*A description of the metric, defining how it is to be measured in deployment*/
    private String prospectCampaignMetricDefinition;

    /*A description of the target performance for the metric that can be defined for different usage scenarios as appropriate*/
    private String prospectCampaignMetricGoal;

    /*The precise make-up of the campaign. Note that all prospect campaign specifications are subject to versioning as the campaign is refined over time.*/
    private String prospectCampaignSpecification;

    /*Details how the campaign aligns with selected products and services, including pricing considerations*/
    private String prospectCampaignProductandServiceUsage;

    /*The type or category of product or service included in the campaign (e.g. current account)*/
    private String prospectCampaignProductandServiceType;

    /*A description of how the product or service is adapted in the context of the campaign (e.g. discounted pricing/preferential rates, waived service fees, gifts or incentives)*/
    private String productandServiceCampaignEngagementDescription;

    /*Describes how any discounted costs are to be accounted for by the product fulfillment function (e.g. borne by fulfillment business unit, compensated by campaign budget)*/
    private String productandServiceCampaignTransferPricingArrangement;

    /*Guidelines for the execution of the campaign*/
    private String prospectCampaignExecutionGuidelines;

    /*Defines the eligibility criteria that are to be applied to select suitable candidates for the prospect campaign. (Note candidate lists are developed by Campaign Execution)*/
    private String prospectCampaignEligibility;

    /*Defines any qualifications or credentials required of the bank unit or employees to execute the campaign (e.g. product certified, sign-off authority level)*/
    private String prospectCampaignQualifications;

    /*Provides the structured narrative and any pricing/negotiating frameworks that are used in the execution of the campaign*/
    private String prospectCampaignInteractionGuide;

    /*Design specification of any consumables that are to be used in the execution of the campaign (e.g. brochures)*/
    private String prospectCampaignConsumables;

    /*The type of consumable item associated with the campaign (e.g. gift, brochure)*/
    private String prospectCampaignConsumableType;

    /*The specification of the consumable item in whatever form appropriate. Note sourcing/procurement of the item is handled by execution)*/
    private String prospectCampaignConsumableDescription;

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

    /*The result/impact of the overall prospect campaign event (that can include multiple identified leads/opportunities)*/
    private String prospectCampaignProcedureResult;

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

    public void setProspectCampaignSpecification(String prospectCampaignSpecification) {
        this.prospectCampaignSpecification = prospectCampaignSpecification;
    }

    public String getProspectCampaignSpecification() {
        return prospectCampaignSpecification;
    }

    public void setProspectCampaignProductandServiceUsage(String prospectCampaignProductandServiceUsage) {
        this.prospectCampaignProductandServiceUsage = prospectCampaignProductandServiceUsage;
    }

    public String getProspectCampaignProductandServiceUsage() {
        return prospectCampaignProductandServiceUsage;
    }

    public void setProspectCampaignProductandServiceType(String prospectCampaignProductandServiceType) {
        this.prospectCampaignProductandServiceType = prospectCampaignProductandServiceType;
    }

    public String getProspectCampaignProductandServiceType() {
        return prospectCampaignProductandServiceType;
    }

    public void setProductandServiceCampaignEngagementDescription(String productandServiceCampaignEngagementDescription) {
        this.productandServiceCampaignEngagementDescription = productandServiceCampaignEngagementDescription;
    }

    public String getProductandServiceCampaignEngagementDescription() {
        return productandServiceCampaignEngagementDescription;
    }

    public void setProductandServiceCampaignTransferPricingArrangement(String productandServiceCampaignTransferPricingArrangement) {
        this.productandServiceCampaignTransferPricingArrangement = productandServiceCampaignTransferPricingArrangement;
    }

    public String getProductandServiceCampaignTransferPricingArrangement() {
        return productandServiceCampaignTransferPricingArrangement;
    }

    public void setProspectCampaignExecutionGuidelines(String prospectCampaignExecutionGuidelines) {
        this.prospectCampaignExecutionGuidelines = prospectCampaignExecutionGuidelines;
    }

    public String getProspectCampaignExecutionGuidelines() {
        return prospectCampaignExecutionGuidelines;
    }

    public void setProspectCampaignEligibility(String prospectCampaignEligibility) {
        this.prospectCampaignEligibility = prospectCampaignEligibility;
    }

    public String getProspectCampaignEligibility() {
        return prospectCampaignEligibility;
    }

    public void setProspectCampaignQualifications(String prospectCampaignQualifications) {
        this.prospectCampaignQualifications = prospectCampaignQualifications;
    }

    public String getProspectCampaignQualifications() {
        return prospectCampaignQualifications;
    }

    public void setProspectCampaignInteractionGuide(String prospectCampaignInteractionGuide) {
        this.prospectCampaignInteractionGuide = prospectCampaignInteractionGuide;
    }

    public String getProspectCampaignInteractionGuide() {
        return prospectCampaignInteractionGuide;
    }

    public void setProspectCampaignConsumables(String prospectCampaignConsumables) {
        this.prospectCampaignConsumables = prospectCampaignConsumables;
    }

    public String getProspectCampaignConsumables() {
        return prospectCampaignConsumables;
    }

    public void setProspectCampaignConsumableType(String prospectCampaignConsumableType) {
        this.prospectCampaignConsumableType = prospectCampaignConsumableType;
    }

    public String getProspectCampaignConsumableType() {
        return prospectCampaignConsumableType;
    }

    public void setProspectCampaignConsumableDescription(String prospectCampaignConsumableDescription) {
        this.prospectCampaignConsumableDescription = prospectCampaignConsumableDescription;
    }

    public String getProspectCampaignConsumableDescription() {
        return prospectCampaignConsumableDescription;
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