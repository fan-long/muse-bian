package org.museframework.bian.ebranchoperations.dto;

public class InitiateOutboundRequest {
    private String ebranchoperationsid;

    private String outboundid;

    private org.museframework.bian.ebranchoperations.dto.bq.Outbound outbound;

    public void setEbranchoperationsid(String ebranchoperationsid) {
        this.ebranchoperationsid = ebranchoperationsid;
    }

    public String getEbranchoperationsid() {
        return ebranchoperationsid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid;
    }

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutbound(org.museframework.bian.ebranchoperations.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.ebranchoperations.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}