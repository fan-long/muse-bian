package org.museframework.bian.dirdebman.dto;

public class RetrieveMandateRegistrationResponse {
    private org.museframework.bian.dirdebman.dto.bq.MandateRegistration mandateRegistration;

    public void setMandateRegistration(org.museframework.bian.dirdebman.dto.bq.MandateRegistration mandateRegistration) {
        this.mandateRegistration = mandateRegistration;
    }

    public org.museframework.bian.dirdebman.dto.bq.MandateRegistration getMandateRegistration() {
        return mandateRegistration;
    }
}