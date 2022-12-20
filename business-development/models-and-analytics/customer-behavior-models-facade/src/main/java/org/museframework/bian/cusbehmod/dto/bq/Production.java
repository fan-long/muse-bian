/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.cusbehmod.dto.bq;

public class Production {
    /*Specification of the operational and technical requirements*/
    private String customerBehaviorModelOperationalRequirements;

    /*Defines rules and suitability for model usage*/
    private String customerBehaviorModelAllowedUsage;

    /*Provides guidance on the use of the model*/
    private String customerBehaviorModelUsageGuidelines;

    public void setCustomerBehaviorModelOperationalRequirements(String customerBehaviorModelOperationalRequirements) {
        this.customerBehaviorModelOperationalRequirements = customerBehaviorModelOperationalRequirements;
    }

    public String getCustomerBehaviorModelOperationalRequirements() {
        return customerBehaviorModelOperationalRequirements;
    }

    public void setCustomerBehaviorModelAllowedUsage(String customerBehaviorModelAllowedUsage) {
        this.customerBehaviorModelAllowedUsage = customerBehaviorModelAllowedUsage;
    }

    public String getCustomerBehaviorModelAllowedUsage() {
        return customerBehaviorModelAllowedUsage;
    }

    public void setCustomerBehaviorModelUsageGuidelines(String customerBehaviorModelUsageGuidelines) {
        this.customerBehaviorModelUsageGuidelines = customerBehaviorModelUsageGuidelines;
    }

    public String getCustomerBehaviorModelUsageGuidelines() {
        return customerBehaviorModelUsageGuidelines;
    }
}