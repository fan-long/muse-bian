package org.museframework.bian.etradingworkbench.dto;

public class NotifyInvestmentPortfolioValuationFunctionRequest {
    private String etradingworkbenchid;

    private String investmentportfoliovaluationfunctionid;

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
}