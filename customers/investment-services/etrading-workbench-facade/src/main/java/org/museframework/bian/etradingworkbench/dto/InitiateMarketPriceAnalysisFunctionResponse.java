package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateMarketPriceAnalysisFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction marketPriceAnalysisFunction;

    public void setMarketPriceAnalysisFunction(org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction marketPriceAnalysisFunction) {
        this.marketPriceAnalysisFunction = marketPriceAnalysisFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction getMarketPriceAnalysisFunction() {
        return marketPriceAnalysisFunction;
    }
}