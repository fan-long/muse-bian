package org.museframework.bian.letofcre.dto;

public class NotifySellerObligationConfirmationTaskRequest {
    private String letterofcreditid;

    private String sellerobligationconfirmationtaskid;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setSellerobligationconfirmationtaskid(String sellerobligationconfirmationtaskid) {
        this.sellerobligationconfirmationtaskid = sellerobligationconfirmationtaskid;
    }

    public String getSellerobligationconfirmationtaskid() {
        return sellerobligationconfirmationtaskid;
    }
}