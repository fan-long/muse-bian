package org.museframework.bian.dealerdesk.dto;

public class InitiateDealerDeskConsolidatedPositionTrackingFunctionRequest {
    private String dealerdeskid;

    private String dealerdeskconsolidatedpositiontrackingfunctionid;

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