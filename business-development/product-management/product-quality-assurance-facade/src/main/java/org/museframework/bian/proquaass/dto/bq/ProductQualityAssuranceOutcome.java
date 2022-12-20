/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Quality Assurance. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.proquaass.dto.bq;

public class ProductQualityAssuranceOutcome {
    /**/
    private String productQualityAssuranceWorkProduct;

    /**/
    private String productQualityAssuranceAssessmentType;

    public void setProductQualityAssuranceWorkProduct(String productQualityAssuranceWorkProduct) {
        this.productQualityAssuranceWorkProduct = productQualityAssuranceWorkProduct;
    }

    public String getProductQualityAssuranceWorkProduct() {
        return productQualityAssuranceWorkProduct;
    }

    public void setProductQualityAssuranceAssessmentType(String productQualityAssuranceAssessmentType) {
        this.productQualityAssuranceAssessmentType = productQualityAssuranceAssessmentType;
    }

    public String getProductQualityAssuranceAssessmentType() {
        return productQualityAssuranceAssessmentType;
    }
}