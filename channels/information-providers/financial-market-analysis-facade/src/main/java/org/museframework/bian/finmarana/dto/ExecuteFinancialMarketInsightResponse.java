package org.museframework.bian.finmarana.dto;

public class ExecuteFinancialMarketInsightResponse {
    private org.museframework.bian.finmarana.dto.bq.FinancialMarketInsight financialMarketInsight;

    public void setFinancialMarketInsight(org.museframework.bian.finmarana.dto.bq.FinancialMarketInsight financialMarketInsight) {
        this.financialMarketInsight = financialMarketInsight;
    }

    public org.museframework.bian.finmarana.dto.bq.FinancialMarketInsight getFinancialMarketInsight() {
        return financialMarketInsight;
    }
}