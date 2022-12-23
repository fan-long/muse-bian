package org.museframework.bian.trabooove.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantTradingPositionManagementPlanRequest {
    @MetaField
    private String tradingbookoversightid;

    @MetaField(ref=true)
    private org.museframework.bian.trabooove.dto.cr.TradingPositionManagementPlan tradingPositionManagementPlan;

    public void setTradingbookoversightid(String tradingbookoversightid) {
        this.tradingbookoversightid = tradingbookoversightid;
    }

    public String getTradingbookoversightid() {
        return tradingbookoversightid;
    }

    public void setTradingPositionManagementPlan(org.museframework.bian.trabooove.dto.cr.TradingPositionManagementPlan tradingPositionManagementPlan) {
        this.tradingPositionManagementPlan = tradingPositionManagementPlan;
    }

    public org.museframework.bian.trabooove.dto.cr.TradingPositionManagementPlan getTradingPositionManagementPlan() {
        return tradingPositionManagementPlan;
    }
}