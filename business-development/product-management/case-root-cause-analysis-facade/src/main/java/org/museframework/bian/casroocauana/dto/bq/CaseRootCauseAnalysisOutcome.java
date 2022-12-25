/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.casroocauana.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CaseRootCauseAnalysisOutcome {
    /**/
    @MetaField(0)
    private String caseRootCauseAnalysisWorkProduct;

    /**/
    @MetaField(0)
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