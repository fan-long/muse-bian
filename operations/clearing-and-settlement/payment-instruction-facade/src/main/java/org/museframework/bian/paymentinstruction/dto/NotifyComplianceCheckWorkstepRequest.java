package org.museframework.bian.paymentinstruction.dto;

public class NotifyComplianceCheckWorkstepRequest {
    private String paymentinstructionid;

    private String compliancecheckworkstepid;

    public void setPaymentinstructionid(String paymentinstructionid) {
        this.paymentinstructionid = paymentinstructionid;
    }

    public String getPaymentinstructionid() {
        return paymentinstructionid;
    }

    public void setCompliancecheckworkstepid(String compliancecheckworkstepid) {
        this.compliancecheckworkstepid = compliancecheckworkstepid;
    }

    public String getCompliancecheckworkstepid() {
        return compliancecheckworkstepid;
    }
}