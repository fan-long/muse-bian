package org.museframework.bian.ebranchoperations.dto;

public class InitiateInboundRequest {
    private String ebranchoperationsid;

    private String inboundid;

    private org.museframework.bian.ebranchoperations.dto.bq.Inbound inbound;

    public void setEbranchoperationsid(String ebranchoperationsid) {
        this.ebranchoperationsid = ebranchoperationsid;
    }

    public String getEbranchoperationsid() {
        return ebranchoperationsid;
    }

    public void setInboundid(String inboundid) {
        this.inboundid = inboundid;
    }

    public String getInboundid() {
        return inboundid;
    }

    public void setInbound(org.museframework.bian.ebranchoperations.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.ebranchoperations.dto.bq.Inbound getInbound() {
        return inbound;
    }
}