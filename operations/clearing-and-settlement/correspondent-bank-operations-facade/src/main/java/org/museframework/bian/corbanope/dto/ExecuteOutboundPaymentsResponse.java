package org.museframework.bian.corbanope.dto;

public class ExecuteOutboundPaymentsResponse {
    private org.museframework.bian.corbanope.dto.bq.OutboundPayments outboundPayments;

    public void setOutboundPayments(org.museframework.bian.corbanope.dto.bq.OutboundPayments outboundPayments) {
        this.outboundPayments = outboundPayments;
    }

    public org.museframework.bian.corbanope.dto.bq.OutboundPayments getOutboundPayments() {
        return outboundPayments;
    }
}