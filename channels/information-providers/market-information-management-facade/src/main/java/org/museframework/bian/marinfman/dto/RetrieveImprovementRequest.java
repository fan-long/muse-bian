package org.museframework.bian.marinfman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveImprovementRequest {
    @MetaField
    private String marketinformationmanagementid;

    @MetaField
    private String improvementid;

    public void setMarketinformationmanagementid(String marketinformationmanagementid) {
        this.marketinformationmanagementid = marketinformationmanagementid;
    }

    public String getMarketinformationmanagementid() {
        return marketinformationmanagementid;
    }

    public void setImprovementid(String improvementid) {
        this.improvementid = improvementid;
    }

    public String getImprovementid() {
        return improvementid;
    }
}