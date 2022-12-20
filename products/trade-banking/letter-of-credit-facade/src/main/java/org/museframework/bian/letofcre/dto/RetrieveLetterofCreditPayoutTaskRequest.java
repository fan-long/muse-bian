package org.museframework.bian.letofcre.dto;

public class RetrieveLetterofCreditPayoutTaskRequest {
    private String letterofcreditid;

    private String letterofcreditpayouttaskid;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setLetterofcreditpayouttaskid(String letterofcreditpayouttaskid) {
        this.letterofcreditpayouttaskid = letterofcreditpayouttaskid;
    }

    public String getLetterofcreditpayouttaskid() {
        return letterofcreditpayouttaskid;
    }
}