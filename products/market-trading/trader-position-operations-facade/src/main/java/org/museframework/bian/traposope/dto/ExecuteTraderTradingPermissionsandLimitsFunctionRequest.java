package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteTraderTradingPermissionsandLimitsFunctionRequest {
    @MetaField
    private String traderpositionoperationsid;

    @MetaField
    private String tradertradingpermissionsandlimitsfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.traposope.dto.bq.TraderTradingPermissionsandLimitsFunction traderTradingPermissionsandLimitsFunction;

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

    public void setTraderTradingPermissionsandLimitsFunction(org.museframework.bian.traposope.dto.bq.TraderTradingPermissionsandLimitsFunction traderTradingPermissionsandLimitsFunction) {
        this.traderTradingPermissionsandLimitsFunction = traderTradingPermissionsandLimitsFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TraderTradingPermissionsandLimitsFunction getTraderTradingPermissionsandLimitsFunction() {
        return traderTradingPermissionsandLimitsFunction;
    }
}