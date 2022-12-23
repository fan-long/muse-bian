package org.museframework.bian.finmarana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateFinancialMarketAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis financialMarketAnalysis;

    public void setFinancialMarketAnalysis(org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis financialMarketAnalysis) {
        this.financialMarketAnalysis = financialMarketAnalysis;
    }

    public org.museframework.bian.finmarana.dto.cr.FinancialMarketAnalysis getFinancialMarketAnalysis() {
        return financialMarketAnalysis;
    }
}