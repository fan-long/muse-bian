package org.museframework.bian.cuscamexe.dto;

public class InitiateAnalysisFeedbackRequest {
    private String customercampaignexecutionid;

    private String analysisfeedbackid;

    private org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback analysisFeedback;

    public void setCustomercampaignexecutionid(String customercampaignexecutionid) {
        this.customercampaignexecutionid = customercampaignexecutionid;
    }

    public String getCustomercampaignexecutionid() {
        return customercampaignexecutionid;
    }

    public void setAnalysisfeedbackid(String analysisfeedbackid) {
        this.analysisfeedbackid = analysisfeedbackid;
    }

    public String getAnalysisfeedbackid() {
        return analysisfeedbackid;
    }

    public void setAnalysisFeedback(org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback analysisFeedback) {
        this.analysisFeedback = analysisFeedback;
    }

    public org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback getAnalysisFeedback() {
        return analysisFeedback;
    }
}