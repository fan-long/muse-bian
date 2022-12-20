package org.museframework.bian.systemdevelopment.dto;

public class RetrieveTechnicalSpecificationRequest {
    private String systemdevelopmentid;

    private String technicalspecificationid;

    public void setSystemdevelopmentid(String systemdevelopmentid) {
        this.systemdevelopmentid = systemdevelopmentid;
    }

    public String getSystemdevelopmentid() {
        return systemdevelopmentid;
    }

    public void setTechnicalspecificationid(String technicalspecificationid) {
        this.technicalspecificationid = technicalspecificationid;
    }

    public String getTechnicalspecificationid() {
        return technicalspecificationid;
    }
}