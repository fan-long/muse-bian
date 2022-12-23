package org.museframework.bian.finmarana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFinancialMarketInsightRequest {
    @MetaField
    private String financialmarketanalysisid;

    @MetaField
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