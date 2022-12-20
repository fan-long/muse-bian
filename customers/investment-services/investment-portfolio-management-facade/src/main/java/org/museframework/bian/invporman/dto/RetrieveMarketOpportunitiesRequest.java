package org.museframework.bian.invporman.dto;

public class RetrieveMarketOpportunitiesRequest {
    private String investmentportfoliomanagementid;

    private String marketopportunitiesid;

    public void setInvestmentportfoliomanagementid(String investmentportfoliomanagementid) {
        this.investmentportfoliomanagementid = investmentportfoliomanagementid;
    }

    public String getInvestmentportfoliomanagementid() {
        return investmentportfoliomanagementid;
    }

    public void setMarketopportunitiesid(String marketopportunitiesid) {
        this.marketopportunitiesid = marketopportunitiesid;
    }

    public String getMarketopportunitiesid() {
        return marketopportunitiesid;
    }
}