/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.productdirectory.dto.bq;

public class Servicing {
    /*Selectable product or service feature associated with servicing a product or service*/
    private String productandServiceFeature;

    /*Explanation/guidelines for the product or service feature (can be assisted or self serve)*/
    private String productandServiceFeatureGuideline;

    /*Diagnosis guide for addressing reported issues with a product or service feature*/
    private String productandServiceFeatureProblemDiagnosis;

    /*Resolution guide for resolving reported issue with a product or service feature*/
    private String productandServiceFeatureProblemResolution;

    public void setProductandServiceFeature(String productandServiceFeature) {
        this.productandServiceFeature = productandServiceFeature;
    }

    public String getProductandServiceFeature() {
        return productandServiceFeature;
    }

    public void setProductandServiceFeatureGuideline(String productandServiceFeatureGuideline) {
        this.productandServiceFeatureGuideline = productandServiceFeatureGuideline;
    }

    public String getProductandServiceFeatureGuideline() {
        return productandServiceFeatureGuideline;
    }

    public void setProductandServiceFeatureProblemDiagnosis(String productandServiceFeatureProblemDiagnosis) {
        this.productandServiceFeatureProblemDiagnosis = productandServiceFeatureProblemDiagnosis;
    }

    public String getProductandServiceFeatureProblemDiagnosis() {
        return productandServiceFeatureProblemDiagnosis;
    }

    public void setProductandServiceFeatureProblemResolution(String productandServiceFeatureProblemResolution) {
        this.productandServiceFeatureProblemResolution = productandServiceFeatureProblemResolution;
    }

    public String getProductandServiceFeatureProblemResolution() {
        return productandServiceFeatureProblemResolution;
    }
}