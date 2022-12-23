package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteTradeClearingProcedureRequest {
    @MetaField
    private String tradeclearingid;

    @MetaField(ref=true)
    private org.museframework.bian.tradeclearing.dto.cr.TradeClearingProcedure tradeClearingProcedure;

    public void setTradeclearingid(String tradeclearingid) {
        this.tradeclearingid = tradeclearingid;
    }

    public String getTradeclearingid() {
        return tradeclearingid;
    }

    public void setTradeClearingProcedure(org.museframework.bian.tradeclearing.dto.cr.TradeClearingProcedure tradeClearingProcedure) {
        this.tradeClearingProcedure = tradeClearingProcedure;
    }

    public org.museframework.bian.tradeclearing.dto.cr.TradeClearingProcedure getTradeClearingProcedure() {
        return tradeClearingProcedure;
    }
}