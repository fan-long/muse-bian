package org.museframework.bian.financialgateway.dto;

public class RetrieveOutboundResponse {
    private org.museframework.bian.financialgateway.dto.bq.Outbound outbound;

    public void setOutbound(org.museframework.bian.financialgateway.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.financialgateway.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}