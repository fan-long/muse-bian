package org.museframework.bian.dealerdesk.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDealerDeskConsolidatedPositionTrackingFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.dealerdesk.dto.bq.DealerDeskConsolidatedPositionTrackingFunction dealerDeskConsolidatedPositionTrackingFunction;

    public void setDealerDeskConsolidatedPositionTrackingFunction(org.museframework.bian.dealerdesk.dto.bq.DealerDeskConsolidatedPositionTrackingFunction dealerDeskConsolidatedPositionTrackingFunction) {
        this.dealerDeskConsolidatedPositionTrackingFunction = dealerDeskConsolidatedPositionTrackingFunction;
    }

    public org.museframework.bian.dealerdesk.dto.bq.DealerDeskConsolidatedPositionTrackingFunction getDealerDeskConsolidatedPositionTrackingFunction() {
        return dealerDeskConsolidatedPositionTrackingFunction;
    }
}