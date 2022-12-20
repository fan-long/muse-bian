/*A course of action for doing Securities Fail Determination Workstep in the context of executing the Securities Fail Determination Workstep*/
package org.museframework.bian.secfaipro.dto.bq;

public class SecuritiesFailDeterminationWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String schedule;

    /*The Securities Fail Determination Workstep specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Securities Fail Determination Workstep*/
    private org.museframework.bian.classes.Procedure securityTradingFailsProcedureReference;

    /*Reference to Securities Fail Determination Workstep*/
    private org.museframework.bian.classes.Workstep securitiesFailDeterminationWorkstepReference;

    /*The type of Securities Fail Determination Workstep*/
    private String securitiesFailDeterminationWorkstepType;

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

    public void setSecurityTradingFailsProcedureReference(org.museframework.bian.classes.Procedure securityTradingFailsProcedureReference) {
        this.securityTradingFailsProcedureReference = securityTradingFailsProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getSecurityTradingFailsProcedureReference() {
        return securityTradingFailsProcedureReference;
    }

    public void setSecuritiesFailDeterminationWorkstepReference(org.museframework.bian.classes.Workstep securitiesFailDeterminationWorkstepReference) {
        this.securitiesFailDeterminationWorkstepReference = securitiesFailDeterminationWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getSecuritiesFailDeterminationWorkstepReference() {
        return securitiesFailDeterminationWorkstepReference;
    }

    public void setSecuritiesFailDeterminationWorkstepType(String securitiesFailDeterminationWorkstepType) {
        this.securitiesFailDeterminationWorkstepType = securitiesFailDeterminationWorkstepType;
    }

    public String getSecuritiesFailDeterminationWorkstepType() {
        return securitiesFailDeterminationWorkstepType;
    }
}