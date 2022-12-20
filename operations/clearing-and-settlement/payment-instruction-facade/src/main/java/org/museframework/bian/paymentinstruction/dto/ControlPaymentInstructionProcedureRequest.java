package org.museframework.bian.paymentinstruction.dto;

public class ControlPaymentInstructionProcedureRequest {
    private String paymentinstructionid;

    private org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure paymentInstructionProcedure;

    public void setPaymentinstructionid(String paymentinstructionid) {
        this.paymentinstructionid = paymentinstructionid;
    }

    public String getPaymentinstructionid() {
        return paymentinstructionid;
    }

    public void setPaymentInstructionProcedure(org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure paymentInstructionProcedure) {
        this.paymentInstructionProcedure = paymentInstructionProcedure;
    }

    public org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure getPaymentInstructionProcedure() {
        return paymentInstructionProcedure;
    }
}