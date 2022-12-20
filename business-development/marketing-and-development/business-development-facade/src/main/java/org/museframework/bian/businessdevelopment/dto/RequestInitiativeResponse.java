package org.museframework.bian.businessdevelopment.dto;

public class RequestInitiativeResponse {
    private org.museframework.bian.businessdevelopment.dto.bq.Initiative initiative;

    public void setInitiative(org.museframework.bian.businessdevelopment.dto.bq.Initiative initiative) {
        this.initiative = initiative;
    }

    public org.museframework.bian.businessdevelopment.dto.bq.Initiative getInitiative() {
        return initiative;
    }
}