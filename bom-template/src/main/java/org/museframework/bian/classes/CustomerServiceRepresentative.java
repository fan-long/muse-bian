/*Customer service representatives interact with customers on behalf of an organization. They provide information about products and services, take orders, respond to customer complaints, and process returns. Many customer service representatives work in customer contact centers.
*/
package org.museframework.bian.classes;

public class CustomerServiceRepresentative {
    /*Details the qualification, expertise and level of experience of the servicing representative.*/
    private String qualificationProfile;

    /*Reference to the locations the customer servicing representative can work from (can include remote working arrangements and time zone availability)*/
    private String location;

    /*Details the time the customer servicing representative plans to be and is actually available for assignments which covers times for shift working and temporary/overtime assignments as may be necessary*/
    private String availabilitySchedule;

    /*Tracks the current status indicating availability for assignment to a servicing position (where  the representative will coordinate with contact routing for customer contacts.*/
    private String status;

    public void setQualificationProfile(String qualificationProfile) {
        this.qualificationProfile = qualificationProfile;
    }

    public String getQualificationProfile() {
        return qualificationProfile;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setAvailabilitySchedule(String availabilitySchedule) {
        this.availabilitySchedule = availabilitySchedule;
    }

    public String getAvailabilitySchedule() {
        return availabilitySchedule;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}