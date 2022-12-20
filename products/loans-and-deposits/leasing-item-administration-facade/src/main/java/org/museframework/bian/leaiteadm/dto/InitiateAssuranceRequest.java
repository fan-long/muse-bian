package org.museframework.bian.leaiteadm.dto;

public class InitiateAssuranceRequest {
    private String leasingitemadministrationid;

    private String assuranceid;

    private org.museframework.bian.leaiteadm.dto.bq.Assurance assurance;

    public void setLeasingitemadministrationid(String leasingitemadministrationid) {
        this.leasingitemadministrationid = leasingitemadministrationid;
    }

    public String getLeasingitemadministrationid() {
        return leasingitemadministrationid;
    }

    public void setAssuranceid(String assuranceid) {
        this.assuranceid = assuranceid;
    }

    public String getAssuranceid() {
        return assuranceid;
    }

    public void setAssurance(org.museframework.bian.leaiteadm.dto.bq.Assurance assurance) {
        this.assurance = assurance;
    }

    public org.museframework.bian.leaiteadm.dto.bq.Assurance getAssurance() {
        return assurance;
    }
}