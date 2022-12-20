package org.museframework.bian.financialgateway.dto;

public class InitiateOutboundRequest {
    private String financialgatewayid;

    private String outboundid;

    private org.museframework.bian.financialgateway.dto.bq.Outbound outbound;

    public void setFinancialgatewayid(String financialgatewayid) {
        this.financialgatewayid = financialgatewayid;
    }

    public String getFinancialgatewayid() {
        return financialgatewayid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid;
    }

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutbound(org.museframework.bian.financialgateway.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.financialgateway.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}