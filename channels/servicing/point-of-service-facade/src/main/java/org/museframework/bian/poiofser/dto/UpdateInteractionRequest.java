package org.museframework.bian.poiofser.dto;

public class UpdateInteractionRequest {
    private String pointofserviceid;

    private String interactionid;

    private org.museframework.bian.poiofser.dto.bq.Interaction interaction;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setInteractionid(String interactionid) {
        this.interactionid = interactionid;
    }

    public String getInteractionid() {
        return interactionid;
    }

    public void setInteraction(org.museframework.bian.poiofser.dto.bq.Interaction interaction) {
        this.interaction = interaction;
    }

    public org.museframework.bian.poiofser.dto.bq.Interaction getInteraction() {
        return interaction;
    }
}