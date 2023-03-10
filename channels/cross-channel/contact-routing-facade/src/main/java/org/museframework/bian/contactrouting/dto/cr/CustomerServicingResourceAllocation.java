/*Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Contact Routing. 
Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.*/
package org.museframework.bian.contactrouting.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerServicingResourceAllocation {
    /*Maintains the allocation status of available service resources. Can include future booking commitments*/
    @MetaField(0)
    private String servicingResourceAllocationServiceSchedule;

    /*Reference to a servicing resource*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object servicingResourceReference;

    /*Details about a registered servicing resource/specialist*/
    @MetaField(0)
    private String servicingResourceRecord;

    /*Details the qualification, expertise and level of experience of a servicing specialist*/
    @MetaField(0)
    private String servicingResourceQualificationProfile;

    /*Reference to the assigned servicing position for the resource for the current session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object servicingPositionReference;

    /*Details the time the resource plans to be and is actually available for allocations*/
    @MetaField(0)
    private String servicingResourceAvailabilitySchedule;

    /*Tracks the current status indicating availability for assignment*/
    @MetaField(0)
    private String servicingResourceStatus;

    /*Reference to a servicing session assignments made*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object servicingSessionReference;

    public void setServicingResourceAllocationServiceSchedule(String servicingResourceAllocationServiceSchedule) {
        this.servicingResourceAllocationServiceSchedule = servicingResourceAllocationServiceSchedule;
    }

    public String getServicingResourceAllocationServiceSchedule() {
        return servicingResourceAllocationServiceSchedule;
    }

    public void setServicingResourceReference(org.museframework.bian.classes.Object servicingResourceReference) {
        this.servicingResourceReference = servicingResourceReference;
    }

    public org.museframework.bian.classes.Object getServicingResourceReference() {
        return servicingResourceReference;
    }

    public void setServicingResourceRecord(String servicingResourceRecord) {
        this.servicingResourceRecord = servicingResourceRecord;
    }

    public String getServicingResourceRecord() {
        return servicingResourceRecord;
    }

    public void setServicingResourceQualificationProfile(String servicingResourceQualificationProfile) {
        this.servicingResourceQualificationProfile = servicingResourceQualificationProfile;
    }

    public String getServicingResourceQualificationProfile() {
        return servicingResourceQualificationProfile;
    }

    public void setServicingPositionReference(org.museframework.bian.classes.Object servicingPositionReference) {
        this.servicingPositionReference = servicingPositionReference;
    }

    public org.museframework.bian.classes.Object getServicingPositionReference() {
        return servicingPositionReference;
    }

    public void setServicingResourceAvailabilitySchedule(String servicingResourceAvailabilitySchedule) {
        this.servicingResourceAvailabilitySchedule = servicingResourceAvailabilitySchedule;
    }

    public String getServicingResourceAvailabilitySchedule() {
        return servicingResourceAvailabilitySchedule;
    }

    public void setServicingResourceStatus(String servicingResourceStatus) {
        this.servicingResourceStatus = servicingResourceStatus;
    }

    public String getServicingResourceStatus() {
        return servicingResourceStatus;
    }

    public void setServicingSessionReference(org.museframework.bian.classes.Object servicingSessionReference) {
        this.servicingSessionReference = servicingSessionReference;
    }

    public org.museframework.bian.classes.Object getServicingSessionReference() {
        return servicingSessionReference;
    }
}