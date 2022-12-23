/*An operational service or function supported within the Inbound Message Function for doing Inbound Message Function*/
package org.museframework.bian.operationalgateway.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OperationalGatewayOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Event operationalGatewayIncident;

    /**/
    @MetaField
    private String operationalGatewayProvision;

    public void setOperationalGatewayIncident(org.museframework.bian.classes.Event operationalGatewayIncident) {
        this.operationalGatewayIncident = operationalGatewayIncident;
    }

    public org.museframework.bian.classes.Event getOperationalGatewayIncident() {
        return operationalGatewayIncident;
    }

    public void setOperationalGatewayProvision(String operationalGatewayProvision) {
        this.operationalGatewayProvision = operationalGatewayProvision;
    }

    public String getOperationalGatewayProvision() {
        return operationalGatewayProvision;
    }
}