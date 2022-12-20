package org.museframework.bian.servicingmandate.dto;

public class UpdateServicingMandateAgreementRequest {
    private String servicingmandateid;

    private org.museframework.bian.servicingmandate.dto.cr.ServicingMandateAgreement servicingMandateAgreement;

    public void setServicingmandateid(String servicingmandateid) {
        this.servicingmandateid = servicingmandateid;
    }

    public String getServicingmandateid() {
        return servicingmandateid;
    }

    public void setServicingMandateAgreement(org.museframework.bian.servicingmandate.dto.cr.ServicingMandateAgreement servicingMandateAgreement) {
        this.servicingMandateAgreement = servicingMandateAgreement;
    }

    public org.museframework.bian.servicingmandate.dto.cr.ServicingMandateAgreement getServicingMandateAgreement() {
        return servicingMandateAgreement;
    }
}