package org.museframework.bian.advvoiserope.dto;

public class RetrieveOutboundResponse {
    private org.museframework.bian.advvoiserope.dto.bq.Outbound outbound;

    public void setOutbound(org.museframework.bian.advvoiserope.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.advvoiserope.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}