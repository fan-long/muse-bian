/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.delacchan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Assessment extends org.museframework.bian.classes.Assessment {
    /*The outcome of the assessment of the delinquent product account based on billing/payment and transaction history*/
    @MetaField
    private String delinquentAccountAssessmentWorkProduct;

    /*The task to contact the customer and request/negotiate payment*/
    @MetaField
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