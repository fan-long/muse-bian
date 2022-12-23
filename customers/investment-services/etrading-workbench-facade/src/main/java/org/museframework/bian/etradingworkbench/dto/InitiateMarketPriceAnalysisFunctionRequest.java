package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateMarketPriceAnalysisFunctionRequest {
    @MetaField
    private String etradingworkbenchid;

    @MetaField
    private String marketpriceanalysisfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction marketPriceAnalysisFunction;

    public void setEtradingworkbenchid(String etradingworkbenchid) {
        this.etradingworkbenchid = etradingworkbenchid;
    }

    public String getEtradingworkbenchid() {
        return etradingworkbenchid;
    }

    public void setMarketpriceanalysisfunctionid(String marketpriceanalysisfunctionid) {
        this.marketpriceanalysisfunctionid = marketpriceanalysisfunctionid;
    }

    public String getMarketpriceanalysisfunctionid() {
        return marketpriceanalysisfunctionid;
    }

    public void setMarketPriceAnalysisFunction(org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction marketPriceAnalysisFunction) {
        this.marketPriceAnalysisFunction = marketPriceAnalysisFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.MarketPriceAnalysisFunction getMarketPriceAnalysisFunction() {
        return marketPriceAnalysisFunction;
    }
}