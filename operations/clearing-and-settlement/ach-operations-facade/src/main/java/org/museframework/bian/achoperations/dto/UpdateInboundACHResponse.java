package org.museframework.bian.achoperations.dto;

public class UpdateInboundACHResponse {
    private org.museframework.bian.achoperations.dto.bq.InboundACH inboundACH;

    public void setInboundACH(org.museframework.bian.achoperations.dto.bq.InboundACH inboundACH) {
        this.inboundACH = inboundACH;
    }

    public org.museframework.bian.achoperations.dto.bq.InboundACH getInboundACH() {
        return inboundACH;
    }
}