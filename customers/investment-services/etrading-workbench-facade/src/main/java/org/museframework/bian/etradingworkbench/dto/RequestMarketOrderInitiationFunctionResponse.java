package org.museframework.bian.etradingworkbench.dto;

public class RequestMarketOrderInitiationFunctionResponse {
    private org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction marketOrderInitiationFunction;

    public void setMarketOrderInitiationFunction(org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction marketOrderInitiationFunction) {
        this.marketOrderInitiationFunction = marketOrderInitiationFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction getMarketOrderInitiationFunction() {
        return marketOrderInitiationFunction;
    }
}