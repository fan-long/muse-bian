package org.museframework.bian.financialgateway.dto;

public class InitiateInboundRequest {
    private String financialgatewayid;

    private String inboundid;

    private org.museframework.bian.financialgateway.dto.bq.Inbound inbound;

    public void setFinancialgatewayid(String financialgatewayid) {
        this.financialgatewayid = financialgatewayid;
    }

    public String getFinancialgatewayid() {
        return financialgatewayid;
    }

    public void setInboundid(String inboundid) {
        this.inboundid = inboundid;
    }

    public String getInboundid() {
        return inboundid;
    }

    public void setInbound(org.museframework.bian.financialgateway.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.financialgateway.dto.bq.Inbound getInbound() {
        return inbound;
    }
}