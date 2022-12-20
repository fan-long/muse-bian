package org.museframework.bian.correspondence.dto;

public class RetrieveOutboundRequest {
    private String correspondenceid;

    private String outboundid;

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
}