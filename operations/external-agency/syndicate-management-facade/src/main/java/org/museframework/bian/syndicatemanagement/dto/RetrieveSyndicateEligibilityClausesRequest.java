package org.museframework.bian.syndicatemanagement.dto;

public class RetrieveSyndicateEligibilityClausesRequest {
    private String syndicatemanagementid;

    private String syndicateeligibilityclausesid;

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
}