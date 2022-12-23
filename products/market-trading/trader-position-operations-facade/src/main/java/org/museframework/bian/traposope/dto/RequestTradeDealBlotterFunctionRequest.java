package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestTradeDealBlotterFunctionRequest {
    @MetaField
    private String traderpositionoperationsid;

    @MetaField
    private String tradedealblotterfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.traposope.dto.bq.TradeDealBlotterFunction tradeDealBlotterFunction;

    public void setTraderpositionoperationsid(String traderpositionoperationsid) {
        this.traderpositionoperationsid = traderpositionoperationsid;
    }

    public String getTraderpositionoperationsid() {
        return traderpositionoperationsid;
    }

    public void setTradedealblotterfunctionid(String tradedealblotterfunctionid) {
        this.tradedealblotterfunctionid = tradedealblotterfunctionid;
    }

    public String getTradedealblotterfunctionid() {
        return tradedealblotterfunctionid;
    }

    public void setTradeDealBlotterFunction(org.museframework.bian.traposope.dto.bq.TradeDealBlotterFunction tradeDealBlotterFunction) {
        this.tradeDealBlotterFunction = tradeDealBlotterFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TradeDealBlotterFunction getTradeDealBlotterFunction() {
        return tradeDealBlotterFunction;
    }
}