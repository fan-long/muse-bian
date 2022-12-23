package org.museframework.bian.syndicatemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateSyndicateComplianceClausesRequest {
    @MetaField
    private String syndicatemanagementid;

    @MetaField
    private String syndicatecomplianceclausesid;

    @MetaField(ref=true)
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