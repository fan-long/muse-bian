package org.museframework.bian.finmarres.dto;

public class UpdateFinancialMarketResearchDirectoryEntryRequest {
    private String financialmarketresearchid;

    private org.museframework.bian.finmarres.dto.cr.FinancialMarketResearchDirectoryEntry financialMarketResearchDirectoryEntry;

    public void setFinancialmarketresearchid(String financialmarketresearchid) {
        this.financialmarketresearchid = financialmarketresearchid;
    }

    public String getFinancialmarketresearchid() {
        return financialmarketresearchid;
    }

    public void setFinancialMarketResearchDirectoryEntry(org.museframework.bian.finmarres.dto.cr.FinancialMarketResearchDirectoryEntry financialMarketResearchDirectoryEntry) {
        this.financialMarketResearchDirectoryEntry = financialMarketResearchDirectoryEntry;
    }

    public org.museframework.bian.finmarres.dto.cr.FinancialMarketResearchDirectoryEntry getFinancialMarketResearchDirectoryEntry() {
        return financialMarketResearchDirectoryEntry;
    }
}