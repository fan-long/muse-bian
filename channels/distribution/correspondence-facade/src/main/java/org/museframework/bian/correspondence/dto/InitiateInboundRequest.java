package org.museframework.bian.correspondence.dto;

public class InitiateInboundRequest {
    private String correspondenceid;

    private String inboundid;

    private org.museframework.bian.correspondence.dto.bq.Inbound inbound;

    public void setCorrespondenceid(String correspondenceid) {
        this.correspondenceid = correspondenceid;
    }

    public String getCorrespondenceid() {
        return correspondenceid;
    }

    public void setInboundid(String inboundid) {
        this.inboundid = inboundid;
    }

    public String getInboundid() {
        return inboundid;
    }

    public void setInbound(org.museframework.bian.correspondence.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.correspondence.dto.bq.Inbound getInbound() {
        return inbound;
    }
}