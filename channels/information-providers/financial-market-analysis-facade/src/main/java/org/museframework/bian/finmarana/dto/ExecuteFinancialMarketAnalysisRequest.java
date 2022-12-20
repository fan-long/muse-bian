package org.museframework.bian.finmarana.dto;

public class ExecuteFinancialMarketAnalysisRequest {
    private String financialmarketanalysisid;

    private org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis financialMarketAnalysis;

    public void setFinancialmarketanalysisid(String financialmarketanalysisid) {
        this.financialmarketanalysisid = financialmarketanalysisid;
    }

    public String getFinancialmarketanalysisid() {
        return financialmarketanalysisid;
    }

    public void setFinancialMarketAnalysis(org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis financialMarketAnalysis) {
        this.financialMarketAnalysis = financialMarketAnalysis;
    }

    public org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis getFinancialMarketAnalysis() {
        return financialMarketAnalysis;
    }
}