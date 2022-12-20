package org.museframework.bian.tradesettlement.dto;

public class ExchangeTradeSettlementProcedureResponse {
    private org.museframework.bian.tradesettlement.dto.cr.TradeSettlementProcedure tradeSettlementProcedure;

    public void setTradeSettlementProcedure(org.museframework.bian.tradesettlement.dto.cr.TradeSettlementProcedure tradeSettlementProcedure) {
        this.tradeSettlementProcedure = tradeSettlementProcedure;
    }

    public org.museframework.bian.tradesettlement.dto.cr.TradeSettlementProcedure getTradeSettlementProcedure() {
        return tradeSettlementProcedure;
    }
}