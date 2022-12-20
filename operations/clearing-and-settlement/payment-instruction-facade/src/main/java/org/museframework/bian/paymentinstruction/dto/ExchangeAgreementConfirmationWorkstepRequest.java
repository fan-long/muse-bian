package org.museframework.bian.paymentinstruction.dto;

public class ExchangeAgreementConfirmationWorkstepRequest {
    private String paymentinstructionid;

    private String agreementconfirmationworkstepid;

    private org.museframework.bian.paymentinstruction.dto.bq.AgreementConfirmationWorkstep agreementConfirmationWorkstep;

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

    public void setAgreementConfirmationWorkstep(org.museframework.bian.paymentinstruction.dto.bq.AgreementConfirmationWorkstep agreementConfirmationWorkstep) {
        this.agreementConfirmationWorkstep = agreementConfirmationWorkstep;
    }

    public org.museframework.bian.paymentinstruction.dto.bq.AgreementConfirmationWorkstep getAgreementConfirmationWorkstep() {
        return agreementConfirmationWorkstep;
    }
}