/*An operational service or function supported within the Market Order Initiation Function for doing Market Order Initiation Function*/
package org.museframework.bian.etradingworkbench.dto.bq;

public class InvestmentPortfolioValuationFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    private String schedule;

    /*The Investment Portfolio Valuation Function specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Investment Portfolio Valuation Function*/
    private org.museframework.bian.classes.Session eTradingWorkbenchOperatingSessionReference;

    /*Reference to Investment Portfolio Valuation Function*/
    private org.museframework.bian.classes.Function investmentPortfolioValuationFunctionReference;

    /*The type of Investment Portfolio Valuation Function*/
    private String investmentPortfolioValuationFunctionType;

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

    public void setInvestmentPortfolioValuationFunctionReference(org.museframework.bian.classes.Function investmentPortfolioValuationFunctionReference) {
        this.investmentPortfolioValuationFunctionReference = investmentPortfolioValuationFunctionReference;
    }

    public org.museframework.bian.classes.Function getInvestmentPortfolioValuationFunctionReference() {
        return investmentPortfolioValuationFunctionReference;
    }

    public void setInvestmentPortfolioValuationFunctionType(String investmentPortfolioValuationFunctionType) {
        this.investmentPortfolioValuationFunctionType = investmentPortfolioValuationFunctionType;
    }

    public String getInvestmentPortfolioValuationFunctionType() {
        return investmentPortfolioValuationFunctionType;
    }
}