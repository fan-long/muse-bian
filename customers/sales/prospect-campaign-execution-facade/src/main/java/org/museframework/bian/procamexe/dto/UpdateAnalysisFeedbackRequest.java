package org.museframework.bian.procamexe.dto;

public class UpdateAnalysisFeedbackRequest {
    private String prospectcampaignexecutionid;

    private String analysisfeedbackid;

    private org.museframework.bian.procamexe.dto.bq.AnalysisFeedback analysisFeedback;

    public void setProspectcampaignexecutionid(String prospectcampaignexecutionid) {
        this.prospectcampaignexecutionid = prospectcampaignexecutionid;
    }

    public String getProspectcampaignexecutionid() {
        return prospectcampaignexecutionid;
    }

    public void setAnalysisfeedbackid(String analysisfeedbackid) {
        this.analysisfeedbackid = analysisfeedbackid;
    }

    public String getAnalysisfeedbackid() {
        return analysisfeedbackid;
    }

    public void setAnalysisFeedback(org.museframework.bian.procamexe.dto.bq.AnalysisFeedback analysisFeedback) {
        this.analysisFeedback = analysisFeedback;
    }

    public org.museframework.bian.procamexe.dto.bq.AnalysisFeedback getAnalysisFeedback() {
        return analysisFeedback;
    }
}