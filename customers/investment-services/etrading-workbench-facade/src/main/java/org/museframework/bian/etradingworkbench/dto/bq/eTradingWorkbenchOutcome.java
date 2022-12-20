/*An operational service or function supported within the Market Order Initiation Function for doing Market Order Initiation Function*/
package org.museframework.bian.etradingworkbench.dto.bq;

public class eTradingWorkbenchOutcome {
    /**/
    private org.museframework.bian.classes.Event eTradingWorkbenchIncident;

    /**/
    private String eTradingWorkbenchProvision;

    public void seteTradingWorkbenchIncident(org.museframework.bian.classes.Event eTradingWorkbenchIncident) {
        this.eTradingWorkbenchIncident = eTradingWorkbenchIncident;
    }

    public org.museframework.bian.classes.Event geteTradingWorkbenchIncident() {
        return eTradingWorkbenchIncident;
    }

    public void seteTradingWorkbenchProvision(String eTradingWorkbenchProvision) {
        this.eTradingWorkbenchProvision = eTradingWorkbenchProvision;
    }

    public String geteTradingWorkbenchProvision() {
        return eTradingWorkbenchProvision;
    }
}