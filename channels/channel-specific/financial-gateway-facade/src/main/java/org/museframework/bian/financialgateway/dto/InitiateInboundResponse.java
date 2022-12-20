package org.museframework.bian.financialgateway.dto;

public class InitiateInboundResponse {
    private org.museframework.bian.financialgateway.dto.bq.Inbound inbound;

    public void setInbound(org.museframework.bian.financialgateway.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.financialgateway.dto.bq.Inbound getInbound() {
        return inbound;
    }
}