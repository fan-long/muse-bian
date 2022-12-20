/*The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine*/
package org.museframework.bian.mutfunadm.dto.bq;

public class FundInflowsandOutflowRoutine {
    /*The required status/situation before the routine can be undertaken*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for performing the routine*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    private String schedule;

    /*The Fund Inflows and Outflow Routine specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Fund Inflows and Outflow Routine*/
    private org.museframework.bian.classes.Plan mutualFundAdministrativePlanReference;

    /*Reference to Fund Inflows and Outflow Routine*/
    private org.museframework.bian.classes.PlannedAction fundInflowsandOutflowRoutineReference;

    /*The type of Fund Inflows and Outflow Routine*/
    private String fundInflowsandOutflowRoutineType;

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

    public void setMutualFundAdministrativePlanReference(org.museframework.bian.classes.Plan mutualFundAdministrativePlanReference) {
        this.mutualFundAdministrativePlanReference = mutualFundAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Plan getMutualFundAdministrativePlanReference() {
        return mutualFundAdministrativePlanReference;
    }

    public void setFundInflowsandOutflowRoutineReference(org.museframework.bian.classes.PlannedAction fundInflowsandOutflowRoutineReference) {
        this.fundInflowsandOutflowRoutineReference = fundInflowsandOutflowRoutineReference;
    }

    public org.museframework.bian.classes.PlannedAction getFundInflowsandOutflowRoutineReference() {
        return fundInflowsandOutflowRoutineReference;
    }

    public void setFundInflowsandOutflowRoutineType(String fundInflowsandOutflowRoutineType) {
        this.fundInflowsandOutflowRoutineType = fundInflowsandOutflowRoutineType;
    }

    public String getFundInflowsandOutflowRoutineType() {
        return fundInflowsandOutflowRoutineType;
    }
}