package org.museframework.bian.finmarana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteFinancialMarketInsightResponse {
    @MetaField(ref=true)
    private org.museframework.bian.finmarana.dto.bq.FinancialMarketInsight financialMarketInsight;

    public void setFinancialMarketInsight(org.museframework.bian.finmarana.dto.bq.FinancialMarketInsight financialMarketInsight) {
        this.financialMarketInsight = financialMarketInsight;
    }

    public org.museframework.bian.finmarana.dto.bq.FinancialMarketInsight getFinancialMarketInsight() {
        return financialMarketInsight;
    }
}