package org.museframework.bian.etradingworkbench.dto;

public class UpdateMarketOrderQuotationFunctionRequest {
    private String etradingworkbenchid;

    private String marketorderquotationfunctionid;

    private org.museframework.bian.etradingworkbench.dto.bq.MarketOrderQuotationFunction marketOrderQuotationFunction;

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

    public void setMarketOrderQuotationFunction(org.museframework.bian.etradingworkbench.dto.bq.MarketOrderQuotationFunction marketOrderQuotationFunction) {
        this.marketOrderQuotationFunction = marketOrderQuotationFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.MarketOrderQuotationFunction getMarketOrderQuotationFunction() {
        return marketOrderQuotationFunction;
    }
}