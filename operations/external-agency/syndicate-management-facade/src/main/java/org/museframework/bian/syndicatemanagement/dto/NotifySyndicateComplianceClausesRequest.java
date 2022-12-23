package org.museframework.bian.syndicatemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifySyndicateComplianceClausesRequest {
    @MetaField
    private String syndicatemanagementid;

    @MetaField
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