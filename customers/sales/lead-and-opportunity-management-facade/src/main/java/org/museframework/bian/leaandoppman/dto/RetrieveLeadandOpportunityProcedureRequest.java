package org.museframework.bian.leaandoppman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveLeadandOpportunityProcedureRequest {
    @MetaField
    private String leadandopportunitymanagementid;

    public void setLeadandopportunitymanagementid(String leadandopportunitymanagementid) {
        this.leadandopportunitymanagementid = leadandopportunitymanagementid;
    }

    public String getLeadandopportunitymanagementid() {
        return leadandopportunitymanagementid;
    }
}