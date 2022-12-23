package org.museframework.bian.dealerdesk.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateDealerDeskConsolidatedPositionTrackingFunctionRequest {
    @MetaField
    private String dealerdeskid;

    @MetaField
    private String dealerdeskconsolidatedpositiontrackingfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.dealerdesk.dto.bq.DealerDeskConsolidatedPositionTrackingFunction dealerDeskConsolidatedPositionTrackingFunction;

    public void setDealerdeskid(String dealerdeskid) {
        this.dealerdeskid = dealerdeskid;
    }

    public String getDealerdeskid() {
        return dealerdeskid;
    }

    public void setDealerdeskconsolidatedpositiontrackingfunctionid(String dealerdeskconsolidatedpositiontrackingfunctionid) {
        this.dealerdeskconsolidatedpositiontrackingfunctionid = dealerdeskconsolidatedpositiontrackingfunctionid;
    }

    public String getDealerdeskconsolidatedpositiontrackingfunctionid() {
        return dealerdeskconsolidatedpositiontrackingfunctionid;
    }

    public void setDealerDeskConsolidatedPositionTrackingFunction(org.museframework.bian.dealerdesk.dto.bq.DealerDeskConsolidatedPositionTrackingFunction dealerDeskConsolidatedPositionTrackingFunction) {
        this.dealerDeskConsolidatedPositionTrackingFunction = dealerDeskConsolidatedPositionTrackingFunction;
    }

    public org.museframework.bian.dealerdesk.dto.bq.DealerDeskConsolidatedPositionTrackingFunction getDealerDeskConsolidatedPositionTrackingFunction() {
        return dealerDeskConsolidatedPositionTrackingFunction;
    }
}