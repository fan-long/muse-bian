package org.museframework.bian.correspondence.dto;

public class InitiateOutboundWithResponseRequest {
    private String correspondenceid;

    private String outboundwithresponseid;

    private org.museframework.bian.correspondence.dto.bq.OutboundWithResponse outboundWithResponse;

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

    public void setOutboundWithResponse(org.museframework.bian.correspondence.dto.bq.OutboundWithResponse outboundWithResponse) {
        this.outboundWithResponse = outboundWithResponse;
    }

    public org.museframework.bian.correspondence.dto.bq.OutboundWithResponse getOutboundWithResponse() {
        return outboundWithResponse;
    }
}