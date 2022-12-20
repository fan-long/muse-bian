package org.museframework.bian.leaiteadm.dto;

public class RetrieveRegistrationRequest {
    private String leasingitemadministrationid;

    private String registrationid;

    public void setLeasingitemadministrationid(String leasingitemadministrationid) {
        this.leasingitemadministrationid = leasingitemadministrationid;
    }

    public String getLeasingitemadministrationid() {
        return leasingitemadministrationid;
    }

    public void setRegistrationid(String registrationid) {
        this.registrationid = registrationid;
    }

    public String getRegistrationid() {
        return registrationid;
    }
}