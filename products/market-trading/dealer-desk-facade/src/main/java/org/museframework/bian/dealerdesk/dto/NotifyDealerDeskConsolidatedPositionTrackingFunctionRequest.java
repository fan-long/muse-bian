package org.museframework.bian.dealerdesk.dto;

public class NotifyDealerDeskConsolidatedPositionTrackingFunctionRequest {
    private String dealerdeskid;

    private String dealerdeskconsolidatedpositiontrackingfunctionid;

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
}