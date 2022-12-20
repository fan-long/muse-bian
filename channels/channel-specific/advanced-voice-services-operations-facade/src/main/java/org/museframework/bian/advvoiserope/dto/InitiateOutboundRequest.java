package org.museframework.bian.advvoiserope.dto;

public class InitiateOutboundRequest {
    private String advancedvoiceservicesoperationsid;

    private String outboundid;

    private org.museframework.bian.advvoiserope.dto.bq.Outbound outbound;

    public void setAdvancedvoiceservicesoperationsid(String advancedvoiceservicesoperationsid) {
        this.advancedvoiceservicesoperationsid = advancedvoiceservicesoperationsid;
    }

    public String getAdvancedvoiceservicesoperationsid() {
        return advancedvoiceservicesoperationsid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid;
    }

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutbound(org.museframework.bian.advvoiserope.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.advvoiserope.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}