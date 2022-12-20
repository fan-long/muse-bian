package org.museframework.bian.systemdevelopment.dto;

public class RetrieveTestingSpecificationRequest {
    private String systemdevelopmentid;

    private String testingspecificationid;

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
}