/*The Sensitivity Test test is one aspect that can be intergrated into the overall Sensitivity Test*/
package org.museframework.bian.finstaass.dto.bq;

public class FinancialStatementAssessmentOutcome {
    /**/
    private String financialStatementAssessmentWorkProduct;

    /**/
    private String financialStatementAssessmentAssessmentType;

    public void setFinancialStatementAssessmentWorkProduct(String financialStatementAssessmentWorkProduct) {
        this.financialStatementAssessmentWorkProduct = financialStatementAssessmentWorkProduct;
    }

    public String getFinancialStatementAssessmentWorkProduct() {
        return financialStatementAssessmentWorkProduct;
    }

    public void setFinancialStatementAssessmentAssessmentType(String financialStatementAssessmentAssessmentType) {
        this.financialStatementAssessmentAssessmentType = financialStatementAssessmentAssessmentType;
    }

    public String getFinancialStatementAssessmentAssessmentType() {
        return financialStatementAssessmentAssessmentType;
    }
}