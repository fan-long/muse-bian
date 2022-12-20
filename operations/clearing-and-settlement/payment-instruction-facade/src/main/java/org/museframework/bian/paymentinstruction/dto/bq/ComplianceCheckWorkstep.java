/*A course of action for doing Payment Instruction Workstep in the context of executing the Payment Instruction Workstep*/
package org.museframework.bian.paymentinstruction.dto.bq;

public class ComplianceCheckWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String schedule;

    /*The Compliance Check Workstep specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Compliance Check Workstep*/
    private org.museframework.bian.classes.Procedure paymentInstructionProcedureReference;

    /*Reference to Compliance Check Workstep*/
    private org.museframework.bian.classes.Workstep complianceCheckWorkstepReference;

    /*The type of Compliance Check Workstep*/
    private String complianceCheckWorkstepType;

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

    public void setComplianceCheckWorkstepReference(org.museframework.bian.classes.Workstep complianceCheckWorkstepReference) {
        this.complianceCheckWorkstepReference = complianceCheckWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getComplianceCheckWorkstepReference() {
        return complianceCheckWorkstepReference;
    }

    public void setComplianceCheckWorkstepType(String complianceCheckWorkstepType) {
        this.complianceCheckWorkstepType = complianceCheckWorkstepType;
    }

    public String getComplianceCheckWorkstepType() {
        return complianceCheckWorkstepType;
    }
}