/*A course of action for doing Payment Instruction Workstep in the context of executing the Payment Instruction Workstep*/
package org.museframework.bian.paymentinstruction.dto.bq;

public class PaymentInstructionWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String schedule;

    /*The Payment Instruction Workstep specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Payment Instruction Workstep*/
    private org.museframework.bian.classes.Procedure paymentInstructionProcedureReference;

    /*Reference to Payment Instruction Workstep*/
    private org.museframework.bian.classes.Workstep paymentInstructionWorkstepReference;

    /*The type of Payment Instruction Workstep*/
    private String paymentInstructionWorkstepType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public String getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setPaymentInstructionProcedureReference(org.museframework.bian.classes.Procedure paymentInstructionProcedureReference) {
        this.paymentInstructionProcedureReference = paymentInstructionProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getPaymentInstructionProcedureReference() {
        return paymentInstructionProcedureReference;
    }

    public void setPaymentInstructionWorkstepReference(org.museframework.bian.classes.Workstep paymentInstructionWorkstepReference) {
        this.paymentInstructionWorkstepReference = paymentInstructionWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getPaymentInstructionWorkstepReference() {
        return paymentInstructionWorkstepReference;
    }

    public void setPaymentInstructionWorkstepType(String paymentInstructionWorkstepType) {
        this.paymentInstructionWorkstepType = paymentInstructionWorkstepType;
    }

    public String getPaymentInstructionWorkstepType() {
        return paymentInstructionWorkstepType;
    }
}