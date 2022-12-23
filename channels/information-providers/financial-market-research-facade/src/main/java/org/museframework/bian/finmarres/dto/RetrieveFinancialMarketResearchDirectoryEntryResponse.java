package org.museframework.bian.finmarres.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFinancialMarketResearchDirectoryEntryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.finmarres.dto.cr.FinancialMarketResearchDirectoryEntry financialMarketResearchDirectoryEntry;

    public void setFinancialMarketResearchDirectoryEntry(org.museframework.bian.finmarres.dto.cr.FinancialMarketResearchDirectoryEntry financialMarketResearchDirectoryEntry) {
        this.financialMarketResearchDirectoryEntry = financialMarketResearchDirectoryEntry;
    }

    public org.museframework.bian.finmarres.dto.cr.FinancialMarketResearchDirectoryEntry getFinancialMarketResearchDirectoryEntry() {
        return financialMarketResearchDirectoryEntry;
    }
}