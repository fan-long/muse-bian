package org.museframework.bian.customercase.dto;

public class RetrieveDeterminationResponse {
    private org.museframework.bian.customercase.dto.bq.Determination determination;

    public void setDetermination(org.museframework.bian.customercase.dto.bq.Determination determination) {
        this.determination = determination;
    }

    public org.museframework.bian.customercase.dto.bq.Determination getDetermination() {
        return determination;
    }
}