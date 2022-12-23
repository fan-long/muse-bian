/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.customersurveys.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SurveyAnalysis {
    /*The result customer survey which combines response details/statistics and associated analysis, commentary and derived insights*/
    @MetaField
    private String customerSurveyProcedureSurveyAnalysisResult;

    public void setCustomerSurveyProcedureSurveyAnalysisResult(String customerSurveyProcedureSurveyAnalysisResult) {
        this.customerSurveyProcedureSurveyAnalysisResult = customerSurveyProcedureSurveyAnalysisResult;
    }

    public String getCustomerSurveyProcedureSurveyAnalysisResult() {
        return customerSurveyProcedureSurveyAnalysisResult;
    }
}