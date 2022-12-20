package org.museframework.bian.paymentinstruction.dto;

public class NotifyPaymentInstructionWorkstepResponse {
    private org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep paymentInstructionWorkstep;

    public void setPaymentInstructionWorkstep(org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep paymentInstructionWorkstep) {
        this.paymentInstructionWorkstep = paymentInstructionWorkstep;
    }

    public org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep getPaymentInstructionWorkstep() {
        return paymentInstructionWorkstep;
    }
}