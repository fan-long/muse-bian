package org.museframework.bian.finmarana.dto;

public class UpdateFinancialMarketInsightRequest {
    private String financialmarketanalysisid;

    private String financialmarketinsightid;

    private org.museframework.bian.finmarana.dto.bq.FinancialMarketInsight financialMarketInsight;

    public void setFinancialmarketanalysisid(String financialmarketanalysisid) {
        this.financialmarketanalysisid = financialmarketanalysisid;
    }

    public String getFinancialmarketanalysisid() {
        return financialmarketanalysisid;
    }

    public void setFinancialmarketinsightid(String financialmarketinsightid) {
        this.financialmarketinsightid = financialmarketinsightid;
    }

    public String getFinancialmarketinsightid() {
        return financialmarketinsightid;
    }

    public void setFinancialMarketInsight(org.museframework.bian.finmarana.dto.bq.FinancialMarketInsight financialMarketInsight) {
        this.financialMarketInsight = financialMarketInsight;
    }

    public org.museframework.bian.finmarana.dto.bq.FinancialMarketInsight getFinancialMarketInsight() {
        return financialMarketInsight;
    }
}