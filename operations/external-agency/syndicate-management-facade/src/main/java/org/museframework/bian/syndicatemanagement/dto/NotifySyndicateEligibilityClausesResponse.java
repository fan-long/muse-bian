package org.museframework.bian.syndicatemanagement.dto;

public class NotifySyndicateEligibilityClausesResponse {
    private org.museframework.bian.syndicatemanagement.dto.bq.SyndicateEligibilityClauses syndicateEligibilityClauses;

    public void setSyndicateEligibilityClauses(org.museframework.bian.syndicatemanagement.dto.bq.SyndicateEligibilityClauses syndicateEligibilityClauses) {
        this.syndicateEligibilityClauses = syndicateEligibilityClauses;
    }

    public org.museframework.bian.syndicatemanagement.dto.bq.SyndicateEligibilityClauses getSyndicateEligibilityClauses() {
        return syndicateEligibilityClauses;
    }
}