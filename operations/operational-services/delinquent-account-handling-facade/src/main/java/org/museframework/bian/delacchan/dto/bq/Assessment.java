/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.delacchan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Assessment
@MetaDto
public class Assessment {
    /*The outcome of the assessment of the delinquent product account based on billing/payment and transaction history*/
    @MetaField(0)
    private String delinquentAccountAssessmentWorkProduct;

    /*The task to contact the customer and request/negotiate payment*/
    @MetaField(0)
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