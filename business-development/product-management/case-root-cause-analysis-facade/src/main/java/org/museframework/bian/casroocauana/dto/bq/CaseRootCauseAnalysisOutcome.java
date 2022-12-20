/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.casroocauana.dto.bq;

public class CaseRootCauseAnalysisOutcome {
    /**/
    private String caseRootCauseAnalysisWorkProduct;

    /**/
    private String caseRootCauseAnalysisAnalysisType;

    public void setCaseRootCauseAnalysisWorkProduct(String caseRootCauseAnalysisWorkProduct) {
        this.caseRootCauseAnalysisWorkProduct = caseRootCauseAnalysisWorkProduct;
    }

    public String getCaseRootCauseAnalysisWorkProduct() {
        return caseRootCauseAnalysisWorkProduct;
    }

    public void setCaseRootCauseAnalysisAnalysisType(String caseRootCauseAnalysisAnalysisType) {
        this.caseRootCauseAnalysisAnalysisType = caseRootCauseAnalysisAnalysisType;
    }

    public String getCaseRootCauseAnalysisAnalysisType() {
        return caseRootCauseAnalysisAnalysisType;
    }
}