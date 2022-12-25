/*The Staff Availability Tracking Routine is an activity that is performed as one aspect of carrying out the Staff Availability Tracking Routine*/
package org.museframework.bian.prosalsup.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class StaffAvailabilityTrackingRoutine {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(0)
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField(0)
    private String schedule;

    /*The Staff Availability Tracking Routine specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Staff Availability Tracking Routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan productSalesSupportAdministrativePlanReference;

    /*Reference to Staff Availability Tracking Routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PlannedAction staffAvailabilityTrackingRoutineReference;

    /*The type of Staff Availability Tracking Routine*/
    @MetaField(0)
    private String staffAvailabilityTrackingRoutineType;

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

    public void setProductSalesSupportAdministrativePlanReference(org.museframework.bian.classes.Plan productSalesSupportAdministrativePlanReference) {
        this.productSalesSupportAdministrativePlanReference = productSalesSupportAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Plan getProductSalesSupportAdministrativePlanReference() {
        return productSalesSupportAdministrativePlanReference;
    }

    public void setStaffAvailabilityTrackingRoutineReference(org.museframework.bian.classes.PlannedAction staffAvailabilityTrackingRoutineReference) {
        this.staffAvailabilityTrackingRoutineReference = staffAvailabilityTrackingRoutineReference;
    }

    public org.museframework.bian.classes.PlannedAction getStaffAvailabilityTrackingRoutineReference() {
        return staffAvailabilityTrackingRoutineReference;
    }

    public void setStaffAvailabilityTrackingRoutineType(String staffAvailabilityTrackingRoutineType) {
        this.staffAvailabilityTrackingRoutineType = staffAvailabilityTrackingRoutineType;
    }

    public String getStaffAvailabilityTrackingRoutineType() {
        return staffAvailabilityTrackingRoutineType;
    }
}