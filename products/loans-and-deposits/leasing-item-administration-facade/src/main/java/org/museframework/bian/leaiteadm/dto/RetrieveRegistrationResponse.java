package org.museframework.bian.leaiteadm.dto;

public class RetrieveRegistrationResponse {
    private org.museframework.bian.leaiteadm.dto.bq.Registration registration;

    public void setRegistration(org.museframework.bian.leaiteadm.dto.bq.Registration registration) {
        this.registration = registration;
    }

    public org.museframework.bian.leaiteadm.dto.bq.Registration getRegistration() {
        return registration;
    }
}