package org.museframework.bian.systemdevelopment.dto;

public class RequestTestingSpecificationResponse {
    private org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification testingSpecification;

    public void setTestingSpecification(org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification testingSpecification) {
        this.testingSpecification = testingSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification getTestingSpecification() {
        return testingSpecification;
    }
}