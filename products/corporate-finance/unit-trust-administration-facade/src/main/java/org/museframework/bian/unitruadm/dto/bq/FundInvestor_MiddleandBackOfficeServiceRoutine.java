/*The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine*/
package org.museframework.bian.unitruadm.dto.bq;

public class FundInvestor_MiddleandBackOfficeServiceRoutine {
    /*The required status/situation before the routine can be undertaken*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for performing the routine*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    private String schedule;

    /*The Fund Investor, Middle and Back Office Service Routine specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Fund Investor, Middle and Back Office Service Routine*/
    private org.museframework.bian.classes.Plan unitTrustAdministrativePlanReference;

    /*Reference to Fund Investor, Middle and Back Office Service Routine*/
    private org.museframework.bian.classes.PlannedAction fundInvestor_MiddleandBackOfficeServiceRoutineReference;

    /*The type of Fund Investor, Middle and Back Office Service Routine*/
    private String fundInvestor_MiddleandBackOfficeServiceRoutineType;

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

    public void setUnitTrustAdministrativePlanReference(org.museframework.bian.classes.Plan unitTrustAdministrativePlanReference) {
        this.unitTrustAdministrativePlanReference = unitTrustAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Plan getUnitTrustAdministrativePlanReference() {
        return unitTrustAdministrativePlanReference;
    }

    public void setFundInvestor_MiddleandBackOfficeServiceRoutineReference(org.museframework.bian.classes.PlannedAction fundInvestor_MiddleandBackOfficeServiceRoutineReference) {
        this.fundInvestor_MiddleandBackOfficeServiceRoutineReference = fundInvestor_MiddleandBackOfficeServiceRoutineReference;
    }

    public org.museframework.bian.classes.PlannedAction getFundInvestor_MiddleandBackOfficeServiceRoutineReference() {
        return fundInvestor_MiddleandBackOfficeServiceRoutineReference;
    }

    public void setFundInvestor_MiddleandBackOfficeServiceRoutineType(String fundInvestor_MiddleandBackOfficeServiceRoutineType) {
        this.fundInvestor_MiddleandBackOfficeServiceRoutineType = fundInvestor_MiddleandBackOfficeServiceRoutineType;
    }

    public String getFundInvestor_MiddleandBackOfficeServiceRoutineType() {
        return fundInvestor_MiddleandBackOfficeServiceRoutineType;
    }
}