package org.museframework.bian.concenman.dto;

public class UpdateContactCenterManagementPlanRequest {
    private String contactcentermanagementid;

    private org.museframework.bian.concenman.dto.cr.ContactCenterManagementPlan contactCenterManagementPlan;

    public void setContactcentermanagementid(String contactcentermanagementid) {
        this.contactcentermanagementid = contactcentermanagementid;
    }

    public String getContactcentermanagementid() {
        return contactcentermanagementid;
    }

    public void setContactCenterManagementPlan(org.museframework.bian.concenman.dto.cr.ContactCenterManagementPlan contactCenterManagementPlan) {
        this.contactCenterManagementPlan = contactCenterManagementPlan;
    }

    public org.museframework.bian.concenman.dto.cr.ContactCenterManagementPlan getContactCenterManagementPlan() {
        return contactCenterManagementPlan;
    }
}