package org.museframework.bian.paymentinstruction.dto;

public class ExecutePaymentInstructionWorkstepResponse {
    private org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep paymentInstructionWorkstep;

    public void setPaymentInstructionWorkstep(org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep paymentInstructionWorkstep) {
        this.paymentInstructionWorkstep = paymentInstructionWorkstep;
    }

    public org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep getPaymentInstructionWorkstep() {
        return paymentInstructionWorkstep;
    }
}