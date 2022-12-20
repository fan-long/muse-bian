package org.museframework.bian.correspondence.dto;

public class UpdateOutboundRequest {
    private String correspondenceid;

    private String outboundid;

    private org.museframework.bian.correspondence.dto.bq.Outbound outbound;

    public void setCorrespondenceid(String correspondenceid) {
        this.correspondenceid = correspondenceid;
    }

    public String getCorrespondenceid() {
        return correspondenceid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid;
    }

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutbound(org.museframework.bian.correspondence.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.correspondence.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}