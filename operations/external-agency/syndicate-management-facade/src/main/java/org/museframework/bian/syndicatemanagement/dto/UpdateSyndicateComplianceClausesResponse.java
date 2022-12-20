package org.museframework.bian.syndicatemanagement.dto;

public class UpdateSyndicateComplianceClausesResponse {
    private org.museframework.bian.syndicatemanagement.dto.bq.SyndicateComplianceClauses syndicateComplianceClauses;

    public void setSyndicateComplianceClauses(org.museframework.bian.syndicatemanagement.dto.bq.SyndicateComplianceClauses syndicateComplianceClauses) {
        this.syndicateComplianceClauses = syndicateComplianceClauses;
    }

    public org.museframework.bian.syndicatemanagement.dto.bq.SyndicateComplianceClauses getSyndicateComplianceClauses() {
        return syndicateComplianceClauses;
    }
}