package org.museframework.bian.finmarana.dto;

public class RetrieveFinancialMarketInsightRequest {
    private String financialmarketanalysisid;

    private String financialmarketinsightid;

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
}