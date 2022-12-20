package org.museframework.bian.etradingworkbench.dto;

public class RetrieveMarketPriceAnalysisFunctionResponse {
    private org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction marketPriceAnalysisFunction;

    public void setMarketPriceAnalysisFunction(org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction marketPriceAnalysisFunction) {
        this.marketPriceAnalysisFunction = marketPriceAnalysisFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction getMarketPriceAnalysisFunction() {
        return marketPriceAnalysisFunction;
    }
}