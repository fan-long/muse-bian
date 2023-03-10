/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.productdesign.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Production {
    /*Specification of the operational and technical requirements*/
    @MetaField(0)
    private String productandServiceSpecificationOperationalRequirements;

    /*Defines rules and suitability for the product or service usage*/
    @MetaField(0)
    private String productandServiceSpecificationAllowedUsage;

    /*Provides guidance on the use of the product or service*/
    @MetaField(0)
    private String productandServiceSpecificationUsageGuidelines;

    public void setProductandServiceSpecificationOperationalRequirements(String productandServiceSpecificationOperationalRequirements) {
        this.productandServiceSpecificationOperationalRequirements = productandServiceSpecificationOperationalRequirements;
    }

    public String getProductandServiceSpecificationOperationalRequirements() {
        return productandServiceSpecificationOperationalRequirements;
    }

    public void setProductandServiceSpecificationAllowedUsage(String productandServiceSpecificationAllowedUsage) {
        this.productandServiceSpecificationAllowedUsage = productandServiceSpecificationAllowedUsage;
    }

    public String getProductandServiceSpecificationAllowedUsage() {
        return productandServiceSpecificationAllowedUsage;
    }

    public void setProductandServiceSpecificationUsageGuidelines(String productandServiceSpecificationUsageGuidelines) {
        this.productandServiceSpecificationUsageGuidelines = productandServiceSpecificationUsageGuidelines;
    }

    public String getProductandServiceSpecificationUsageGuidelines() {
        return productandServiceSpecificationUsageGuidelines;
    }
}