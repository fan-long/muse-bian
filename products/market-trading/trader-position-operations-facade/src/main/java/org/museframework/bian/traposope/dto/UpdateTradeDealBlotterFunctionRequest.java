package org.museframework.bian.traposope.dto;

public class UpdateTradeDealBlotterFunctionRequest {
    private String traderpositionoperationsid;

    private String tradedealblotterfunctionid;

    private org.museframework.bian.traposope.dto.bq.TradeDealBlotterFunction tradeDealBlotterFunction;

    public void setTraderpositionoperationsid(String traderpositionoperationsid) {
        this.traderpositionoperationsid = traderpositionoperationsid;
    }

    public String getTraderpositionoperationsid() {
        return traderpositionoperationsid;
    }

    public void setTradedealblotterfunctionid(String tradedealblotterfunctionid) {
        this.tradedealblotterfunctionid = tradedealblotterfunctionid;
    }

    public String getTradedealblotterfunctionid() {
        return tradedealblotterfunctionid;
    }

    public void setTradeDealBlotterFunction(org.museframework.bian.traposope.dto.bq.TradeDealBlotterFunction tradeDealBlotterFunction) {
        this.tradeDealBlotterFunction = tradeDealBlotterFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TradeDealBlotterFunction getTradeDealBlotterFunction() {
        return tradeDealBlotterFunction;
    }
}