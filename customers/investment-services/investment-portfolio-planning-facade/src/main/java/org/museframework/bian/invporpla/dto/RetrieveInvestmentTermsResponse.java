package org.museframework.bian.invporpla.dto;

public class RetrieveInvestmentTermsResponse {
    private org.museframework.bian.invporpla.dto.bq.InvestmentTerms investmentTerms;

    public void setInvestmentTerms(org.museframework.bian.invporpla.dto.bq.InvestmentTerms investmentTerms) {
        this.investmentTerms = investmentTerms;
    }

    public org.museframework.bian.invporpla.dto.bq.InvestmentTerms getInvestmentTerms() {
        return investmentTerms;
    }
}