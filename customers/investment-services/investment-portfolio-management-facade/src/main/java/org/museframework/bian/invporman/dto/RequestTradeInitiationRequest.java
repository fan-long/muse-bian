package org.museframework.bian.invporman.dto;

public class RequestTradeInitiationRequest {
    private String investmentportfoliomanagementid;

    private String tradeinitiationid;

    private org.museframework.bian.invporman.dto.bq.TradeInitiation tradeInitiation;

    public void setInvestmentportfoliomanagementid(String investmentportfoliomanagementid) {
        this.investmentportfoliomanagementid = investmentportfoliomanagementid;
    }

    public String getInvestmentportfoliomanagementid() {
        return investmentportfoliomanagementid;
    }

    public void setTradeinitiationid(String tradeinitiationid) {
        this.tradeinitiationid = tradeinitiationid;
    }

    public String getTradeinitiationid() {
        return tradeinitiationid;
    }

    public void setTradeInitiation(org.museframework.bian.invporman.dto.bq.TradeInitiation tradeInitiation) {
        this.tradeInitiation = tradeInitiation;
    }

    public org.museframework.bian.invporman.dto.bq.TradeInitiation getTradeInitiation() {
        return tradeInitiation;
    }
}