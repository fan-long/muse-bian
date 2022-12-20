package org.museframework.bian.syndicatemanagement.dto;

public class NotifySyndicateComplianceClausesRequest {
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