package org.museframework.bian.traposope.dto;

public class UpdateTradeQuoteandPricingFunctionRequest {
    private String traderpositionoperationsid;

    private String tradequoteandpricingfunctionid;

    private org.museframework.bian.traposope.dto.bq.TradeQuoteandPricingFunction tradeQuoteandPricingFunction;

    public void setTraderpositionoperationsid(String traderpositionoperationsid) {
        this.traderpositionoperationsid = traderpositionoperationsid;
    }

    public String getTraderpositionoperationsid() {
        return traderpositionoperationsid;
    }

    public void setTradequoteandpricingfunctionid(String tradequoteandpricingfunctionid) {
        this.tradequoteandpricingfunctionid = tradequoteandpricingfunctionid;
    }

    public String getTradequoteandpricingfunctionid() {
        return tradequoteandpricingfunctionid;
    }

    public void setTradeQuoteandPricingFunction(org.museframework.bian.traposope.dto.bq.TradeQuoteandPricingFunction tradeQuoteandPricingFunction) {
        this.tradeQuoteandPricingFunction = tradeQuoteandPricingFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TradeQuoteandPricingFunction getTradeQuoteandPricingFunction() {
        return tradeQuoteandPricingFunction;
    }
}