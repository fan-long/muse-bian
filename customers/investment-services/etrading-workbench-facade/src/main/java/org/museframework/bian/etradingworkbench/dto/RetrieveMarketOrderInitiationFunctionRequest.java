package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMarketOrderInitiationFunctionRequest {
    @MetaField
    private String etradingworkbenchid;

    @MetaField
    private String marketorderinitiationfunctionid;

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
}