/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.fraudmodel.dto.bq;

public class Production {
    /*Specification of the operational and technical requirements*/
    private String fraudModelOperationalRequirements;

    /*Defines rules and suitability for model usage*/
    private String fraudModelAllowedUsage;

    /*Provides guidance on the use of the model*/
    private String fraudModelUsageGuidelines;

    public void setFraudModelOperationalRequirements(String fraudModelOperationalRequirements) {
        this.fraudModelOperationalRequirements = fraudModelOperationalRequirements;
    }

    public String getFraudModelOperationalRequirements() {
        return fraudModelOperationalRequirements;
    }

    public void setFraudModelAllowedUsage(String fraudModelAllowedUsage) {
        this.fraudModelAllowedUsage = fraudModelAllowedUsage;
    }

    public String getFraudModelAllowedUsage() {
        return fraudModelAllowedUsage;
    }

    public void setFraudModelUsageGuidelines(String fraudModelUsageGuidelines) {
        this.fraudModelUsageGuidelines = fraudModelUsageGuidelines;
    }

    public String getFraudModelUsageGuidelines() {
        return fraudModelUsageGuidelines;
    }
}