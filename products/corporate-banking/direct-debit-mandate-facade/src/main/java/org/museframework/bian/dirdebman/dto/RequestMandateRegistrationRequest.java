package org.museframework.bian.dirdebman.dto;

public class RequestMandateRegistrationRequest {
    private String directdebitmandateid;

    private String mandateregistrationid;

    private org.museframework.bian.dirdebman.dto.bq.MandateRegistration mandateRegistration;

    public void setDirectdebitmandateid(String directdebitmandateid) {
        this.directdebitmandateid = directdebitmandateid;
    }

    public String getDirectdebitmandateid() {
        return directdebitmandateid;
    }

    public void setMandateregistrationid(String mandateregistrationid) {
        this.mandateregistrationid = mandateregistrationid;
    }

    public String getMandateregistrationid() {
        return mandateregistrationid;
    }

    public void setMandateRegistration(org.museframework.bian.dirdebman.dto.bq.MandateRegistration mandateRegistration) {
        this.mandateRegistration = mandateRegistration;
    }

    public org.museframework.bian.dirdebman.dto.bq.MandateRegistration getMandateRegistration() {
        return mandateRegistration;
    }
}