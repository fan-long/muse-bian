/*An operational service or function supported within the Trade Capture and Reporting Function for doing Trade Capture and Reporting Function*/
package org.museframework.bian.traposope.dto.bq;

public class TraderPositionOperationsOutcome {
    /**/
    private org.museframework.bian.classes.Event traderPositionOperationsIncident;

    /**/
    private String traderPositionOperationsProvision;

    public void setTraderPositionOperationsIncident(org.museframework.bian.classes.Event traderPositionOperationsIncident) {
        this.traderPositionOperationsIncident = traderPositionOperationsIncident;
    }

    public org.museframework.bian.classes.Event getTraderPositionOperationsIncident() {
        return traderPositionOperationsIncident;
    }

    public void setTraderPositionOperationsProvision(String traderPositionOperationsProvision) {
        this.traderPositionOperationsProvision = traderPositionOperationsProvision;
    }

    public String getTraderPositionOperationsProvision() {
        return traderPositionOperationsProvision;
    }
}