package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeMarketOrderInitiationFunctionRequest {
    @MetaField
    private String etradingworkbenchid;

    @MetaField
    private String marketorderinitiationfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction marketOrderInitiationFunction;

    public void setEtradingworkbenchid(String etradingworkbenchid) {
        this.etradingworkbenchid = etradingworkbenchid;
    }

    public String getEtradingworkbenchid() {
        return etradingworkbenchid;
    }

    public void setMarketorderinitiationfunctionid(String marketorderinitiationfunctionid) {
        this.marketorderinitiationfunctionid = marketorderinitiationfunctionid;
    }

    public String getMarketorderinitiationfunctionid() {
        return marketorderinitiationfunctionid;
    }

    public void setMarketOrderInitiationFunction(org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction marketOrderInitiationFunction) {
        this.marketOrderInitiationFunction = marketOrderInitiationFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction getMarketOrderInitiationFunction() {
        return marketOrderInitiationFunction;
    }
}