package org.museframework.bian.etradingworkbench.dto;

public class ExecuteInvestmentPortfolioValuationFunctionRequest {
    private String etradingworkbenchid;

    private String investmentportfoliovaluationfunctionid;

    private org.museframework.bian.etradingworkbench.dto.bq.InvestmentPortfolioValuationFunction investmentPortfolioValuationFunction;

    public void setEtradingworkbenchid(String etradingworkbenchid) {
        this.etradingworkbenchid = etradingworkbenchid;
    }

    public String getEtradingworkbenchid() {
        return etradingworkbenchid;
    }

    public void setInvestmentportfoliovaluationfunctionid(String investmentportfoliovaluationfunctionid) {
        this.investmentportfoliovaluationfunctionid = investmentportfoliovaluationfunctionid;
    }

    public String getInvestmentportfoliovaluationfunctionid() {
        return investmentportfoliovaluationfunctionid;
    }

    public void setInvestmentPortfolioValuationFunction(org.museframework.bian.etradingworkbench.dto.bq.InvestmentPortfolioValuationFunction investmentPortfolioValuationFunction) {
        this.investmentPortfolioValuationFunction = investmentPortfolioValuationFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.InvestmentPortfolioValuationFunction getInvestmentPortfolioValuationFunction() {
        return investmentPortfolioValuationFunction;
    }
}