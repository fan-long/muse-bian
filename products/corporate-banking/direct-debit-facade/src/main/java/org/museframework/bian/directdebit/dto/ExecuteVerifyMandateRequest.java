package org.museframework.bian.directdebit.dto;

public class ExecuteVerifyMandateRequest {
    private String directdebitid;

    private String verifymandateid;

    private org.museframework.bian.directdebit.dto.bq.VerifyMandate verifyMandate;

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

    public void setVerifyMandate(org.museframework.bian.directdebit.dto.bq.VerifyMandate verifyMandate) {
        this.verifyMandate = verifyMandate;
    }

    public org.museframework.bian.directdebit.dto.bq.VerifyMandate getVerifyMandate() {
        return verifyMandate;
    }
}