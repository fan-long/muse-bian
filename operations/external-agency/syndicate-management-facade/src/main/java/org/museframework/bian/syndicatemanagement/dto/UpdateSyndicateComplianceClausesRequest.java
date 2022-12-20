package org.museframework.bian.syndicatemanagement.dto;

public class UpdateSyndicateComplianceClausesRequest {
    private String syndicatemanagementid;

    private String syndicatecomplianceclausesid;

    private org.museframework.bian.syndicatemanagement.dto.bq.SyndicateComplianceClauses syndicateComplianceClauses;

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

    public void setSyndicateComplianceClauses(org.museframework.bian.syndicatemanagement.dto.bq.SyndicateComplianceClauses syndicateComplianceClauses) {
        this.syndicateComplianceClauses = syndicateComplianceClauses;
    }

    public org.museframework.bian.syndicatemanagement.dto.bq.SyndicateComplianceClauses getSyndicateComplianceClauses() {
        return syndicateComplianceClauses;
    }
}