package org.museframework.bian.paymentinstruction.dto;

public class RetrieveAgreementConfirmationWorkstepResponse {
    private org.museframework.bian.paymentinstruction.dto.bq.AgreementConfirmationWorkstep agreementConfirmationWorkstep;

    public void setAgreementConfirmationWorkstep(org.museframework.bian.paymentinstruction.dto.bq.AgreementConfirmationWorkstep agreementConfirmationWorkstep) {
        this.agreementConfirmationWorkstep = agreementConfirmationWorkstep;
    }

    public org.museframework.bian.paymentinstruction.dto.bq.AgreementConfirmationWorkstep getAgreementConfirmationWorkstep() {
        return agreementConfirmationWorkstep;
    }
}