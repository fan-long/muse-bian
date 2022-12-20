/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Branch Location Management.
Example: Manage the day to day activities at a bank branch location.*/
package org.museframework.bian.bralocman.dto.bq;

public class StaffandLocationPlanning {
    /*The required status/situation before the duty/obligation can be met*/
    private String staffandLocationPlanningPreconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    private org.museframework.bian.classes.Object staffandLocationPlanningBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    private String staffandLocationPlanningWorkSchedule;

    /*The Branch Location Management Plan specific Business Service*/
    private org.museframework.bian.classes.BusinessService staffandLocationPlanning;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    private String staffandLocationPlanningPostconditions;

    /*Reference to the specific business service type*/
    private String staffandLocationPlanningStaffandLocationPlanningServiceType;

    /*Description of the performed business service*/
    private String staffandLocationPlanningStaffandLocationPlanningServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String staffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String staffandLocationPlanningStaffandLocationPlanningServiceWorkProduct;

    /**/
    private String staffandLocationPlanningStaffandLocationPlanningServiceName;

    public void setStaffandLocationPlanningPreconditions(String staffandLocationPlanningPreconditions) {
        this.staffandLocationPlanningPreconditions = staffandLocationPlanningPreconditions;
    }

    public String getStaffandLocationPlanningPreconditions() {
        return staffandLocationPlanningPreconditions;
    }

    public void setStaffandLocationPlanningBusinessUnitEmployeeReference(org.museframework.bian.classes.Object staffandLocationPlanningBusinessUnitEmployeeReference) {
        this.staffandLocationPlanningBusinessUnitEmployeeReference = staffandLocationPlanningBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getStaffandLocationPlanningBusinessUnitEmployeeReference() {
        return staffandLocationPlanningBusinessUnitEmployeeReference;
    }

    public void setStaffandLocationPlanningWorkSchedule(String staffandLocationPlanningWorkSchedule) {
        this.staffandLocationPlanningWorkSchedule = staffandLocationPlanningWorkSchedule;
    }

    public String getStaffandLocationPlanningWorkSchedule() {
        return staffandLocationPlanningWorkSchedule;
    }

    public void setStaffandLocationPlanning(org.museframework.bian.classes.BusinessService staffandLocationPlanning) {
        this.staffandLocationPlanning = staffandLocationPlanning;
    }

    public org.museframework.bian.classes.BusinessService getStaffandLocationPlanning() {
        return staffandLocationPlanning;
    }

    public void setStaffandLocationPlanningPostconditions(String staffandLocationPlanningPostconditions) {
        this.staffandLocationPlanningPostconditions = staffandLocationPlanningPostconditions;
    }

    public String getStaffandLocationPlanningPostconditions() {
        return staffandLocationPlanningPostconditions;
    }

    public void setStaffandLocationPlanningStaffandLocationPlanningServiceType(String staffandLocationPlanningStaffandLocationPlanningServiceType) {
        this.staffandLocationPlanningStaffandLocationPlanningServiceType = staffandLocationPlanningStaffandLocationPlanningServiceType;
    }

    public String getStaffandLocationPlanningStaffandLocationPlanningServiceType() {
        return staffandLocationPlanningStaffandLocationPlanningServiceType;
    }

    public void setStaffandLocationPlanningStaffandLocationPlanningServiceDescription(String staffandLocationPlanningStaffandLocationPlanningServiceDescription) {
        this.staffandLocationPlanningStaffandLocationPlanningServiceDescription = staffandLocationPlanningStaffandLocationPlanningServiceDescription;
    }

    public String getStaffandLocationPlanningStaffandLocationPlanningServiceDescription() {
        return staffandLocationPlanningStaffandLocationPlanningServiceDescription;
    }

    public void setStaffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs(String staffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs) {
        this.staffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs = staffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs;
    }

    public String getStaffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs() {
        return staffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs;
    }

    public void setStaffandLocationPlanningStaffandLocationPlanningServiceWorkProduct(String staffandLocationPlanningStaffandLocationPlanningServiceWorkProduct) {
        this.staffandLocationPlanningStaffandLocationPlanningServiceWorkProduct = staffandLocationPlanningStaffandLocationPlanningServiceWorkProduct;
    }

    public String getStaffandLocationPlanningStaffandLocationPlanningServiceWorkProduct() {
        return staffandLocationPlanningStaffandLocationPlanningServiceWorkProduct;
    }

    public void setStaffandLocationPlanningStaffandLocationPlanningServiceName(String staffandLocationPlanningStaffandLocationPlanningServiceName) {
        this.staffandLocationPlanningStaffandLocationPlanningServiceName = staffandLocationPlanningStaffandLocationPlanningServiceName;
    }

    public String getStaffandLocationPlanningStaffandLocationPlanningServiceName() {
        return staffandLocationPlanningStaffandLocationPlanningServiceName;
    }
}