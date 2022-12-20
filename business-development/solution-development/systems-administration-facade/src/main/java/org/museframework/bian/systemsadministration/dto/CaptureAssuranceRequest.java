package org.museframework.bian.systemsadministration.dto;

public class CaptureAssuranceRequest {
    private String systemsadministrationid;

    private String assuranceid;

    private org.museframework.bian.systemsadministration.dto.bq.Assurance assurance;

    public void setSystemsadministrationid(String systemsadministrationid) {
        this.systemsadministrationid = systemsadministrationid;
    }

    public String getSystemsadministrationid() {
        return systemsadministrationid;
    }

    public void setAssuranceid(String assuranceid) {
        this.assuranceid = assuranceid;
    }

    public String getAssuranceid() {
        return assuranceid;
    }

    public void setAssurance(org.museframework.bian.systemsadministration.dto.bq.Assurance assurance) {
        this.assurance = assurance;
    }

    public org.museframework.bian.systemsadministration.dto.bq.Assurance getAssurance() {
        return assurance;
    }
}