/*The Non-cash Inventory Handling is an activity that is performed as one aspect of carrying out the Branch Location Administration Plan
*/
package org.museframework.bian.bralocope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SafeCustodyOperations {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(0)
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField(0)
    private String schedule;

    /*The <BQ> specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to the Branch Location Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan branchLocationAdministrativePlanReference;

    /*Reference to the Safe Custody Operations*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PlannedAction safeCustodyOperationsReference;

    /*The type of Safe Custody Operations*/
    @MetaField(0)
    private String safeCustodyOperationsType;

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

    public void setSafeCustodyOperationsReference(org.museframework.bian.classes.PlannedAction safeCustodyOperationsReference) {
        this.safeCustodyOperationsReference = safeCustodyOperationsReference;
    }

    public org.museframework.bian.classes.PlannedAction getSafeCustodyOperationsReference() {
        return safeCustodyOperationsReference;
    }

    public void setSafeCustodyOperationsType(String safeCustodyOperationsType) {
        this.safeCustodyOperationsType = safeCustodyOperationsType;
    }

    public String getSafeCustodyOperationsType() {
        return safeCustodyOperationsType;
    }
}