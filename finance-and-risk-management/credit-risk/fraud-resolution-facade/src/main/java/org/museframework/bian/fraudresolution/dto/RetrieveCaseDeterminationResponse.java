package org.museframework.bian.fraudresolution.dto;

public class RetrieveCaseDeterminationResponse {
    private org.museframework.bian.fraudresolution.dto.bq.CaseDetermination caseDetermination;

    public void setCaseDetermination(org.museframework.bian.fraudresolution.dto.bq.CaseDetermination caseDetermination) {
        this.caseDetermination = caseDetermination;
    }

    public org.museframework.bian.fraudresolution.dto.bq.CaseDetermination getCaseDetermination() {
        return caseDetermination;
    }
}