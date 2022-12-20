package org.museframework.bian.dealerdesk.dto;

public class NotifyDealerDeskTradingAssignmentandLimitsFunctionRequest {
    private String dealerdeskid;

    private String dealerdesktradingassignmentandlimitsfunctionid;

    public void setDealerdeskid(String dealerdeskid) {
        this.dealerdeskid = dealerdeskid;
    }

    public String getDealerdeskid() {
        return dealerdeskid;
    }

    public void setDealerdesktradingassignmentandlimitsfunctionid(String dealerdesktradingassignmentandlimitsfunctionid) {
        this.dealerdesktradingassignmentandlimitsfunctionid = dealerdesktradingassignmentandlimitsfunctionid;
    }

    public String getDealerdesktradingassignmentandlimitsfunctionid() {
        return dealerdesktradingassignmentandlimitsfunctionid;
    }
}