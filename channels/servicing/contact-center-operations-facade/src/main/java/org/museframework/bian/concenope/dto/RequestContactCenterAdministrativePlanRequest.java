package org.museframework.bian.concenope.dto;

public class RequestContactCenterAdministrativePlanRequest {
    private String contactcenteroperationsid;

    private org.museframework.bian.concenope.dto.cr.ContactCenterAdministrativePlan contactCenterAdministrativePlan;

    public void setContactcenteroperationsid(String contactcenteroperationsid) {
        this.contactcenteroperationsid = contactcenteroperationsid;
    }

    public String getContactcenteroperationsid() {
        return contactcenteroperationsid;
    }

    public void setContactCenterAdministrativePlan(org.museframework.bian.concenope.dto.cr.ContactCenterAdministrativePlan contactCenterAdministrativePlan) {
        this.contactCenterAdministrativePlan = contactCenterAdministrativePlan;
    }

    public org.museframework.bian.concenope.dto.cr.ContactCenterAdministrativePlan getContactCenterAdministrativePlan() {
        return contactCenterAdministrativePlan;
    }
}