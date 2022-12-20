package org.museframework.bian.cuscamexe.dto;

public class UpdateCandidateSelectionRequest {
    private String customercampaignexecutionid;

    private String candidateselectionid;

    private org.museframework.bian.cuscamexe.dto.bq.CandidateSelection candidateSelection;

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

    public void setCandidateSelection(org.museframework.bian.cuscamexe.dto.bq.CandidateSelection candidateSelection) {
        this.candidateSelection = candidateSelection;
    }

    public org.museframework.bian.cuscamexe.dto.bq.CandidateSelection getCandidateSelection() {
        return candidateSelection;
    }
}