package org.museframework.bian.syndicatemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateSyndicateEligibilityClausesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.syndicatemanagement.dto.bq.SyndicateEligibilityClauses syndicateEligibilityClauses;

    public void setSyndicateEligibilityClauses(org.museframework.bian.syndicatemanagement.dto.bq.SyndicateEligibilityClauses syndicateEligibilityClauses) {
        this.syndicateEligibilityClauses = syndicateEligibilityClauses;
    }

    public org.museframework.bian.syndicatemanagement.dto.bq.SyndicateEligibilityClauses getSyndicateEligibilityClauses() {
        return syndicateEligibilityClauses;
    }
}