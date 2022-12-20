package org.museframework.bian.customersurveys.dto;

public class RetrieveDefinitionResponse {
    private org.museframework.bian.customersurveys.dto.bq.Definition definition;

    public void setDefinition(org.museframework.bian.customersurveys.dto.bq.Definition definition) {
        this.definition = definition;
    }

    public org.museframework.bian.customersurveys.dto.bq.Definition getDefinition() {
        return definition;
    }
}