package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMarketPriceAnalysisFunctionRequest {
    @MetaField
    private String etradingworkbenchid;

    @MetaField
    private String marketpriceanalysisfunctionid;

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
}