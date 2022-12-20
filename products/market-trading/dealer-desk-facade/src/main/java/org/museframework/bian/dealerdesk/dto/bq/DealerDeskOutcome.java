/*An operational service or function supported within the Dealer Desk Consolidated Position Tracking Function for doing Dealer Desk Consolidated Position Tracking Function*/
package org.museframework.bian.dealerdesk.dto.bq;

public class DealerDeskOutcome {
    /**/
    private org.museframework.bian.classes.Event dealerDeskIncident;

    /**/
    private String dealerDeskProvision;

    public void setDealerDeskIncident(org.museframework.bian.classes.Event dealerDeskIncident) {
        this.dealerDeskIncident = dealerDeskIncident;
    }

    public org.museframework.bian.classes.Event getDealerDeskIncident() {
        return dealerDeskIncident;
    }

    public void setDealerDeskProvision(String dealerDeskProvision) {
        this.dealerDeskProvision = dealerDeskProvision;
    }

    public String getDealerDeskProvision() {
        return dealerDeskProvision;
    }
}