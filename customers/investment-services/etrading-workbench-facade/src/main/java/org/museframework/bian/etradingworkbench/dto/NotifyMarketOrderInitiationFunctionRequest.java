package org.museframework.bian.etradingworkbench.dto;

public class NotifyMarketOrderInitiationFunctionRequest {
    private String etradingworkbenchid;

    private String marketorderinitiationfunctionid;

    public void setEtradingworkbenchid(String etradingworkbenchid) {
        this.etradingworkbenchid = etradingworkbenchid;
    }

    public String getEtradingworkbenchid() {
        return etradingworkbenchid;
    }

    public void setMarketorderinitiationfunctionid(String marketorderinitiationfunctionid) {
        this.marketorderinitiationfunctionid = marketorderinitiationfunctionid;
    }

    public String getMarketorderinitiationfunctionid() {
        return marketorderinitiationfunctionid;
    }
}