package org.museframework.bian.ebranchoperations.dto;

public class InitiateInboundResponse {
    private org.museframework.bian.ebranchoperations.dto.bq.Inbound inbound;

    public void setInbound(org.museframework.bian.ebranchoperations.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.ebranchoperations.dto.bq.Inbound getInbound() {
        return inbound;
    }
}