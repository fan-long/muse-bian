package org.museframework.bian.marinfman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFinancialMarketInformationAdministrativePlanRequest {
    @MetaField
    private String marketinformationmanagementid;

    public void setMarketinformationmanagementid(String marketinformationmanagementid) {
        this.marketinformationmanagementid = marketinformationmanagementid;
    }

    public String getMarketinformationmanagementid() {
        return marketinformationmanagementid;
    }
}