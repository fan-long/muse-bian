package org.museframework.bian.syndicatemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateSyndicateEligibilityClausesRequest {
    @MetaField
    private String syndicatemanagementid;

    @MetaField
    private String syndicateeligibilityclausesid;

    @MetaField(ref=true)
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