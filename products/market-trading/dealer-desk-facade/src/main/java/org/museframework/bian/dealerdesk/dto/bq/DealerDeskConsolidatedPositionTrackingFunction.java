/*An operational service or function supported within the Dealer Desk Consolidated Position Tracking Function for doing Dealer Desk Consolidated Position Tracking Function*/
package org.museframework.bian.dealerdesk.dto.bq;

public class DealerDeskConsolidatedPositionTrackingFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    private String schedule;

    /*The Dealer Desk Consolidated Position Tracking Function specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Dealer Desk Consolidated Position Tracking Function*/
    private org.museframework.bian.classes.Session dealerDeskOperatingSessionReference;

    /*Reference to Dealer Desk Consolidated Position Tracking Function*/
    private org.museframework.bian.classes.Function dealerDeskConsolidatedPositionTrackingFunctionReference;

    /*The type of Dealer Desk Consolidated Position Tracking Function*/
    private String dealerDeskConsolidatedPositionTrackingFunctionType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setDealerDeskOperatingSessionReference(org.museframework.bian.classes.Session dealerDeskOperatingSessionReference) {
        this.dealerDeskOperatingSessionReference = dealerDeskOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getDealerDeskOperatingSessionReference() {
        return dealerDeskOperatingSessionReference;
    }

    public void setDealerDeskConsolidatedPositionTrackingFunctionReference(org.museframework.bian.classes.Function dealerDeskConsolidatedPositionTrackingFunctionReference) {
        this.dealerDeskConsolidatedPositionTrackingFunctionReference = dealerDeskConsolidatedPositionTrackingFunctionReference;
    }

    public org.museframework.bian.classes.Function getDealerDeskConsolidatedPositionTrackingFunctionReference() {
        return dealerDeskConsolidatedPositionTrackingFunctionReference;
    }

    public void setDealerDeskConsolidatedPositionTrackingFunctionType(String dealerDeskConsolidatedPositionTrackingFunctionType) {
        this.dealerDeskConsolidatedPositionTrackingFunctionType = dealerDeskConsolidatedPositionTrackingFunctionType;
    }

    public String getDealerDeskConsolidatedPositionTrackingFunctionType() {
        return dealerDeskConsolidatedPositionTrackingFunctionType;
    }
}