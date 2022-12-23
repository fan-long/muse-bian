package org.museframework.bian.invporman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeTradeInitiationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.invporman.dto.bq.TradeInitiation tradeInitiation;

    public void setTradeInitiation(org.museframework.bian.invporman.dto.bq.TradeInitiation tradeInitiation) {
        this.tradeInitiation = tradeInitiation;
    }

    public org.museframework.bian.invporman.dto.bq.TradeInitiation getTradeInitiation() {
        return tradeInitiation;
    }
}