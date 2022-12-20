package org.museframework.bian.systemsadministration.dto;

public class CaptureAssuranceResponse {
    private org.museframework.bian.systemsadministration.dto.bq.Assurance assurance;

    public void setAssurance(org.museframework.bian.systemsadministration.dto.bq.Assurance assurance) {
        this.assurance = assurance;
    }

    public org.museframework.bian.systemsadministration.dto.bq.Assurance getAssurance() {
        return assurance;
    }
}