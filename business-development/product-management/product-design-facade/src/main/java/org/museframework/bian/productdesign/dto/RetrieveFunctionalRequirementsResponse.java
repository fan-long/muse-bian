package org.museframework.bian.productdesign.dto;

public class RetrieveFunctionalRequirementsResponse {
    private org.museframework.bian.productdesign.dto.bq.FunctionalRequirements functionalRequirements;

    public void setFunctionalRequirements(org.museframework.bian.productdesign.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.productdesign.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}