/*The Non-cash Inventory Handling is an activity that is performed as one aspect of carrying out the Branch Location Administration Plan
*/
package org.museframework.bian.bralocope.dto.bq;

public class WorkforceAdministration {
    /*The required status/situation before the routine can be undertaken*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for performing the routine*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    private String schedule;

    /*The <BQ> specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to the Branch Location Administrative Plan*/
    private org.museframework.bian.classes.Plan branchLocationAdministrativePlanReference;

    /*Reference to the Workforce Administration*/
    private org.museframework.bian.classes.PlannedAction workforceAdministrationReference;

    /*The type of Workforce Administration*/
    private String workforceAdministrationType;

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

    public void setBranchLocationAdministrativePlanReference(org.museframework.bian.classes.Plan branchLocationAdministrativePlanReference) {
        this.branchLocationAdministrativePlanReference = branchLocationAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Plan getBranchLocationAdministrativePlanReference() {
        return branchLocationAdministrativePlanReference;
    }

    public void setWorkforceAdministrationReference(org.museframework.bian.classes.PlannedAction workforceAdministrationReference) {
        this.workforceAdministrationReference = workforceAdministrationReference;
    }

    public org.museframework.bian.classes.PlannedAction getWorkforceAdministrationReference() {
        return workforceAdministrationReference;
    }

    public void setWorkforceAdministrationType(String workforceAdministrationType) {
        this.workforceAdministrationType = workforceAdministrationType;
    }

    public String getWorkforceAdministrationType() {
        return workforceAdministrationType;
    }
}