/*An operational service or function supported within the Outbound Transaction Function for doing Outbound Transaction Function*/
package org.museframework.bian.payraiope.dto.bq;

public class PaymentRailOperationsOutcome {
    /**/
    private org.museframework.bian.classes.Event paymentRailOperationsIncident;

    /**/
    private String paymentRailOperationsProvision;

    public void setPaymentRailOperationsIncident(org.museframework.bian.classes.Event paymentRailOperationsIncident) {
        this.paymentRailOperationsIncident = paymentRailOperationsIncident;
    }

    public org.museframework.bian.classes.Event getPaymentRailOperationsIncident() {
        return paymentRailOperationsIncident;
    }

    public void setPaymentRailOperationsProvision(String paymentRailOperationsProvision) {
        this.paymentRailOperationsProvision = paymentRailOperationsProvision;
    }

    public String getPaymentRailOperationsProvision() {
        return paymentRailOperationsProvision;
    }
}