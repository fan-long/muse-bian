/*A course of action for doing Market Trade Cash Settlement Workstep in the context of executing the Market Trade Cash Settlement Workstep*/
package org.museframework.bian.tradesettlement.dto.bq;

public class TradeSettlementOutcome {
    /**/
    private String tradeSettlementWorkProduct;

    /**/
    private org.museframework.bian.classes.Procedure tradeSettlementProcedure;

    public void setTradeSettlementWorkProduct(String tradeSettlementWorkProduct) {
        this.tradeSettlementWorkProduct = tradeSettlementWorkProduct;
    }

    public String getTradeSettlementWorkProduct() {
        return tradeSettlementWorkProduct;
    }

    public void setTradeSettlementProcedure(org.museframework.bian.classes.Procedure tradeSettlementProcedure) {
        this.tradeSettlementProcedure = tradeSettlementProcedure;
    }

    public org.museframework.bian.classes.Procedure getTradeSettlementProcedure() {
        return tradeSettlementProcedure;
    }
}