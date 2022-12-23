package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyTraderTradingPermissionsandLimitsFunctionRequest {
    @MetaField
    private String traderpositionoperationsid;

    @MetaField
    private String tradertradingpermissionsandlimitsfunctionid;

    public void setTraderpositionoperationsid(String traderpositionoperationsid) {
        this.traderpositionoperationsid = traderpositionoperationsid;
    }

    public String getTraderpositionoperationsid() {
        return traderpositionoperationsid;
    }

    public void setTradertradingpermissionsandlimitsfunctionid(String tradertradingpermissionsandlimitsfunctionid) {
        this.tradertradingpermissionsandlimitsfunctionid = tradertradingpermissionsandlimitsfunctionid;
    }

    public String getTradertradingpermissionsandlimitsfunctionid() {
        return tradertradingpermissionsandlimitsfunctionid;
    }
}