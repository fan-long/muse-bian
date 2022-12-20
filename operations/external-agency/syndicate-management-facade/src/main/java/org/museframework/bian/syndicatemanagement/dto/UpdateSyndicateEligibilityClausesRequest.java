package org.museframework.bian.syndicatemanagement.dto;

public class UpdateSyndicateEligibilityClausesRequest {
    private String syndicatemanagementid;

    private String syndicateeligibilityclausesid;

    private org.museframework.bian.syndicatemanagement.dto.bq.SyndicateEligibilityClauses syndicateEligibilityClauses;

    public void setSyndicatemanagementid(String syndicatemanagementid) {
        this.syndicatemanagementid = syndicatemanagementid;
    }

    public String getSyndicatemanagementid() {
        return syndicatemanagementid;
    }

    public void setSyndicateeligibilityclausesid(String syndicateeligibilityclausesid) {
        this.syndicateeligibilityclausesid = syndicateeligibilityclausesid;
    }

    public String getSyndicateeligibilityclausesid() {
        return syndicateeligibilityclausesid;
    }

    public void setSyndicateEligibilityClauses(org.museframework.bian.syndicatemanagement.dto.bq.SyndicateEligibilityClauses syndicateEligibilityClauses) {
        this.syndicateEligibilityClauses = syndicateEligibilityClauses;
    }

    public org.museframework.bian.syndicatemanagement.dto.bq.SyndicateEligibilityClauses getSyndicateEligibilityClauses() {
        return syndicateEligibilityClauses;
    }
}