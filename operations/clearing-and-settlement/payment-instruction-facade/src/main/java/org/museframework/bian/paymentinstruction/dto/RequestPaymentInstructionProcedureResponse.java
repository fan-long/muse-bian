package org.museframework.bian.paymentinstruction.dto;

public class RequestPaymentInstructionProcedureResponse {
    private org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure paymentInstructionProcedure;

    public void setPaymentInstructionProcedure(org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure paymentInstructionProcedure) {
        this.paymentInstructionProcedure = paymentInstructionProcedure;
    }

    public org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure getPaymentInstructionProcedure() {
        return paymentInstructionProcedure;
    }
}