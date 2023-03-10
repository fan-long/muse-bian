package org.museframework.bian.finmarana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteFinancialMarketInsightRequest {
    @MetaField
    private String financialmarketanalysisid;

    @MetaField
    private String financialmarketinsightid;

    @MetaField(ref=true)
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