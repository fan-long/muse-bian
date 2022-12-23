package org.museframework.bian.positionkeeping.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFinancialPositionLogRequest {
    @MetaField
    private String positionkeepingid;

    public void setPositionkeepingid(String positionkeepingid) {
        this.positionkeepingid = positionkeepingid;
    }

    public String getPositionkeepingid() {
        return positionkeepingid;
    }
}