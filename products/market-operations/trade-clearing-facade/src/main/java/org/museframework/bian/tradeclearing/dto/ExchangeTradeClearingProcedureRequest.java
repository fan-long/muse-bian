package org.museframework.bian.tradeclearing.dto;

public class ExchangeTradeClearingProcedureRequest {
    private String tradeclearingid;

    private org.museframework.bian.tradeclearing.dto.cr.TradeClearingProcedure tradeClearingProcedure;

    public void setTradeclearingid(String tradeclearingid) {
        this.tradeclearingid = tradeclearingid;
    }

    public String getTradeclearingid() {
        return tradeclearingid;
    }

    public void setTradeClearingProcedure(org.museframework.bian.tradeclearing.dto.cr.TradeClearingProcedure tradeClearingProcedure) {
        this.tradeClearingProcedure = tradeClearingProcedure;
    }

    public org.museframework.bian.tradeclearing.dto.cr.TradeClearingProcedure getTradeClearingProcedure() {
        return tradeClearingProcedure;
    }
}