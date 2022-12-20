package org.museframework.bian.paymentinstruction.dto;

public class ExchangePaymentInstructionWorkstepRequest {
    private String paymentinstructionid;

    private String paymentinstructionworkstepid;

    private org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep paymentInstructionWorkstep;

    public void setPaymentinstructionid(String paymentinstructionid) {
        this.paymentinstructionid = paymentinstructionid;
    }

    public String getPaymentinstructionid() {
        return paymentinstructionid;
    }

    public void setPaymentinstructionworkstepid(String paymentinstructionworkstepid) {
        this.paymentinstructionworkstepid = paymentinstructionworkstepid;
    }

    public String getPaymentinstructionworkstepid() {
        return paymentinstructionworkstepid;
    }

    public void setPaymentInstructionWorkstep(org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep paymentInstructionWorkstep) {
        this.paymentInstructionWorkstep = paymentInstructionWorkstep;
    }

    public org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep getPaymentInstructionWorkstep() {
        return paymentInstructionWorkstep;
    }
}