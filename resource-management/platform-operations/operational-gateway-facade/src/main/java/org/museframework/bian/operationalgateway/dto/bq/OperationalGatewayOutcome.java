/*An operational service or function supported within the Inbound Message Function for doing Inbound Message Function*/
package org.museframework.bian.operationalgateway.dto.bq;

public class OperationalGatewayOutcome {
    /**/
    private org.museframework.bian.classes.Event operationalGatewayIncident;

    /**/
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