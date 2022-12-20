/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.delacchan.dto.bq;

public class Assessment extends org.museframework.bian.classes.Assessment {
    /*The outcome of the assessment of the delinquent product account based on billing/payment and transaction history*/
    private String delinquentAccountAssessmentWorkProduct;

    /*The task to contact the customer and request/negotiate payment*/
    private String delinquentAccountAssessmentRecord;

    public void setDelinquentAccountAssessmentWorkProduct(String delinquentAccountAssessmentWorkProduct) {
        this.delinquentAccountAssessmentWorkProduct = delinquentAccountAssessmentWorkProduct;
    }

    public String getDelinquentAccountAssessmentWorkProduct() {
        return delinquentAccountAssessmentWorkProduct;
    }

    public void setDelinquentAccountAssessmentRecord(String delinquentAccountAssessmentRecord) {
        this.delinquentAccountAssessmentRecord = delinquentAccountAssessmentRecord;
    }

    public String getDelinquentAccountAssessmentRecord() {
        return delinquentAccountAssessmentRecord;
    }
}