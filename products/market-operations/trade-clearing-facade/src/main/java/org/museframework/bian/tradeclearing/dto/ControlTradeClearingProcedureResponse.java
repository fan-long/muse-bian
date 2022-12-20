package org.museframework.bian.tradeclearing.dto;

public class ControlTradeClearingProcedureResponse {
    private org.museframework.bian.tradeclearing.dto.cr.TradeClearingProcedure tradeClearingProcedure;

    public void setTradeClearingProcedure(org.museframework.bian.tradeclearing.dto.cr.TradeClearingProcedure tradeClearingProcedure) {
        this.tradeClearingProcedure = tradeClearingProcedure;
    }

    public org.museframework.bian.tradeclearing.dto.cr.TradeClearingProcedure getTradeClearingProcedure() {
        return tradeClearingProcedure;
    }
}