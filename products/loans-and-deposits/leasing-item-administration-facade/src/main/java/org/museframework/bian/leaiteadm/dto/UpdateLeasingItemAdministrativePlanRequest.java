package org.museframework.bian.leaiteadm.dto;

public class UpdateLeasingItemAdministrativePlanRequest {
    private String leasingitemadministrationid;

    private org.museframework.bian.leaiteadm.dto.cr.LeasingItemAdministrativePlan leasingItemAdministrativePlan;

    public void setLeasingitemadministrationid(String leasingitemadministrationid) {
        this.leasingitemadministrationid = leasingitemadministrationid;
    }

    public String getLeasingitemadministrationid() {
        return leasingitemadministrationid;
    }

    public void setLeasingItemAdministrativePlan(org.museframework.bian.leaiteadm.dto.cr.LeasingItemAdministrativePlan leasingItemAdministrativePlan) {
        this.leasingItemAdministrativePlan = leasingItemAdministrativePlan;
    }

    public org.museframework.bian.leaiteadm.dto.cr.LeasingItemAdministrativePlan getLeasingItemAdministrativePlan() {
        return leasingItemAdministrativePlan;
    }
}