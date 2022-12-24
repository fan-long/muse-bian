/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Product Expert Sales Support. 
*/
package org.museframework.bian.proexpsalsup.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.SalesSpecialistSupportAdministrativePlan
@MetaDto
public class SalesSpecialistSupportAdministrativePlan {
    /*Maintains the allocation records of available sales specialist service resources. This includes all past and future booking commitments*/
    @MetaField
    private String salesSpecialistSupportResourceAllocationServiceSchedule;

    /*Reference to a sales specialist support resource*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object salesSpecialistSupportResourceReference;

    /*Details about a registered sales specialist support resource*/
    @MetaField
    private String salesSpecialistSupportResourceRecord;

    /*Details the qualification, expertise and level of experience of a servicing specialist*/
    @MetaField
    private String salesSpecialistSupportResourceQualificationProfile;

    /*Reference to the locations service by the resource where face to face meetings are required*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object salesSpecialistSupportLocationReference;

    /*Details the time the resource plans to be and is actually available for assignments*/
    @MetaField
    private String salesSpecialistSupportResourceAvailabilitySchedule;

    /*Tracks the current status indicating availability for assignment*/
    @MetaField
    private String salesSpecialistSupportResourceStatus;

    /*Reference to a consolidated record of assignment instances handled by the support resource. This is used to track utilization and performance*/
    @MetaField
    private String salesSpecialistSupportResourceAssignmentRecord;

    public void setSalesSpecialistSupportResourceAllocationServiceSchedule(String salesSpecialistSupportResourceAllocationServiceSchedule) {
        this.salesSpecialistSupportResourceAllocationServiceSchedule = salesSpecialistSupportResourceAllocationServiceSchedule;
    }

    public String getSalesSpecialistSupportResourceAllocationServiceSchedule() {
        return salesSpecialistSupportResourceAllocationServiceSchedule;
    }

    public void setSalesSpecialistSupportResourceReference(org.museframework.bian.classes.Object salesSpecialistSupportResourceReference) {
        this.salesSpecialistSupportResourceReference = salesSpecialistSupportResourceReference;
    }

    public org.museframework.bian.classes.Object getSalesSpecialistSupportResourceReference() {
        return salesSpecialistSupportResourceReference;
    }

    public void setSalesSpecialistSupportResourceRecord(String salesSpecialistSupportResourceRecord) {
        this.salesSpecialistSupportResourceRecord = salesSpecialistSupportResourceRecord;
    }

    public String getSalesSpecialistSupportResourceRecord() {
        return salesSpecialistSupportResourceRecord;
    }

    public void setSalesSpecialistSupportResourceQualificationProfile(String salesSpecialistSupportResourceQualificationProfile) {
        this.salesSpecialistSupportResourceQualificationProfile = salesSpecialistSupportResourceQualificationProfile;
    }

    public String getSalesSpecialistSupportResourceQualificationProfile() {
        return salesSpecialistSupportResourceQualificationProfile;
    }

    public void setSalesSpecialistSupportLocationReference(org.museframework.bian.classes.Object salesSpecialistSupportLocationReference) {
        this.salesSpecialistSupportLocationReference = salesSpecialistSupportLocationReference;
    }

    public org.museframework.bian.classes.Object getSalesSpecialistSupportLocationReference() {
        return salesSpecialistSupportLocationReference;
    }

    public void setSalesSpecialistSupportResourceAvailabilitySchedule(String salesSpecialistSupportResourceAvailabilitySchedule) {
        this.salesSpecialistSupportResourceAvailabilitySchedule = salesSpecialistSupportResourceAvailabilitySchedule;
    }

    public String getSalesSpecialistSupportResourceAvailabilitySchedule() {
        return salesSpecialistSupportResourceAvailabilitySchedule;
    }

    public void setSalesSpecialistSupportResourceStatus(String salesSpecialistSupportResourceStatus) {
        this.salesSpecialistSupportResourceStatus = salesSpecialistSupportResourceStatus;
    }

    public String getSalesSpecialistSupportResourceStatus() {
        return salesSpecialistSupportResourceStatus;
    }

    public void setSalesSpecialistSupportResourceAssignmentRecord(String salesSpecialistSupportResourceAssignmentRecord) {
        this.salesSpecialistSupportResourceAssignmentRecord = salesSpecialistSupportResourceAssignmentRecord;
    }

    public String getSalesSpecialistSupportResourceAssignmentRecord() {
        return salesSpecialistSupportResourceAssignmentRecord;
    }
}