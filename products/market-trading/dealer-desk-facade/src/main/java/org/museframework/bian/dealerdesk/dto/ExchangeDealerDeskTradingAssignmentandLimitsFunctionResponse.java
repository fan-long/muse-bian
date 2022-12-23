package org.museframework.bian.dealerdesk.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeDealerDeskTradingAssignmentandLimitsFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.dealerdesk.dto.bq.DealerDeskTradingAssignmentandLimitsFunction dealerDeskTradingAssignmentandLimitsFunction;

    public void setDealerDeskTradingAssignmentandLimitsFunction(org.museframework.bian.dealerdesk.dto.bq.DealerDeskTradingAssignmentandLimitsFunction dealerDeskTradingAssignmentandLimitsFunction) {
        this.dealerDeskTradingAssignmentandLimitsFunction = dealerDeskTradingAssignmentandLimitsFunction;
    }

    public org.museframework.bian.dealerdesk.dto.bq.DealerDeskTradingAssignmentandLimitsFunction getDealerDeskTradingAssignmentandLimitsFunction() {
        return dealerDeskTradingAssignmentandLimitsFunction;
    }
}