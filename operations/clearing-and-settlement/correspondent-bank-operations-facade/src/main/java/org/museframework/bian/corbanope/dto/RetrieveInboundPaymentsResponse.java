package org.museframework.bian.corbanope.dto;

public class RetrieveInboundPaymentsResponse {
    private org.museframework.bian.corbanope.dto.bq.InboundPayments inboundPayments;

    public void setInboundPayments(org.museframework.bian.corbanope.dto.bq.InboundPayments inboundPayments) {
        this.inboundPayments = inboundPayments;
    }

    public org.museframework.bian.corbanope.dto.bq.InboundPayments getInboundPayments() {
        return inboundPayments;
    }
}