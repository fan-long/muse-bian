/*The Fund Inflows and Outflow Routine is an activity that is performed as one aspect of carrying out the Fund Inflows and Outflow Routine*/
package org.museframework.bian.hedfunadm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FundDevelopmentRoutine {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(0)
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField(0)
    private String schedule;

    /*The Fund Development Routine specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Fund Development Routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan hedgeFundAdministrativePlanReference;

    /*Reference to Fund Development Routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PlannedAction fundDevelopmentRoutineReference;

    /*The type of Fund Development Routine*/
    @MetaField(0)
    private String fundDevelopmentRoutineType;

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

    public void setFundDevelopmentRoutineReference(org.museframework.bian.classes.PlannedAction fundDevelopmentRoutineReference) {
        this.fundDevelopmentRoutineReference = fundDevelopmentRoutineReference;
    }

    public org.museframework.bian.classes.PlannedAction getFundDevelopmentRoutineReference() {
        return fundDevelopmentRoutineReference;
    }

    public void setFundDevelopmentRoutineType(String fundDevelopmentRoutineType) {
        this.fundDevelopmentRoutineType = fundDevelopmentRoutineType;
    }

    public String getFundDevelopmentRoutineType() {
        return fundDevelopmentRoutineType;
    }
}