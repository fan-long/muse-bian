package org.museframework.bian.marketorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateMarketOrderTransactionRequest {
    @MetaField
    private String marketorderid;

    @MetaField(ref=true)
    private org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction marketOrderTransaction;

    public void setMarketorderid(String marketorderid) {
        this.marketorderid = marketorderid;
    }

    public String getMarketorderid() {
        return marketorderid;
    }

    public void setMarketOrderTransaction(org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction marketOrderTransaction) {
        this.marketOrderTransaction = marketOrderTransaction;
    }

    public org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction getMarketOrderTransaction() {
        return marketOrderTransaction;
    }
}