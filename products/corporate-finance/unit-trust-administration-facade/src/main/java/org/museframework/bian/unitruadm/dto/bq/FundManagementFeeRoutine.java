/*The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine*/
package org.museframework.bian.unitruadm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FundManagementFeeRoutine {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(0)
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField(0)
    private String schedule;

    /*The Fund Management Fee Routine specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Fund Management Fee Routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan unitTrustAdministrativePlanReference;

    /*Reference to Fund Management Fee Routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PlannedAction fundManagementFeeRoutineReference;

    /*The type of Fund Management Fee Routine*/
    @MetaField(0)
    private String fundManagementFeeRoutineType;

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

    public void setFundManagementFeeRoutineReference(org.museframework.bian.classes.PlannedAction fundManagementFeeRoutineReference) {
        this.fundManagementFeeRoutineReference = fundManagementFeeRoutineReference;
    }

    public org.museframework.bian.classes.PlannedAction getFundManagementFeeRoutineReference() {
        return fundManagementFeeRoutineReference;
    }

    public void setFundManagementFeeRoutineType(String fundManagementFeeRoutineType) {
        this.fundManagementFeeRoutineType = fundManagementFeeRoutineType;
    }

    public String getFundManagementFeeRoutineType() {
        return fundManagementFeeRoutineType;
    }
}