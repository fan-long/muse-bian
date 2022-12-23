package org.museframework.bian.leaandoppman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateDevelopmentRequest {
    @MetaField
    private String leadandopportunitymanagementid;

    @MetaField
    private String developmentid;

    @MetaField(ref=true)
    private org.museframework.bian.leaandoppman.dto.bq.Development development;

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

    public void setDevelopment(org.museframework.bian.leaandoppman.dto.bq.Development development) {
        this.development = development;
    }

    public org.museframework.bian.leaandoppman.dto.bq.Development getDevelopment() {
        return development;
    }
}