package org.museframework.bian.tradesettlement.dto;

public class ExecuteTradeSettlementProcedureRequest {
    private String tradesettlementid;

    private org.museframework.bian.tradesettlement.dto.cr.TradeSettlementProcedure tradeSettlementProcedure;

    public void setTradesettlementid(String tradesettlementid) {
        this.tradesettlementid = tradesettlementid;
    }

    public String getTradesettlementid() {
        return tradesettlementid;
    }

    public void setTradeSettlementProcedure(org.museframework.bian.tradesettlement.dto.cr.TradeSettlementProcedure tradeSettlementProcedure) {
        this.tradeSettlementProcedure = tradeSettlementProcedure;
    }

    public org.museframework.bian.tradesettlement.dto.cr.TradeSettlementProcedure getTradeSettlementProcedure() {
        return tradeSettlementProcedure;
    }
}