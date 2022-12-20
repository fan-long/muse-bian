package org.museframework.bian.advvoiserope.dto;

public class InitiateInboundRequest {
    private String advancedvoiceservicesoperationsid;

    private String inboundid;

    private org.museframework.bian.advvoiserope.dto.bq.Inbound inbound;

    public void setAdvancedvoiceservicesoperationsid(String advancedvoiceservicesoperationsid) {
        this.advancedvoiceservicesoperationsid = advancedvoiceservicesoperationsid;
    }

    public String getAdvancedvoiceservicesoperationsid() {
        return advancedvoiceservicesoperationsid;
    }

    public void setInboundid(String inboundid) {
        this.inboundid = inboundid;
    }

    public String getInboundid() {
        return inboundid;
    }

    public void setInbound(org.museframework.bian.advvoiserope.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.advvoiserope.dto.bq.Inbound getInbound() {
        return inbound;
    }
}