package org.museframework.bian.finmarana.dto;

public class RequestFinancialMarketAnalysisResponse {
    private org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis financialMarketAnalysis;

    public void setFinancialMarketAnalysis(org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis financialMarketAnalysis) {
        this.financialMarketAnalysis = financialMarketAnalysis;
    }

    public org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis getFinancialMarketAnalysis() {
        return financialMarketAnalysis;
    }
}