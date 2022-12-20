package org.museframework.bian.advvoiserope.dto;

public class InitiateInboundResponse {
    private org.museframework.bian.advvoiserope.dto.bq.Inbound inbound;

    public void setInbound(org.museframework.bian.advvoiserope.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.advvoiserope.dto.bq.Inbound getInbound() {
        return inbound;
    }
}