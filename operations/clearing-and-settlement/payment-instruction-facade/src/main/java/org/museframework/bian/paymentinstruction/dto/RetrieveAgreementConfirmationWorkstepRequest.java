package org.museframework.bian.paymentinstruction.dto;

public class RetrieveAgreementConfirmationWorkstepRequest {
    private String paymentinstructionid;

    private String agreementconfirmationworkstepid;

    public void setPaymentinstructionid(String paymentinstructionid) {
        this.paymentinstructionid = paymentinstructionid;
    }

    public String getPaymentinstructionid() {
        return paymentinstructionid;
    }

    public void setAgreementconfirmationworkstepid(String agreementconfirmationworkstepid) {
        this.agreementconfirmationworkstepid = agreementconfirmationworkstepid;
    }

    public String getAgreementconfirmationworkstepid() {
        return agreementconfirmationworkstepid;
    }
}