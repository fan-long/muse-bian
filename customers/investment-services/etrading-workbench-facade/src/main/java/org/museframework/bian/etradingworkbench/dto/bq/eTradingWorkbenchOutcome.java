/*An operational service or function supported within the Market Order Initiation Function for doing Market Order Initiation Function*/
package org.museframework.bian.etradingworkbench.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class eTradingWorkbenchOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Event eTradingWorkbenchIncident;

    /**/
    @MetaField(0)
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