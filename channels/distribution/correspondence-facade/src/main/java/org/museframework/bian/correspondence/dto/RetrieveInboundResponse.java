package org.museframework.bian.correspondence.dto;

public class RetrieveInboundResponse {
    private org.museframework.bian.correspondence.dto.bq.Inbound inbound;

    public void setInbound(org.museframework.bian.correspondence.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.correspondence.dto.bq.Inbound getInbound() {
        return inbound;
    }
}