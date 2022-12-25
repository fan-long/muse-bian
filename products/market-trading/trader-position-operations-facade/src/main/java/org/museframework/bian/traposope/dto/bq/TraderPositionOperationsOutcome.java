/*An operational service or function supported within the Trade Capture and Reporting Function for doing Trade Capture and Reporting Function*/
package org.museframework.bian.traposope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TraderPositionOperationsOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Event traderPositionOperationsIncident;

    /**/
    @MetaField(0)
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