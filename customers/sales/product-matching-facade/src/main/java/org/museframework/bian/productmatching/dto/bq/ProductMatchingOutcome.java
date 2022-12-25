/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Matching. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.productmatching.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductMatchingOutcome {
    /**/
    @MetaField(0)
    private String productMatchingWorkProduct;

    /**/
    @MetaField(0)
    private String productMatchingAssessmentType;

    public void setProductMatchingWorkProduct(String productMatchingWorkProduct) {
        this.productMatchingWorkProduct = productMatchingWorkProduct;
    }

    public String getProductMatchingWorkProduct() {
        return productMatchingWorkProduct;
    }

    public void setProductMatchingAssessmentType(String productMatchingAssessmentType) {
        this.productMatchingAssessmentType = productMatchingAssessmentType;
    }

    public String getProductMatchingAssessmentType() {
        return productMatchingAssessmentType;
    }
}