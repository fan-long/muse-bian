package org.museframework.bian.leaandoppman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveLeadandOpportunityProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leaandoppman.dto.cr.LeadandOpportunityProcedure leadandOpportunityProcedure;

    public void setLeadandOpportunityProcedure(org.museframework.bian.leaandoppman.dto.cr.LeadandOpportunityProcedure leadandOpportunityProcedure) {
        this.leadandOpportunityProcedure = leadandOpportunityProcedure;
    }

    public org.museframework.bian.leaandoppman.dto.cr.LeadandOpportunityProcedure getLeadandOpportunityProcedure() {
        return leadandOpportunityProcedure;
    }
}