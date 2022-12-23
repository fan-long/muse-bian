package org.museframework.bian.leaandoppman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateLeadandOpportunityProcedureRequest {
    @MetaField
    private String leadandopportunitymanagementid;

    @MetaField(ref=true)
    private org.museframework.bian.leaandoppman.dto.cr.LeadandOpportunityProcedure leadandOpportunityProcedure;

    public void setLeadandopportunitymanagementid(String leadandopportunitymanagementid) {
        this.leadandopportunitymanagementid = leadandopportunitymanagementid;
    }

    public String getLeadandopportunitymanagementid() {
        return leadandopportunitymanagementid;
    }

    public void setLeadandOpportunityProcedure(org.museframework.bian.leaandoppman.dto.cr.LeadandOpportunityProcedure leadandOpportunityProcedure) {
        this.leadandOpportunityProcedure = leadandOpportunityProcedure;
    }

    public org.museframework.bian.leaandoppman.dto.cr.LeadandOpportunityProcedure getLeadandOpportunityProcedure() {
        return leadandOpportunityProcedure;
    }
}