package org.museframework.bian.paymentinstruction.dto;

public class RetrievePaymentInstructionWorkstepRequest {
    private String paymentinstructionid;

    private String paymentinstructionworkstepid;

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
}