package org.museframework.bian.marordexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMarketTradeTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction marketTradeTransaction;

    public void setMarketTradeTransaction(org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction marketTradeTransaction) {
        this.marketTradeTransaction = marketTradeTransaction;
    }

    public org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction getMarketTradeTransaction() {
        return marketTradeTransaction;
    }
}