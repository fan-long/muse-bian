package org.museframework.bian.dirdebman.dto;

public class RetrieveMandateRegistrationRequest {
    private String directdebitmandateid;

    private String mandateregistrationid;

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
}