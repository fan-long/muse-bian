/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cuscamexe.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AnalysisFeedback {
    /*The result of the analysis of the performance of the campaign for the current cycle*/
    @MetaField
    private String customerCampaignProcedureAnalysisResult;

    /*Description of the feedback provided to the campaign design team*/
    @MetaField
    private String customerCampaignProcedureAnalysisFeedbackResult;

    public void setCustomerCampaignProcedureAnalysisResult(String customerCampaignProcedureAnalysisResult) {
        this.customerCampaignProcedureAnalysisResult = customerCampaignProcedureAnalysisResult;
    }

    public String getCustomerCampaignProcedureAnalysisResult() {
        return customerCampaignProcedureAnalysisResult;
    }

    public void setCustomerCampaignProcedureAnalysisFeedbackResult(String customerCampaignProcedureAnalysisFeedbackResult) {
        this.customerCampaignProcedureAnalysisFeedbackResult = customerCampaignProcedureAnalysisFeedbackResult;
    }

    public String getCustomerCampaignProcedureAnalysisFeedbackResult() {
        return customerCampaignProcedureAnalysisFeedbackResult;
    }
}