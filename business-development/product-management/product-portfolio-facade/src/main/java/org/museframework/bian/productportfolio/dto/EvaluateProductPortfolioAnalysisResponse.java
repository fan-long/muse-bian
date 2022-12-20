package org.museframework.bian.productportfolio.dto;

public class EvaluateProductPortfolioAnalysisResponse {
    private org.museframework.bian.productportfolio.dto.cr.ProductPortfolioAnalysis productPortfolioAnalysis;

    public void setProductPortfolioAnalysis(org.museframework.bian.productportfolio.dto.cr.ProductPortfolioAnalysis productPortfolioAnalysis) {
        this.productPortfolioAnalysis = productPortfolioAnalysis;
    }

    public org.museframework.bian.productportfolio.dto.cr.ProductPortfolioAnalysis getProductPortfolioAnalysis() {
        return productPortfolioAnalysis;
    }
}