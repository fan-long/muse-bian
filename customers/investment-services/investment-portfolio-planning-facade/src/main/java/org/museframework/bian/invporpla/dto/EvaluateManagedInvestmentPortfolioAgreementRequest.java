package org.museframework.bian.invporpla.dto;

public class EvaluateManagedInvestmentPortfolioAgreementRequest {
    private org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement managedInvestmentPortfolioAgreement;

    public void setManagedInvestmentPortfolioAgreement(org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement managedInvestmentPortfolioAgreement) {
        this.managedInvestmentPortfolioAgreement = managedInvestmentPortfolioAgreement;
    }

    public org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement getManagedInvestmentPortfolioAgreement() {
        return managedInvestmentPortfolioAgreement;
    }
}