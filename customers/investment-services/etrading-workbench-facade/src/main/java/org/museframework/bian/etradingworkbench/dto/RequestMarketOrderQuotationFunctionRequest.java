package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestMarketOrderQuotationFunctionRequest {
    @MetaField
    private String etradingworkbenchid;

    @MetaField
    private String marketorderquotationfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.etradingworkbench.dto.bq.MarketOrderQuotationFunction marketOrderQuotationFunction;

    public void setEtradingworkbenchid(String etradingworkbenchid) {
        this.etradingworkbenchid = etradingworkbenchid;
    }

    public String getEtradingworkbenchid() {
        return etradingworkbenchid;
    }

    public void setMarketorderquotationfunctionid(String marketorderquotationfunctionid) {
        this.marketorderquotationfunctionid = marketorderquotationfunctionid;
    }

    public String getMarketorderquotationfunctionid() {
        return marketorderquotationfunctionid;
    }

    public void setMarketOrderQuotationFunction(org.museframework.bian.etradingworkbench.dto.bq.MarketOrderQuotationFunction marketOrderQuotationFunction) {
        this.marketOrderQuotationFunction = marketOrderQuotationFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.MarketOrderQuotationFunction getMarketOrderQuotationFunction() {
        return marketOrderQuotationFunction;
    }
}