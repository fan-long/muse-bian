package org.museframework.bian.productportfolio.dto;

public class RequestProductPortfolioAnalysisRequest {
    private String productportfolioid;

    private org.museframework.bian.productportfolio.dto.cr.ProductPortfolioAnalysis productPortfolioAnalysis;

    public void setProductportfolioid(String productportfolioid) {
        this.productportfolioid = productportfolioid;
    }

    public String getProductportfolioid() {
        return productportfolioid;
    }

    public void setProductPortfolioAnalysis(org.museframework.bian.productportfolio.dto.cr.ProductPortfolioAnalysis productPortfolioAnalysis) {
        this.productPortfolioAnalysis = productPortfolioAnalysis;
    }

    public org.museframework.bian.productportfolio.dto.cr.ProductPortfolioAnalysis getProductPortfolioAnalysis() {
        return productPortfolioAnalysis;
    }
}