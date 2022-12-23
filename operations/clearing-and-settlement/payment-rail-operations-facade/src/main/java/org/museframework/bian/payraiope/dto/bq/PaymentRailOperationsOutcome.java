/*An operational service or function supported within the Outbound Transaction Function for doing Outbound Transaction Function*/
package org.museframework.bian.payraiope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PaymentRailOperationsOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Event paymentRailOperationsIncident;

    /**/
    @MetaField
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