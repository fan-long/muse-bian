package org.museframework.bian.invporana.dto;

public class RequestManagedInvestmentPortfolioAnalysisRequest {
    private String investmentportfolioanalysisid;

    private org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis managedInvestmentPortfolioAnalysis;

    public void setInvestmentportfolioanalysisid(String investmentportfolioanalysisid) {
        this.investmentportfolioanalysisid = investmentportfolioanalysisid;
    }

    public String getInvestmentportfolioanalysisid() {
        return investmentportfolioanalysisid;
    }

    public void setManagedInvestmentPortfolioAnalysis(org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis managedInvestmentPortfolioAnalysis) {
        this.managedInvestmentPortfolioAnalysis = managedInvestmentPortfolioAnalysis;
    }

    public org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis getManagedInvestmentPortfolioAnalysis() {
        return managedInvestmentPortfolioAnalysis;
    }
}