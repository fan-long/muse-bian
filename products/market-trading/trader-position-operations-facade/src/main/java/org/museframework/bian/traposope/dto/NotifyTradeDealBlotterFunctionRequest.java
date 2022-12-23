package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyTradeDealBlotterFunctionRequest {
    @MetaField
    private String traderpositionoperationsid;

    @MetaField
    private String tradedealblotterfunctionid;

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
}