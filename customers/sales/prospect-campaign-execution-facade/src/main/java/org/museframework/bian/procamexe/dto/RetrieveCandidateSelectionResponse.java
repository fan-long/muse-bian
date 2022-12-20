package org.museframework.bian.procamexe.dto;

public class RetrieveCandidateSelectionResponse {
    private org.museframework.bian.procamexe.dto.bq.CandidateSelection candidateSelection;

    public void setCandidateSelection(org.museframework.bian.procamexe.dto.bq.CandidateSelection candidateSelection) {
        this.candidateSelection = candidateSelection;
    }

    public org.museframework.bian.procamexe.dto.bq.CandidateSelection getCandidateSelection() {
        return candidateSelection;
    }
}