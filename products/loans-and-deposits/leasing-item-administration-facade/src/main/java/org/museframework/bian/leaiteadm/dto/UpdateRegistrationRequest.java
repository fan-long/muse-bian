package org.museframework.bian.leaiteadm.dto;

public class UpdateRegistrationRequest {
    private String leasingitemadministrationid;

    private String registrationid;

    private org.museframework.bian.leaiteadm.dto.bq.Registration registration;

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

    public void setRegistration(org.museframework.bian.leaiteadm.dto.bq.Registration registration) {
        this.registration = registration;
    }

    public org.museframework.bian.leaiteadm.dto.bq.Registration getRegistration() {
        return registration;
    }
}