package org.museframework.bian.achoperations.dto;

public class InitiateOutboundACHResponse {
    private org.museframework.bian.achoperations.dto.bq.OutboundACH outboundACH;

    public void setOutboundACH(org.museframework.bian.achoperations.dto.bq.OutboundACH outboundACH) {
        this.outboundACH = outboundACH;
    }

    public org.museframework.bian.achoperations.dto.bq.OutboundACH getOutboundACH() {
        return outboundACH;
    }
}