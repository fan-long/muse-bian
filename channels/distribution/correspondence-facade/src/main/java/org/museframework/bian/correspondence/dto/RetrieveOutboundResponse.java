package org.museframework.bian.correspondence.dto;

public class RetrieveOutboundResponse {
    private org.museframework.bian.correspondence.dto.bq.Outbound outbound;

    public void setOutbound(org.museframework.bian.correspondence.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.correspondence.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}