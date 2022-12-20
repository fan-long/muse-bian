/*A course of action for doing Apply Order Allocation Rules Workstep in the context of executing the Apply Order Allocation Rules Workstep*/
package org.museframework.bian.orderallocation.dto.bq;

public class ApplyOrderAllocationRulesWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String schedule;

    /*The Apply Order Allocation Rules Workstep specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Apply Order Allocation Rules Workstep*/
    private org.museframework.bian.classes.Procedure securitiesAllocationProcedureReference;

    /*Reference to Apply Order Allocation Rules Workstep*/
    private org.museframework.bian.classes.Workstep applyOrderAllocationRulesWorkstepReference;

    /*The type of Apply Order Allocation Rules Workstep*/
    private String applyOrderAllocationRulesWorkstepType;

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

    public void setSecuritiesAllocationProcedureReference(org.museframework.bian.classes.Procedure securitiesAllocationProcedureReference) {
        this.securitiesAllocationProcedureReference = securitiesAllocationProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getSecuritiesAllocationProcedureReference() {
        return securitiesAllocationProcedureReference;
    }

    public void setApplyOrderAllocationRulesWorkstepReference(org.museframework.bian.classes.Workstep applyOrderAllocationRulesWorkstepReference) {
        this.applyOrderAllocationRulesWorkstepReference = applyOrderAllocationRulesWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getApplyOrderAllocationRulesWorkstepReference() {
        return applyOrderAllocationRulesWorkstepReference;
    }

    public void setApplyOrderAllocationRulesWorkstepType(String applyOrderAllocationRulesWorkstepType) {
        this.applyOrderAllocationRulesWorkstepType = applyOrderAllocationRulesWorkstepType;
    }

    public String getApplyOrderAllocationRulesWorkstepType() {
        return applyOrderAllocationRulesWorkstepType;
    }
}