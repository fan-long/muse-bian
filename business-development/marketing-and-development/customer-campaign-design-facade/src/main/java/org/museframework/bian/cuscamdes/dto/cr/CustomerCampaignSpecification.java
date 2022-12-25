/*Create and maintain a design for a procedure, product/service model or other such entity  within Customer Campaign Design. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.cuscamdes.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerCampaignSpecification {
    /*The type or category of customer campaign (e.g. cross-sell, up-sell, retention)*/
    @MetaField(0)
    private String customerCampaignType;

    /*A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact*/
    @MetaField(0)
    private String customerCampaignDescription;

    /*Metrics that are defined to assess the target and actual impact of the campaign*/
    @MetaField(0)
    private String customerCampaignMetrics;

    /*A description of the metric, defining how it is to be measured in deployment*/
    @MetaField(0)
    private String customerCampaignMetricDefinition;

    /*A description of the target performance for the metric that can be defined for different usage scenarios as appropriate*/
    @MetaField(0)
    private String customerCampaignMetricGoal;

    /*The precise make-up of the campaign. Note that all customer campaign specifications are subject to versioning as the campaign is refined over time.*/
    @MetaField(0)
    private String customerCampaignSpecification;

    /*Details how the campaign aligns with selected products and services, including pricing considerations*/
    @MetaField(0)
    private String customerCampaignProductandServiceUsage;

    /*The type or category of product or service included in the campaign (e.g. current account)*/
    @MetaField(0)
    private String customerCampaignProductandServiceType;

    /*A description of how the product or service is adapted in the context of the campaign (e.g. discounted pricing/preferential rates, waived service fees, gifts or incentives)*/
    @MetaField(0)
    private String productandServiceCampaignEngagementDescription;

    /*Describes how any discounted costs are to be accounted for by the product fulfillment function (e.g. borne by fulfillment business unit, compensated by campaign budget)*/
    @MetaField(0)
    private String productandServiceCampaignTransferPricingArrangement;

    /*Guidelines for the execution of the campaign*/
    @MetaField(0)
    private String customerCampaignExecutionGuidelines;

    /*Defines the eligibility criteria that are to be applied to select suitable candidates for the customer campaign. (Note candidate lists are developed by Campaign Execution)*/
    @MetaField(0)
    private String customerCampaignEligibility;

    /*Defines any qualifications or credentials required of the bank unit or employees to execute the campaign (e.g. product certified, sign-off authority level)*/
    @MetaField(0)
    private String customerCampaignQualifications;

    /*Provides the structured narrative and any pricing/negotiating frameworks that are used in the execution of the campaign*/
    @MetaField(0)
    private String customerCampaignInteractionGuide;

    /*Design specification of any consumables that are to be used in the execution of the campaign (e.g. brochures)*/
    @MetaField(0)
    private String customerCampaignConsumables;

    /*The type of consumable item associated with the campaign (e.g. gift, brochure)*/
    @MetaField(0)
    private String customerCampaignConsumableType;

    /*The specification of the consumable item in whatever form appropriate. Note sourcing/procurement of the item is handled by execution)*/
    @MetaField(0)
    private String customerCampaignConsumableDescription;

    /*Maintains a record of the use and impact of customer campaign versions over the life of the campaign*/
    @MetaField(0)
    private String customerCampaignPerformanceRecord;

    /*Reference to the customer campaign execution event*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerCampaignProcedureInstanceReference;

    /*Reference to the business unit responsible for the campaign execution*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Details of the deployment set-up/configuration of the campaign for reference*/
    @MetaField(0)
    private String customerCampaignProcedureSet_up;

    /*The customer campaign version number used in the event*/
    @MetaField(0)
    private String customerCampaignProcedureVersionNumber;

    /*The result/impact of the overall customer campaign event (that can include multiple identified leads/opportunities)*/
    @MetaField(0)
    private String customerCampaignProcedureResult;

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

    public void setCustomerCampaignSpecification(String customerCampaignSpecification) {
        this.customerCampaignSpecification = customerCampaignSpecification;
    }

    public String getCustomerCampaignSpecification() {
        return customerCampaignSpecification;
    }

    public void setCustomerCampaignProductandServiceUsage(String customerCampaignProductandServiceUsage) {
        this.customerCampaignProductandServiceUsage = customerCampaignProductandServiceUsage;
    }

    public String getCustomerCampaignProductandServiceUsage() {
        return customerCampaignProductandServiceUsage;
    }

    public void setCustomerCampaignProductandServiceType(String customerCampaignProductandServiceType) {
        this.customerCampaignProductandServiceType = customerCampaignProductandServiceType;
    }

    public String getCustomerCampaignProductandServiceType() {
        return customerCampaignProductandServiceType;
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

    public void setCustomerCampaignExecutionGuidelines(String customerCampaignExecutionGuidelines) {
        this.customerCampaignExecutionGuidelines = customerCampaignExecutionGuidelines;
    }

    public String getCustomerCampaignExecutionGuidelines() {
        return customerCampaignExecutionGuidelines;
    }

    public void setCustomerCampaignEligibility(String customerCampaignEligibility) {
        this.customerCampaignEligibility = customerCampaignEligibility;
    }

    public String getCustomerCampaignEligibility() {
        return customerCampaignEligibility;
    }

    public void setCustomerCampaignQualifications(String customerCampaignQualifications) {
        this.customerCampaignQualifications = customerCampaignQualifications;
    }

    public String getCustomerCampaignQualifications() {
        return customerCampaignQualifications;
    }

    public void setCustomerCampaignInteractionGuide(String customerCampaignInteractionGuide) {
        this.customerCampaignInteractionGuide = customerCampaignInteractionGuide;
    }

    public String getCustomerCampaignInteractionGuide() {
        return customerCampaignInteractionGuide;
    }

    public void setCustomerCampaignConsumables(String customerCampaignConsumables) {
        this.customerCampaignConsumables = customerCampaignConsumables;
    }

    public String getCustomerCampaignConsumables() {
        return customerCampaignConsumables;
    }

    public void setCustomerCampaignConsumableType(String customerCampaignConsumableType) {
        this.customerCampaignConsumableType = customerCampaignConsumableType;
    }

    public String getCustomerCampaignConsumableType() {
        return customerCampaignConsumableType;
    }

    public void setCustomerCampaignConsumableDescription(String customerCampaignConsumableDescription) {
        this.customerCampaignConsumableDescription = customerCampaignConsumableDescription;
    }

    public String getCustomerCampaignConsumableDescription() {
        return customerCampaignConsumableDescription;
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