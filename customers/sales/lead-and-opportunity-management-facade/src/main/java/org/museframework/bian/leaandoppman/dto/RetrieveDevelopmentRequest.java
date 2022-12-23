package org.museframework.bian.leaandoppman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDevelopmentRequest {
    @MetaField
    private String leadandopportunitymanagementid;

    @MetaField
    private String developmentid;

    public void setLeadandopportunitymanagementid(String leadandopportunitymanagementid) {
        this.leadandopportunitymanagementid = leadandopportunitymanagementid;
    }

    public String getLeadandopportunitymanagementid() {
        return leadandopportunitymanagementid;
    }

    public void setDevelopmentid(String developmentid) {
        this.developmentid = developmentid;
    }

    public String getDevelopmentid() {
        return developmentid;
    }
}