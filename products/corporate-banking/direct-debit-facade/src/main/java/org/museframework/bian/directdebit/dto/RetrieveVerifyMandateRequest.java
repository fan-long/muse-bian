package org.museframework.bian.directdebit.dto;

public class RetrieveVerifyMandateRequest {
    private String directdebitid;

    private String verifymandateid;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setVerifymandateid(String verifymandateid) {
        this.verifymandateid = verifymandateid;
    }

    public String getVerifymandateid() {
        return verifymandateid;
    }
}