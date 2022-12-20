package org.museframework.bian.procamexe.dto;

public class UpdateCandidateSelectionRequest {
    private String prospectcampaignexecutionid;

    private String candidateselectionid;

    private org.museframework.bian.procamexe.dto.bq.CandidateSelection candidateSelection;

    public void setProspectcampaignexecutionid(String prospectcampaignexecutionid) {
        this.prospectcampaignexecutionid = prospectcampaignexecutionid;
    }

    public String getProspectcampaignexecutionid() {
        return prospectcampaignexecutionid;
    }

    public void setCandidateselectionid(String candidateselectionid) {
        this.candidateselectionid = candidateselectionid;
    }

    public String getCandidateselectionid() {
        return candidateselectionid;
    }

    public void setCandidateSelection(org.museframework.bian.procamexe.dto.bq.CandidateSelection candidateSelection) {
        this.candidateSelection = candidateSelection;
    }

    public org.museframework.bian.procamexe.dto.bq.CandidateSelection getCandidateSelection() {
        return candidateSelection;
    }
}