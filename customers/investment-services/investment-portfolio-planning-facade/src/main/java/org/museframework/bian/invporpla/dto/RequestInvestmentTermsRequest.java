package org.museframework.bian.invporpla.dto;

public class RequestInvestmentTermsRequest {
    private String investmentportfolioplanningid;

    private String investmenttermsid;

    private org.museframework.bian.invporpla.dto.bq.InvestmentTerms investmentTerms;

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

    public void setInvestmentTerms(org.museframework.bian.invporpla.dto.bq.InvestmentTerms investmentTerms) {
        this.investmentTerms = investmentTerms;
    }

    public org.museframework.bian.invporpla.dto.bq.InvestmentTerms getInvestmentTerms() {
        return investmentTerms;
    }
}