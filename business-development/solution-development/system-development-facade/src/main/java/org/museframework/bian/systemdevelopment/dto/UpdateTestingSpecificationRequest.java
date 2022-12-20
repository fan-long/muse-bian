package org.museframework.bian.systemdevelopment.dto;

public class UpdateTestingSpecificationRequest {
    private String systemdevelopmentid;

    private String testingspecificationid;

    private org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification testingSpecification;

    public void setSystemdevelopmentid(String systemdevelopmentid) {
        this.systemdevelopmentid = systemdevelopmentid;
    }

    public String getSystemdevelopmentid() {
        return systemdevelopmentid;
    }

    public void setTestingspecificationid(String testingspecificationid) {
        this.testingspecificationid = testingspecificationid;
    }

    public String getTestingspecificationid() {
        return testingspecificationid;
    }

    public void setTestingSpecification(org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification testingSpecification) {
        this.testingSpecification = testingSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification getTestingSpecification() {
        return testingSpecification;
    }
}