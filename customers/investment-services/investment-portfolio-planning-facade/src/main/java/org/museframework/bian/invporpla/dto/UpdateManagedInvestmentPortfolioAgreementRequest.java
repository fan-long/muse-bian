package org.museframework.bian.invporpla.dto;

public class UpdateManagedInvestmentPortfolioAgreementRequest {
    private String investmentportfolioplanningid;

    private org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement managedInvestmentPortfolioAgreement;

    public void setInvestmentportfolioplanningid(String investmentportfolioplanningid) {
        this.investmentportfolioplanningid = investmentportfolioplanningid;
    }

    public String getInvestmentportfolioplanningid() {
        return investmentportfolioplanningid;
    }

    public void setManagedInvestmentPortfolioAgreement(org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement managedInvestmentPortfolioAgreement) {
        this.managedInvestmentPortfolioAgreement = managedInvestmentPortfolioAgreement;
    }

    public org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement getManagedInvestmentPortfolioAgreement() {
        return managedInvestmentPortfolioAgreement;
    }
}