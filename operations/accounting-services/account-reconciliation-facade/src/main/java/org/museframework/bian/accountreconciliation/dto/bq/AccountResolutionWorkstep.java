/*A course of action for doing Account Resolution Workstep in the context of executing the Account Resolution Workstep*/
package org.museframework.bian.accountreconciliation.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AccountResolutionWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(0)
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField(0)
    private String schedule;

    /*The Account Resolution Workstep specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Account Resolution Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure accountReconciliationProcedureReference;

    /*Reference to Account Resolution Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Workstep accountResolutionWorkstepReference;

    /*The type of Account Resolution Workstep*/
    @MetaField(0)
    private String accountResolutionWorkstepType;

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

    public void setAccountReconciliationProcedureReference(org.museframework.bian.classes.Procedure accountReconciliationProcedureReference) {
        this.accountReconciliationProcedureReference = accountReconciliationProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getAccountReconciliationProcedureReference() {
        return accountReconciliationProcedureReference;
    }

    public void setAccountResolutionWorkstepReference(org.museframework.bian.classes.Workstep accountResolutionWorkstepReference) {
        this.accountResolutionWorkstepReference = accountResolutionWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getAccountResolutionWorkstepReference() {
        return accountResolutionWorkstepReference;
    }

    public void setAccountResolutionWorkstepType(String accountResolutionWorkstepType) {
        this.accountResolutionWorkstepType = accountResolutionWorkstepType;
    }

    public String getAccountResolutionWorkstepType() {
        return accountResolutionWorkstepType;
    }
}