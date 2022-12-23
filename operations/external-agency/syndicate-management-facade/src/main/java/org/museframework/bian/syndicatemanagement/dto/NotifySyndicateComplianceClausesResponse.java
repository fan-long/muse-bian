package org.museframework.bian.syndicatemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifySyndicateComplianceClausesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.syndicatemanagement.dto.bq.SyndicateComplianceClauses syndicateComplianceClauses;

    public void setSyndicateComplianceClauses(org.museframework.bian.syndicatemanagement.dto.bq.SyndicateComplianceClauses syndicateComplianceClauses) {
        this.syndicateComplianceClauses = syndicateComplianceClauses;
    }

    public org.museframework.bian.syndicatemanagement.dto.bq.SyndicateComplianceClauses getSyndicateComplianceClauses() {
        return syndicateComplianceClauses;
    }
}