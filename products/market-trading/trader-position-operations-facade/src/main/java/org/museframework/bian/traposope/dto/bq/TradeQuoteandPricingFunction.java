/*An operational service or function supported within the Trade Capture and Reporting Function for doing Trade Capture and Reporting Function*/
package org.museframework.bian.traposope.dto.bq;

public class TradeQuoteandPricingFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    private String schedule;

    /*The Trade Quote and Pricing Function specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Trade Quote and Pricing Function*/
    private org.museframework.bian.classes.Session tradedPositionOperatingSessionReference;

    /*Reference to Trade Quote and Pricing Function*/
    private org.museframework.bian.classes.Function tradeQuoteandPricingFunctionReference;

    /*The type of Trade Quote and Pricing Function*/
    private String tradeQuoteandPricingFunctionType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setTradedPositionOperatingSessionReference(org.museframework.bian.classes.Session tradedPositionOperatingSessionReference) {
        this.tradedPositionOperatingSessionReference = tradedPositionOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getTradedPositionOperatingSessionReference() {
        return tradedPositionOperatingSessionReference;
    }

    public void setTradeQuoteandPricingFunctionReference(org.museframework.bian.classes.Function tradeQuoteandPricingFunctionReference) {
        this.tradeQuoteandPricingFunctionReference = tradeQuoteandPricingFunctionReference;
    }

    public org.museframework.bian.classes.Function getTradeQuoteandPricingFunctionReference() {
        return tradeQuoteandPricingFunctionReference;
    }

    public void setTradeQuoteandPricingFunctionType(String tradeQuoteandPricingFunctionType) {
        this.tradeQuoteandPricingFunctionType = tradeQuoteandPricingFunctionType;
    }

    public String getTradeQuoteandPricingFunctionType() {
        return tradeQuoteandPricingFunctionType;
    }
}