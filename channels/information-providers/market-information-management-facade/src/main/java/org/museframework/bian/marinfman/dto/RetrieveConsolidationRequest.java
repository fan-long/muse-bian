package org.museframework.bian.marinfman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveConsolidationRequest {
    @MetaField
    private String marketinformationmanagementid;

    @MetaField
    private String consolidationid;

    public void setMarketinformationmanagementid(String marketinformationmanagementid) {
        this.marketinformationmanagementid = marketinformationmanagementid;
    }

    public String getMarketinformationmanagementid() {
        return marketinformationmanagementid;
    }

    public void setConsolidationid(String consolidationid) {
        this.consolidationid = consolidationid;
    }

    public String getConsolidationid() {
        return consolidationid;
    }
}