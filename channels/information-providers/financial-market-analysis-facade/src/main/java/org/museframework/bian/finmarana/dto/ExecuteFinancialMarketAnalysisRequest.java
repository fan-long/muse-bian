package org.museframework.bian.finmarana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteFinancialMarketAnalysisRequest {
    @MetaField
    private String financialmarketanalysisid;

    @MetaField(ref=true)
    private org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis financialMarketAnalysis;

    public void setFinancialmarketanalysisid(String financialmarketanalysisid) {
        this.financialmarketanalysisid = financialmarketanalysisid;
    }

    public String getFinancialmarketanalysisid() {
        return financialmarketanalysisid;
    }

    public void setFinancialMarketAnalysis(org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis financialMarketAnalysis) {
        this.financialMarketAnalysis = financialMarketAnalysis;
    }

    public org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis getFinancialMarketAnalysis() {
        return financialMarketAnalysis;
    }
}