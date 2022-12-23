package org.museframework.bian.tradesettlement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateTradeSettlementProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.tradesettlement.dto.cr.TradeSettlementProcedure tradeSettlementProcedure;

    public void setTradeSettlementProcedure(org.museframework.bian.tradesettlement.dto.cr.TradeSettlementProcedure tradeSettlementProcedure) {
        this.tradeSettlementProcedure = tradeSettlementProcedure;
    }

    public org.museframework.bian.tradesettlement.dto.cr.TradeSettlementProcedure getTradeSettlementProcedure() {
        return tradeSettlementProcedure;
    }
}