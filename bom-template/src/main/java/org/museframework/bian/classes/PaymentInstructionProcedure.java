/*A procedure to handle the initial assembly and verification of payment instructions that may be requested by third party payment service providers and/or bank customers that access external payment services.*/
package org.museframework.bian.classes;

public class PaymentInstructionProcedure {
    /**/
    private Workstep paymentInstructionProcedureWorkstep;

    /**/
    private org.museframework.bian.enumerations.Paymentinstructionprocedureworksteptypevalues paymentInstructionProcedureWorkstepType;

    public void setPaymentInstructionProcedureWorkstep(Workstep paymentInstructionProcedureWorkstep) {
        this.paymentInstructionProcedureWorkstep = paymentInstructionProcedureWorkstep;
    }

    public Workstep getPaymentInstructionProcedureWorkstep() {
        return paymentInstructionProcedureWorkstep;
    }

    public void setPaymentInstructionProcedureWorkstepType(org.museframework.bian.enumerations.Paymentinstructionprocedureworksteptypevalues paymentInstructionProcedureWorkstepType) {
        this.paymentInstructionProcedureWorkstepType = paymentInstructionProcedureWorkstepType;
    }

    public org.museframework.bian.enumerations.Paymentinstructionprocedureworksteptypevalues getPaymentInstructionProcedureWorkstepType() {
        return paymentInstructionProcedureWorkstepType;
    }
}