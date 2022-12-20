package org.museframework.bian.etradingworkbench.dto;

public class UpdateMarketOrderInitiationFunctionRequest {
    private String etradingworkbenchid;

    private String marketorderinitiationfunctionid;

    private org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction marketOrderInitiationFunction;

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

    public void setMarketOrderInitiationFunction(org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction marketOrderInitiationFunction) {
        this.marketOrderInitiationFunction = marketOrderInitiationFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction getMarketOrderInitiationFunction() {
        return marketOrderInitiationFunction;
    }
}