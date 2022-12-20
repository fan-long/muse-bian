package org.museframework.bian.paymentinstruction.dto;

public class ExecuteComplianceCheckWorkstepRequest {
    private String paymentinstructionid;

    private String compliancecheckworkstepid;

    private org.museframework.bian.paymentinstruction.dto.bq.ComplianceCheckWorkstep complianceCheckWorkstep;

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

    public void setComplianceCheckWorkstep(org.museframework.bian.paymentinstruction.dto.bq.ComplianceCheckWorkstep complianceCheckWorkstep) {
        this.complianceCheckWorkstep = complianceCheckWorkstep;
    }

    public org.museframework.bian.paymentinstruction.dto.bq.ComplianceCheckWorkstep getComplianceCheckWorkstep() {
        return complianceCheckWorkstep;
    }
}