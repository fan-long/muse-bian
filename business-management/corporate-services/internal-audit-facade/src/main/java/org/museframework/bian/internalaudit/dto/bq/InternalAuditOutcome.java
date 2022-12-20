/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Internal Audit. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.internalaudit.dto.bq;

public class InternalAuditOutcome {
    /**/
    private String internalAuditWorkProduct;

    /**/
    private String internalAuditAssessmentType;

    public void setInternalAuditWorkProduct(String internalAuditWorkProduct) {
        this.internalAuditWorkProduct = internalAuditWorkProduct;
    }

    public String getInternalAuditWorkProduct() {
        return internalAuditWorkProduct;
    }

    public void setInternalAuditAssessmentType(String internalAuditAssessmentType) {
        this.internalAuditAssessmentType = internalAuditAssessmentType;
    }

    public String getInternalAuditAssessmentType() {
        return internalAuditAssessmentType;
    }
}