package org.museframework.bian.letofcre.dto;

public class RequestSellerObligationConfirmationTaskRequest {
    private String letterofcreditid;

    private String sellerobligationconfirmationtaskid;

    private org.museframework.bian.letofcre.dto.bq.SellerObligationConfirmationTask sellerObligationConfirmationTask;

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

    public void setSellerObligationConfirmationTask(org.museframework.bian.letofcre.dto.bq.SellerObligationConfirmationTask sellerObligationConfirmationTask) {
        this.sellerObligationConfirmationTask = sellerObligationConfirmationTask;
    }

    public org.museframework.bian.letofcre.dto.bq.SellerObligationConfirmationTask getSellerObligationConfirmationTask() {
        return sellerObligationConfirmationTask;
    }
}