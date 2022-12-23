package org.museframework.bian.trabooove.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTradingPositionManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.trabooove.dto.cr.TradingPositionManagementPlan tradingPositionManagementPlan;

    public void setTradingPositionManagementPlan(org.museframework.bian.trabooove.dto.cr.TradingPositionManagementPlan tradingPositionManagementPlan) {
        this.tradingPositionManagementPlan = tradingPositionManagementPlan;
    }

    public org.museframework.bian.trabooove.dto.cr.TradingPositionManagementPlan getTradingPositionManagementPlan() {
        return tradingPositionManagementPlan;
    }
}