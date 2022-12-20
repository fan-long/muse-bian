/*The Fund Inflows and Outflow Routine is an activity that is performed as one aspect of carrying out the Fund Inflows and Outflow Routine*/
package org.museframework.bian.hedfunadm.dto.bq;

public class FundTaxAdministrationRoutine {
    /*The required status/situation before the routine can be undertaken*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for performing the routine*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    private String schedule;

    /*The Fund Tax Administration Routine specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Fund Tax Administration Routine*/
    private org.museframework.bian.classes.Plan hedgeFundAdministrativePlanReference;

    /*Reference to Fund Tax Administration Routine*/
    private org.museframework.bian.classes.PlannedAction fundTaxAdministrationRoutineReference;

    /*The type of Fund Tax Administration Routine*/
    private String fundTaxAdministrationRoutineType;

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

    public void setHedgeFundAdministrativePlanReference(org.museframework.bian.classes.Plan hedgeFundAdministrativePlanReference) {
        this.hedgeFundAdministrativePlanReference = hedgeFundAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Plan getHedgeFundAdministrativePlanReference() {
        return hedgeFundAdministrativePlanReference;
    }

    public void setFundTaxAdministrationRoutineReference(org.museframework.bian.classes.PlannedAction fundTaxAdministrationRoutineReference) {
        this.fundTaxAdministrationRoutineReference = fundTaxAdministrationRoutineReference;
    }

    public org.museframework.bian.classes.PlannedAction getFundTaxAdministrationRoutineReference() {
        return fundTaxAdministrationRoutineReference;
    }

    public void setFundTaxAdministrationRoutineType(String fundTaxAdministrationRoutineType) {
        this.fundTaxAdministrationRoutineType = fundTaxAdministrationRoutineType;
    }

    public String getFundTaxAdministrationRoutineType() {
        return fundTaxAdministrationRoutineType;
    }
}