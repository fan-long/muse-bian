package org.museframework.bian.syndicatemanagement.dto;

public class RequestSyndicateMembershipRequest {
    private String syndicatemanagementid;

    private org.museframework.bian.syndicatemanagement.dto.cr.SyndicateMembership syndicateMembership;

    public void setSyndicatemanagementid(String syndicatemanagementid) {
        this.syndicatemanagementid = syndicatemanagementid;
    }

    public String getSyndicatemanagementid() {
        return syndicatemanagementid;
    }

    public void setSyndicateMembership(org.museframework.bian.syndicatemanagement.dto.cr.SyndicateMembership syndicateMembership) {
        this.syndicateMembership = syndicateMembership;
    }

    public org.museframework.bian.syndicatemanagement.dto.cr.SyndicateMembership getSyndicateMembership() {
        return syndicateMembership;
    }
}