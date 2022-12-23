package org.museframework.bian.marordexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateMarketTradeTransactionRequest {
    @MetaField
    private String marketorderexecutionid;

    @MetaField(ref=true)
    private org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction marketTradeTransaction;

    public void setMarketorderexecutionid(String marketorderexecutionid) {
        this.marketorderexecutionid = marketorderexecutionid;
    }

    public String getMarketorderexecutionid() {
        return marketorderexecutionid;
    }

    public void setMarketTradeTransaction(org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction marketTradeTransaction) {
        this.marketTradeTransaction = marketTradeTransaction;
    }

    public org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction getMarketTradeTransaction() {
        return marketTradeTransaction;
    }
}