package org.museframework.bian.procamexe.dto;

public class RetrieveAnalysisFeedbackRequest {
    private String prospectcampaignexecutionid;

    private String analysisfeedbackid;

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
}