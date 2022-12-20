package org.museframework.bian.systemdevelopment.dto;

public class UpdateSoftwareandDataSpecificationRequest {
    private String systemdevelopmentid;

    private String softwareanddataspecificationid;

    private org.museframework.bian.systemdevelopment.dto.bq.SoftwareandDataSpecification softwareandDataSpecification;

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

    public void setSoftwareandDataSpecification(org.museframework.bian.systemdevelopment.dto.bq.SoftwareandDataSpecification softwareandDataSpecification) {
        this.softwareandDataSpecification = softwareandDataSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.SoftwareandDataSpecification getSoftwareandDataSpecification() {
        return softwareandDataSpecification;
    }
}