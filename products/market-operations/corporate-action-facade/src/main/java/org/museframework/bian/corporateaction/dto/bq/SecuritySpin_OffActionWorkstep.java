/*A course of action for doing Security Spin-Off Action Workstep in the context of executing the Security Spin-Off Action Workstep*/
package org.museframework.bian.corporateaction.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SecuritySpin_OffActionWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(0)
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField(0)
    private String schedule;

    /*The Security Spin-Off Action Workstep specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Security Spin-Off Action Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure corporateActionProcedureReference;

    /*Reference to Security Spin-Off Action Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Workstep securitySpin_OffActionWorkstepReference;

    /*The type of Security Spin-Off Action Workstep*/
    @MetaField(0)
    private String securitySpin_OffActionWorkstepType;

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

    public void setCorporateActionProcedureReference(org.museframework.bian.classes.Procedure corporateActionProcedureReference) {
        this.corporateActionProcedureReference = corporateActionProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getCorporateActionProcedureReference() {
        return corporateActionProcedureReference;
    }

    public void setSecuritySpin_OffActionWorkstepReference(org.museframework.bian.classes.Workstep securitySpin_OffActionWorkstepReference) {
        this.securitySpin_OffActionWorkstepReference = securitySpin_OffActionWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getSecuritySpin_OffActionWorkstepReference() {
        return securitySpin_OffActionWorkstepReference;
    }

    public void setSecuritySpin_OffActionWorkstepType(String securitySpin_OffActionWorkstepType) {
        this.securitySpin_OffActionWorkstepType = securitySpin_OffActionWorkstepType;
    }

    public String getSecuritySpin_OffActionWorkstepType() {
        return securitySpin_OffActionWorkstepType;
    }
}