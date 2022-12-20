package org.museframework.bian.systemdevelopment.dto;

public class RetrieveTechnicalSpecificationResponse {
    private org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification technicalSpecification;

    public void setTechnicalSpecification(org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification technicalSpecification) {
        this.technicalSpecification = technicalSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification getTechnicalSpecification() {
        return technicalSpecification;
    }
}