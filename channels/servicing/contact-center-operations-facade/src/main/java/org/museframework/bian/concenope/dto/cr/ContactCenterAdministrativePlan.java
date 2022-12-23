/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Contact Center Operations. 
*/
package org.museframework.bian.concenope.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ContactCenterAdministrativePlan extends org.museframework.bian.classes.ContactCenterAdministrativePlan {
    /*The default contact center operational configuration as defined by Contact Center Management (Note this can include some latitude for position assignment changes to be made during day to day operations by this service domain)*/
    @MetaField
    private String contactCenterServiceOperatingConfiguration;

    /*Maintains the allocation records of available customer service representatives to the servicing positions defined in the contact center configuration. This includes past and future booking arrangements*/
    @MetaField
    private String customerServicingRepresentativeAllocationSchedule;

    /*Reference to a customer servicing representative*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerServicingRepresentativeReference;

    /*Details about a registered customer servicing representative*/
    @MetaField
    private String customerServicingRepresentativeRecord;

    /*Details the qualification, expertise and level of experience of the servicing representative*/
    @MetaField
    private String customerServicingRepresentativeQualificationProfile;

    /*Reference to the locations the customer servicing representative can work from (can include remote working arrangements and time zone availability)*/
    @MetaField
    private String customerServicingRepresentativeLocation;

    /*Details the time the customer servicing representative plans to be and is actually available for assignments which covers times for shift working and temporary/overtime assignments as may be necessary*/
    @MetaField
    private String customerServicingRepresentativeAvailabilitySchedule;

    /*Tracks the current status indicating availability for assignment to a servicing position (where  the representative will coordinate with contact routing for customer contacts)*/
    @MetaField
    private String customerServicingRepresentativeStatus;

    /*Reference to a consolidated record of assignments. This is used to track utilization and performance*/
    @MetaField
    private String customerServicingRepresentativeAssignmentRecord;

    public void setContactCenterServiceOperatingConfiguration(String contactCenterServiceOperatingConfiguration) {
        this.contactCenterServiceOperatingConfiguration = contactCenterServiceOperatingConfiguration;
    }

    public String getContactCenterServiceOperatingConfiguration() {
        return contactCenterServiceOperatingConfiguration;
    }

    public void setCustomerServicingRepresentativeAllocationSchedule(String customerServicingRepresentativeAllocationSchedule) {
        this.customerServicingRepresentativeAllocationSchedule = customerServicingRepresentativeAllocationSchedule;
    }

    public String getCustomerServicingRepresentativeAllocationSchedule() {
        return customerServicingRepresentativeAllocationSchedule;
    }

    public void setCustomerServicingRepresentativeReference(org.museframework.bian.classes.Object customerServicingRepresentativeReference) {
        this.customerServicingRepresentativeReference = customerServicingRepresentativeReference;
    }

    public org.museframework.bian.classes.Object getCustomerServicingRepresentativeReference() {
        return customerServicingRepresentativeReference;
    }

    public void setCustomerServicingRepresentativeRecord(String customerServicingRepresentativeRecord) {
        this.customerServicingRepresentativeRecord = customerServicingRepresentativeRecord;
    }

    public String getCustomerServicingRepresentativeRecord() {
        return customerServicingRepresentativeRecord;
    }

    public void setCustomerServicingRepresentativeQualificationProfile(String customerServicingRepresentativeQualificationProfile) {
        this.customerServicingRepresentativeQualificationProfile = customerServicingRepresentativeQualificationProfile;
    }

    public String getCustomerServicingRepresentativeQualificationProfile() {
        return customerServicingRepresentativeQualificationProfile;
    }

    public void setCustomerServicingRepresentativeLocation(String customerServicingRepresentativeLocation) {
        this.customerServicingRepresentativeLocation = customerServicingRepresentativeLocation;
    }

    public String getCustomerServicingRepresentativeLocation() {
        return customerServicingRepresentativeLocation;
    }

    public void setCustomerServicingRepresentativeAvailabilitySchedule(String customerServicingRepresentativeAvailabilitySchedule) {
        this.customerServicingRepresentativeAvailabilitySchedule = customerServicingRepresentativeAvailabilitySchedule;
    }

    public String getCustomerServicingRepresentativeAvailabilitySchedule() {
        return customerServicingRepresentativeAvailabilitySchedule;
    }

    public void setCustomerServicingRepresentativeStatus(String customerServicingRepresentativeStatus) {
        this.customerServicingRepresentativeStatus = customerServicingRepresentativeStatus;
    }

    public String getCustomerServicingRepresentativeStatus() {
        return customerServicingRepresentativeStatus;
    }

    public void setCustomerServicingRepresentativeAssignmentRecord(String customerServicingRepresentativeAssignmentRecord) {
        this.customerServicingRepresentativeAssignmentRecord = customerServicingRepresentativeAssignmentRecord;
    }

    public String getCustomerServicingRepresentativeAssignmentRecord() {
        return customerServicingRepresentativeAssignmentRecord;
    }
}