package org.museframework.bian.fraudevaluation.dto;

public class RetrieveModelsResponse {
    private org.museframework.bian.fraudevaluation.dto.bq.Models models;

    public void setModels(org.museframework.bian.fraudevaluation.dto.bq.Models models) {
        this.models = models;
    }

    public org.museframework.bian.fraudevaluation.dto.bq.Models getModels() {
        return models;
    }
}