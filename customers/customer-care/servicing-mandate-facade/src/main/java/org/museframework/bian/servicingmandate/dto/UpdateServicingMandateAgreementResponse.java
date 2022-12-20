package org.museframework.bian.servicingmandate.dto;

public class UpdateServicingMandateAgreementResponse {
    private org.museframework.bian.servicingmandate.dto.cr.ServicingMandateAgreement servicingMandateAgreement;

    public void setServicingMandateAgreement(org.museframework.bian.servicingmandate.dto.cr.ServicingMandateAgreement servicingMandateAgreement) {
        this.servicingMandateAgreement = servicingMandateAgreement;
    }

    public org.museframework.bian.servicingmandate.dto.cr.ServicingMandateAgreement getServicingMandateAgreement() {
        return servicingMandateAgreement;
    }
}