package org.museframework.bian.systemdevelopment.dto;

public class RetrieveSoftwareandDataSpecificationRequest {
    private String systemdevelopmentid;

    private String softwareanddataspecificationid;

    public void setSystemdevelopmentid(String systemdevelopmentid) {
        this.systemdevelopmentid = systemdevelopmentid;
    }

    public String getSystemdevelopmentid() {
        return systemdevelopmentid;
    }

    public void setSoftwareanddataspecificationid(String softwareanddataspecificationid) {
        this.softwareanddataspecificationid = softwareanddataspecificationid;
    }

    public String getSoftwareanddataspecificationid() {
        return softwareanddataspecificationid;
    }
}