package org.museframework.bian.finmarres.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFinancialMarketResearchDirectoryEntryRequest {
    @MetaField
    private String financialmarketresearchid;

    public void setFinancialmarketresearchid(String financialmarketresearchid) {
        this.financialmarketresearchid = financialmarketresearchid;
    }

    public String getFinancialmarketresearchid() {
        return financialmarketresearchid;
    }
}