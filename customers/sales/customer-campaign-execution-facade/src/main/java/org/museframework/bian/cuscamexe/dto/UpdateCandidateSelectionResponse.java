package org.museframework.bian.cuscamexe.dto;

public class UpdateCandidateSelectionResponse {
    private org.museframework.bian.cuscamexe.dto.bq.CandidateSelection candidateSelection;

    public void setCandidateSelection(org.museframework.bian.cuscamexe.dto.bq.CandidateSelection candidateSelection) {
        this.candidateSelection = candidateSelection;
    }

    public org.museframework.bian.cuscamexe.dto.bq.CandidateSelection getCandidateSelection() {
        return candidateSelection;
    }
}