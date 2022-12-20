package org.museframework.bian.invporana.dto;

public class EvaluateManagedInvestmentPortfolioAnalysisResponse {
    private org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis managedInvestmentPortfolioAnalysis;

    public void setManagedInvestmentPortfolioAnalysis(org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis managedInvestmentPortfolioAnalysis) {
        this.managedInvestmentPortfolioAnalysis = managedInvestmentPortfolioAnalysis;
    }

    public org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis getManagedInvestmentPortfolioAnalysis() {
        return managedInvestmentPortfolioAnalysis;
    }
}