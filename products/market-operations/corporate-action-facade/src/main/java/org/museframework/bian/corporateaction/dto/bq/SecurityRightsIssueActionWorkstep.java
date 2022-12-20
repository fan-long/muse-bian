/*A course of action for doing Security Spin-Off Action Workstep in the context of executing the Security Spin-Off Action Workstep*/
package org.museframework.bian.corporateaction.dto.bq;

public class SecurityRightsIssueActionWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String schedule;

    /*The Security Rights Issue Action Workstep specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Security Rights Issue Action Workstep*/
    private org.museframework.bian.classes.Procedure corporateActionProcedureReference;

    /*Reference to Security Rights Issue Action Workstep*/
    private org.museframework.bian.classes.Workstep securityRightsIssueActionWorkstepReference;

    /*The type of Security Rights Issue Action Workstep*/
    private String securityRightsIssueActionWorkstepType;

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

    public void setSecurityRightsIssueActionWorkstepReference(org.museframework.bian.classes.Workstep securityRightsIssueActionWorkstepReference) {
        this.securityRightsIssueActionWorkstepReference = securityRightsIssueActionWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getSecurityRightsIssueActionWorkstepReference() {
        return securityRightsIssueActionWorkstepReference;
    }

    public void setSecurityRightsIssueActionWorkstepType(String securityRightsIssueActionWorkstepType) {
        this.securityRightsIssueActionWorkstepType = securityRightsIssueActionWorkstepType;
    }

    public String getSecurityRightsIssueActionWorkstepType() {
        return securityRightsIssueActionWorkstepType;
    }
}