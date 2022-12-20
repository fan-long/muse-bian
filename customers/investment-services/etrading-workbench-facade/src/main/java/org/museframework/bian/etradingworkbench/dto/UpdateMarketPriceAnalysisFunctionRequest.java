package org.museframework.bian.etradingworkbench.dto;

public class UpdateMarketPriceAnalysisFunctionRequest {
    private String etradingworkbenchid;

    private String marketpriceanalysisfunctionid;

    private org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction marketPriceAnalysisFunction;

    public void setEtradingworkbenchid(String etradingworkbenchid) {
        this.etradingworkbenchid = etradingworkbenchid;
    }

    public String getEtradingworkbenchid() {
        return etradingworkbenchid;
    }

    public void setMarketpriceanalysisfunctionid(String marketpriceanalysisfunctionid) {
        this.marketpriceanalysisfunctionid = marketpriceanalysisfunctionid;
    }

    public String getMarketpriceanalysisfunctionid() {
        return marketpriceanalysisfunctionid;
    }

    public void setMarketPriceAnalysisFunction(org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction marketPriceAnalysisFunction) {
        this.marketPriceAnalysisFunction = marketPriceAnalysisFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction getMarketPriceAnalysisFunction() {
        return marketPriceAnalysisFunction;
    }
}