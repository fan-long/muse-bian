package org.museframework.bian.systemdevelopment.dto;

public class UpdateFunctionalSpecificationRequest {
    private String systemdevelopmentid;

    private String functionalspecificationid;

    private org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification functionalSpecification;

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

    public void setFunctionalSpecification(org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification functionalSpecification) {
        this.functionalSpecification = functionalSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification getFunctionalSpecification() {
        return functionalSpecification;
    }
}