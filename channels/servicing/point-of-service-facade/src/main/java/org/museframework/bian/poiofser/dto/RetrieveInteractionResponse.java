package org.museframework.bian.poiofser.dto;

public class RetrieveInteractionResponse {
    private org.museframework.bian.poiofser.dto.bq.Interaction interaction;

    public void setInteraction(org.museframework.bian.poiofser.dto.bq.Interaction interaction) {
        this.interaction = interaction;
    }

    public org.museframework.bian.poiofser.dto.bq.Interaction getInteraction() {
        return interaction;
    }
}