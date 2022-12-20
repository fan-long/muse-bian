/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.procamexe.dto.bq;

public class AnalysisFeedback {
    /*The result of the analysis of the performance of the campaign for the current cycle*/
    private String prospectCampaignProcedureAnalysisResult;

    /*Description of the feedback provided to the campaign design team*/
    private String prospectCampaignProcedureAnalysisFeedbackResult;

    public void setProspectCampaignProcedureAnalysisResult(String prospectCampaignProcedureAnalysisResult) {
        this.prospectCampaignProcedureAnalysisResult = prospectCampaignProcedureAnalysisResult;
    }

    public String getProspectCampaignProcedureAnalysisResult() {
        return prospectCampaignProcedureAnalysisResult;
    }

    public void setProspectCampaignProcedureAnalysisFeedbackResult(String prospectCampaignProcedureAnalysisFeedbackResult) {
        this.prospectCampaignProcedureAnalysisFeedbackResult = prospectCampaignProcedureAnalysisFeedbackResult;
    }

    public String getProspectCampaignProcedureAnalysisFeedbackResult() {
        return prospectCampaignProcedureAnalysisFeedbackResult;
    }
}