package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestTraderTradingPermissionsandLimitsFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.traposope.dto.bq.TraderTradingPermissionsandLimitsFunction traderTradingPermissionsandLimitsFunction;

    public void setTraderTradingPermissionsandLimitsFunction(org.museframework.bian.traposope.dto.bq.TraderTradingPermissionsandLimitsFunction traderTradingPermissionsandLimitsFunction) {
        this.traderTradingPermissionsandLimitsFunction = traderTradingPermissionsandLimitsFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TraderTradingPermissionsandLimitsFunction getTraderTradingPermissionsandLimitsFunction() {
        return traderTradingPermissionsandLimitsFunction;
    }
}