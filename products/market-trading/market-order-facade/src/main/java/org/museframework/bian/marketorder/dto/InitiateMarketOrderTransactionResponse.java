package org.museframework.bian.marketorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateMarketOrderTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction marketOrderTransaction;

    public void setMarketOrderTransaction(org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction marketOrderTransaction) {
        this.marketOrderTransaction = marketOrderTransaction;
    }

    public org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction getMarketOrderTransaction() {
        return marketOrderTransaction;
    }
}