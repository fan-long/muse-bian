package org.museframework.bian.systemdevelopment.dto;

public class RetrieveFunctionalSpecificationRequest {
    private String systemdevelopmentid;

    private String functionalspecificationid;

    public void setSystemdevelopmentid(String systemdevelopmentid) {
        this.systemdevelopmentid = systemdevelopmentid;
    }

    public String getSystemdevelopmentid() {
        return systemdevelopmentid;
    }

    public void setFunctionalspecificationid(String functionalspecificationid) {
        this.functionalspecificationid = functionalspecificationid;
    }

    public String getFunctionalspecificationid() {
        return functionalspecificationid;
    }
}