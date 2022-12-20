package org.museframework.bian.ebranchoperations.dto;

public class InitiateOutboundResponse {
    private org.museframework.bian.ebranchoperations.dto.bq.Outbound outbound;

    public void setOutbound(org.museframework.bian.ebranchoperations.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.ebranchoperations.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}