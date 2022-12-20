package org.museframework.bian.correspondence.dto;

public class RetrieveOutboundWithResponseRequest {
    private String correspondenceid;

    private String outboundwithresponseid;

    public void setCorrespondenceid(String correspondenceid) {
        this.correspondenceid = correspondenceid;
    }

    public String getCorrespondenceid() {
        return correspondenceid;
    }

    public void setOutboundwithresponseid(String outboundwithresponseid) {
        this.outboundwithresponseid = outboundwithresponseid;
    }

    public String getOutboundwithresponseid() {
        return outboundwithresponseid;
    }
}