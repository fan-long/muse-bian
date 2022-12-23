package org.museframework.bian.marordexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTradeInitiationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marordexe.dto.bq.TradeInitiation tradeInitiation;

    public void setTradeInitiation(org.museframework.bian.marordexe.dto.bq.TradeInitiation tradeInitiation) {
        this.tradeInitiation = tradeInitiation;
    }

    public org.museframework.bian.marordexe.dto.bq.TradeInitiation getTradeInitiation() {
        return tradeInitiation;
    }
}