package org.museframework.bian.traposope.dto;

public class RetrieveTradeQuoteandPricingFunctionRequest {
    private String traderpositionoperationsid;

    private String tradequoteandpricingfunctionid;

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
}