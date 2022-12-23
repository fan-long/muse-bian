package org.museframework.bian.marordexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTradeInitiationRequest {
    @MetaField
    private String marketorderexecutionid;

    @MetaField
    private String tradeinitiationid;

    @MetaField(ref=true)
    private org.museframework.bian.marordexe.dto.bq.TradeInitiation tradeInitiation;

    public void setMarketorderexecutionid(String marketorderexecutionid) {
        this.marketorderexecutionid = marketorderexecutionid;
    }

    public String getMarketorderexecutionid() {
        return marketorderexecutionid;
    }

    public void setTradeinitiationid(String tradeinitiationid) {
        this.tradeinitiationid = tradeinitiationid;
    }

    public String getTradeinitiationid() {
        return tradeinitiationid;
    }

    public void setTradeInitiation(org.museframework.bian.marordexe.dto.bq.TradeInitiation tradeInitiation) {
        this.tradeInitiation = tradeInitiation;
    }

    public org.museframework.bian.marordexe.dto.bq.TradeInitiation getTradeInitiation() {
        return tradeInitiation;
    }
}