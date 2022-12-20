package org.museframework.bian.etradingworkbench.dto;

public class NotifyMarketOrderQuotationFunctionRequest {
    private String etradingworkbenchid;

    private String marketorderquotationfunctionid;

    public void setEtradingworkbenchid(String etradingworkbenchid) {
        this.etradingworkbenchid = etradingworkbenchid;
    }

    public String getEtradingworkbenchid() {
        return etradingworkbenchid;
    }

    public void setMarketorderquotationfunctionid(String marketorderquotationfunctionid) {
        this.marketorderquotationfunctionid = marketorderquotationfunctionid;
    }

    public String getMarketorderquotationfunctionid() {
        return marketorderquotationfunctionid;
    }
}