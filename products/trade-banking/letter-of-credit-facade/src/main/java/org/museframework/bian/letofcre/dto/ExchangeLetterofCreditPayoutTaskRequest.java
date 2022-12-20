package org.museframework.bian.letofcre.dto;

public class ExchangeLetterofCreditPayoutTaskRequest {
    private String letterofcreditid;

    private String letterofcreditpayouttaskid;

    private org.museframework.bian.letofcre.dto.bq.LetterofCreditPayoutTask letterofCreditPayoutTask;

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

    public void setLetterofCreditPayoutTask(org.museframework.bian.letofcre.dto.bq.LetterofCreditPayoutTask letterofCreditPayoutTask) {
        this.letterofCreditPayoutTask = letterofCreditPayoutTask;
    }

    public org.museframework.bian.letofcre.dto.bq.LetterofCreditPayoutTask getLetterofCreditPayoutTask() {
        return letterofCreditPayoutTask;
    }
}