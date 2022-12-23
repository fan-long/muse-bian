/*An operational service or function supported within the Dealer Desk Consolidated Position Tracking Function for doing Dealer Desk Consolidated Position Tracking Function*/
package org.museframework.bian.dealerdesk.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DealerDeskOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Event dealerDeskIncident;

    /**/
    @MetaField
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