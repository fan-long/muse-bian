package org.museframework.bian.finmarres.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteFinancialMarketResearchDirectoryEntryRequest {
    @MetaField
    private String financialmarketresearchid;

    @MetaField(ref=true)
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