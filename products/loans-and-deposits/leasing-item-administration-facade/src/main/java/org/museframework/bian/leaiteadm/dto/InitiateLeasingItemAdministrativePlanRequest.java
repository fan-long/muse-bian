package org.museframework.bian.leaiteadm.dto;

public class InitiateLeasingItemAdministrativePlanRequest {
    private org.museframework.bian.leaiteadm.dto.cr.LeasingItemAdministrativePlan leasingItemAdministrativePlan;

    public void setLeasingItemAdministrativePlan(org.museframework.bian.leaiteadm.dto.cr.LeasingItemAdministrativePlan leasingItemAdministrativePlan) {
        this.leasingItemAdministrativePlan = leasingItemAdministrativePlan;
    }

    public org.museframework.bian.leaiteadm.dto.cr.LeasingItemAdministrativePlan getLeasingItemAdministrativePlan() {
        return leasingItemAdministrativePlan;
    }
}