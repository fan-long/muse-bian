/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.productdirectory.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SalesandMarketing {
    /*Descriptive materials/brochures organized for selective access*/
    @MetaField(0)
    private String productandServiceSalesMaterial;

    /*Descriptions of product features and product options for review*/
    @MetaField(0)
    private String productandServicesFeaturesAndOptions;

    /*Allowed price/rate ranges by credit grade/customer type (can be reviewed through simulation)*/
    @MetaField(0)
    private String productandServicePricingTable;

    /*Applicable fees/penalties (can be reviewed through simulation)*/
    @MetaField(0)
    private String productandServiceFeesPenaltiesTable;

    /*Defines suitability requirements set by the bank*/
    @MetaField(0)
    private String productSuitabilityGuide;

    /*Applicable legal or regulatory requirements governing eligibility*/
    @MetaField(0)
    private String productandServiceEligibilityType;

    /*Description/explanation of eligibility requirements, can include required disclosures*/
    @MetaField(0)
    private String productandServiceEligibilityDescription;

    /*Details the tasks required to complete a customer offer*/
    @MetaField(0)
    private String productandServiceOfferProcessingRequirements;

    public void setProductandServiceSalesMaterial(String productandServiceSalesMaterial) {
        this.productandServiceSalesMaterial = productandServiceSalesMaterial;
    }

    public String getProductandServiceSalesMaterial() {
        return productandServiceSalesMaterial;
    }

    public void setProductandServicesFeaturesAndOptions(String productandServicesFeaturesAndOptions) {
        this.productandServicesFeaturesAndOptions = productandServicesFeaturesAndOptions;
    }

    public String getProductandServicesFeaturesAndOptions() {
        return productandServicesFeaturesAndOptions;
    }

    public void setProductandServicePricingTable(String productandServicePricingTable) {
        this.productandServicePricingTable = productandServicePricingTable;
    }

    public String getProductandServicePricingTable() {
        return productandServicePricingTable;
    }

    public void setProductandServiceFeesPenaltiesTable(String productandServiceFeesPenaltiesTable) {
        this.productandServiceFeesPenaltiesTable = productandServiceFeesPenaltiesTable;
    }

    public String getProductandServiceFeesPenaltiesTable() {
        return productandServiceFeesPenaltiesTable;
    }

    public void setProductSuitabilityGuide(String productSuitabilityGuide) {
        this.productSuitabilityGuide = productSuitabilityGuide;
    }

    public String getProductSuitabilityGuide() {
        return productSuitabilityGuide;
    }

    public void setProductandServiceEligibilityType(String productandServiceEligibilityType) {
        this.productandServiceEligibilityType = productandServiceEligibilityType;
    }

    public String getProductandServiceEligibilityType() {
        return productandServiceEligibilityType;
    }

    public void setProductandServiceEligibilityDescription(String productandServiceEligibilityDescription) {
        this.productandServiceEligibilityDescription = productandServiceEligibilityDescription;
    }

    public String getProductandServiceEligibilityDescription() {
        return productandServiceEligibilityDescription;
    }

    public void setProductandServiceOfferProcessingRequirements(String productandServiceOfferProcessingRequirements) {
        this.productandServiceOfferProcessingRequirements = productandServiceOfferProcessingRequirements;
    }

    public String getProductandServiceOfferProcessingRequirements() {
        return productandServiceOfferProcessingRequirements;
    }
}