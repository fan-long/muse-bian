package org.museframework.bian.finmarres.dto;

public class RegisterFinancialMarketResearchDirectoryEntryRequest {
    private org.museframework.bian.finmarres.dto.cr.FinancialMarketResearchDirectoryEntry financialMarketResearchDirectoryEntry;

    public void setFinancialMarketResearchDirectoryEntry(org.museframework.bian.finmarres.dto.cr.FinancialMarketResearchDirectoryEntry financialMarketResearchDirectoryEntry) {
        this.financialMarketResearchDirectoryEntry = financialMarketResearchDirectoryEntry;
    }

    public org.museframework.bian.finmarres.dto.cr.FinancialMarketResearchDirectoryEntry getFinancialMarketResearchDirectoryEntry() {
        return financialMarketResearchDirectoryEntry;
    }
}