package org.museframework.bian.systemdevelopment.dto;

public class CaptureFunctionalSpecificationResponse {
    private org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification functionalSpecification;

    public void setFunctionalSpecification(org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification functionalSpecification) {
        this.functionalSpecification = functionalSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification getFunctionalSpecification() {
        return functionalSpecification;
    }
}