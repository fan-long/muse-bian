package org.museframework.bian.advvoiserope.dto;

public class RetrieveOutboundRequest {
    private String advancedvoiceservicesoperationsid;

    private String outboundid;

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
}