package org.museframework.bian.invporpla.dto;

public class RetrieveInvestmentTermsRequest {
    private String investmentportfolioplanningid;

    private String investmenttermsid;

    public void setInvestmentportfolioplanningid(String investmentportfolioplanningid) {
        this.investmentportfolioplanningid = investmentportfolioplanningid;
    }

    public String getInvestmentportfolioplanningid() {
        return investmentportfolioplanningid;
    }

    public void setInvestmenttermsid(String investmenttermsid) {
        this.investmenttermsid = investmenttermsid;
    }

    public String getInvestmenttermsid() {
        return investmenttermsid;
    }
}