package org.museframework.bian.leaiteadm.dto;

public class RetrieveAssuranceRequest {
    private String leasingitemadministrationid;

    private String assuranceid;

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
}