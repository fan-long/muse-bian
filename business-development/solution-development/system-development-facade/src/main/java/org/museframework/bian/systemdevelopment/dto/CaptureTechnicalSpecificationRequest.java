package org.museframework.bian.systemdevelopment.dto;

public class CaptureTechnicalSpecificationRequest {
    private String systemdevelopmentid;

    private String technicalspecificationid;

    private org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification technicalSpecification;

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

    public void setTechnicalSpecification(org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification technicalSpecification) {
        this.technicalSpecification = technicalSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification getTechnicalSpecification() {
        return technicalSpecification;
    }
}