package org.museframework.bian.syndicatemanagement.dto;

public class RetrieveSyndicateComplianceClausesRequest {
    private String syndicatemanagementid;

    private String syndicatecomplianceclausesid;

    public void setSyndicatemanagementid(String syndicatemanagementid) {
        this.syndicatemanagementid = syndicatemanagementid;
    }

    public String getSyndicatemanagementid() {
        return syndicatemanagementid;
    }

    public void setSyndicatecomplianceclausesid(String syndicatecomplianceclausesid) {
        this.syndicatecomplianceclausesid = syndicatecomplianceclausesid;
    }

    public String getSyndicatecomplianceclausesid() {
        return syndicatecomplianceclausesid;
    }
}