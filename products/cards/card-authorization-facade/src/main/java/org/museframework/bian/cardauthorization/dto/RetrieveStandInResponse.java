package org.museframework.bian.cardauthorization.dto;

public class RetrieveStandInResponse {
    private org.museframework.bian.cardauthorization.dto.bq.StandIn standIn;

    public void setStandIn(org.museframework.bian.cardauthorization.dto.bq.StandIn standIn) {
        this.standIn = standIn;
    }

    public org.museframework.bian.cardauthorization.dto.bq.StandIn getStandIn() {
        return standIn;
    }
}