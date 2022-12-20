package org.museframework.bian.cuscamexe.dto;

public class RetrieveCandidateSelectionRequest {
    private String customercampaignexecutionid;

    private String candidateselectionid;

    public void setCustomercampaignexecutionid(String customercampaignexecutionid) {
        this.customercampaignexecutionid = customercampaignexecutionid;
    }

    public String getCustomercampaignexecutionid() {
        return customercampaignexecutionid;
    }

    public void setCandidateselectionid(String candidateselectionid) {
        this.candidateselectionid = candidateselectionid;
    }

    public String getCandidateselectionid() {
        return candidateselectionid;
    }
}