package org.museframework.bian.etradingworkbench.dto;

public class RetrieveMarketPriceAnalysisFunctionRequest {
    private String etradingworkbenchid;

    private String marketpriceanalysisfunctionid;

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
}