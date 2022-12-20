package org.museframework.bian.paymentinstruction.dto;

public class RetrievePaymentInstructionProcedureRequest {
    private String paymentinstructionid;

    public void setPaymentinstructionid(String paymentinstructionid) {
        this.paymentinstructionid = paymentinstructionid;
    }

    public String getPaymentinstructionid() {
        return paymentinstructionid;
    }
}