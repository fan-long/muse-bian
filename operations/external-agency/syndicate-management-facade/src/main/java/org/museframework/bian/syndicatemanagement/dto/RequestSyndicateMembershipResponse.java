package org.museframework.bian.syndicatemanagement.dto;

public class RequestSyndicateMembershipResponse {
    private org.museframework.bian.syndicatemanagement.dto.cr.SyndicateMembership syndicateMembership;

    public void setSyndicateMembership(org.museframework.bian.syndicatemanagement.dto.cr.SyndicateMembership syndicateMembership) {
        this.syndicateMembership = syndicateMembership;
    }

    public org.museframework.bian.syndicatemanagement.dto.cr.SyndicateMembership getSyndicateMembership() {
        return syndicateMembership;
    }
}