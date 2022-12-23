/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.fraudmodel.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Production {
    /*Specification of the operational and technical requirements*/
    @MetaField
    private String fraudModelOperationalRequirements;

    /*Defines rules and suitability for model usage*/
    @MetaField
    private String fraudModelAllowedUsage;

    /*Provides guidance on the use of the model*/
    @MetaField
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