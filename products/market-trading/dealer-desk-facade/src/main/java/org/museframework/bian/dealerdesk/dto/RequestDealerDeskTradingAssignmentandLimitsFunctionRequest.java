package org.museframework.bian.dealerdesk.dto;

public class RequestDealerDeskTradingAssignmentandLimitsFunctionRequest {
    private String dealerdeskid;

    private String dealerdesktradingassignmentandlimitsfunctionid;

    private org.museframework.bian.dealerdesk.dto.bq.DealerDeskTradingAssignmentandLimitsFunction dealerDeskTradingAssignmentandLimitsFunction;

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

    public void setDealerDeskTradingAssignmentandLimitsFunction(org.museframework.bian.dealerdesk.dto.bq.DealerDeskTradingAssignmentandLimitsFunction dealerDeskTradingAssignmentandLimitsFunction) {
        this.dealerDeskTradingAssignmentandLimitsFunction = dealerDeskTradingAssignmentandLimitsFunction;
    }

    public org.museframework.bian.dealerdesk.dto.bq.DealerDeskTradingAssignmentandLimitsFunction getDealerDeskTradingAssignmentandLimitsFunction() {
        return dealerDeskTradingAssignmentandLimitsFunction;
    }
}