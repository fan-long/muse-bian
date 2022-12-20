package org.museframework.bian.fraudmodel.dto;

public class CaptureFunctionalRequirementsResponse {
    private org.museframework.bian.fraudmodel.dto.bq.FunctionalRequirements functionalRequirements;

    public void setFunctionalRequirements(org.museframework.bian.fraudmodel.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.fraudmodel.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}