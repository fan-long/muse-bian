package org.museframework.bian.marketorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMarketOrderTransactionRequest {
    @MetaField
    private String marketorderid;

    public void setMarketorderid(String marketorderid) {
        this.marketorderid = marketorderid;
    }

    public String getMarketorderid() {
        return marketorderid;
    }
}