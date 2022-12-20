/*An operational service or function supported within the Market Order Initiation Function for doing Market Order Initiation Function*/
package org.museframework.bian.etradingworkbench.dto.bq;

public class MarketPriceAnalysisFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    private String schedule;

    /*The Market Price Analysis Function specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Market Price Analysis Function*/
    private org.museframework.bian.classes.Session eTradingWorkbenchOperatingSessionReference;

    /*Reference to Market Price Analysis Function*/
    private org.museframework.bian.classes.Function marketPriceAnalysisFunctionReference;

    /*The type of Market Price Analysis Function*/
    private String marketPriceAnalysisFunctionType;

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

    public void seteTradingWorkbenchOperatingSessionReference(org.museframework.bian.classes.Session eTradingWorkbenchOperatingSessionReference) {
        this.eTradingWorkbenchOperatingSessionReference = eTradingWorkbenchOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session geteTradingWorkbenchOperatingSessionReference() {
        return eTradingWorkbenchOperatingSessionReference;
    }

    public void setMarketPriceAnalysisFunctionReference(org.museframework.bian.classes.Function marketPriceAnalysisFunctionReference) {
        this.marketPriceAnalysisFunctionReference = marketPriceAnalysisFunctionReference;
    }

    public org.museframework.bian.classes.Function getMarketPriceAnalysisFunctionReference() {
        return marketPriceAnalysisFunctionReference;
    }

    public void setMarketPriceAnalysisFunctionType(String marketPriceAnalysisFunctionType) {
        this.marketPriceAnalysisFunctionType = marketPriceAnalysisFunctionType;
    }

    public String getMarketPriceAnalysisFunctionType() {
        return marketPriceAnalysisFunctionType;
    }
}