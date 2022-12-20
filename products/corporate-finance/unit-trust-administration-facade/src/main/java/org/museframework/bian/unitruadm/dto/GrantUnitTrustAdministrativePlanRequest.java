package org.museframework.bian.unitruadm.dto;

public class GrantUnitTrustAdministrativePlanRequest {
    private String unittrustadministrationid;

    private org.museframework.bian.unitruadm.dto.cr.UnitTrustAdministrativePlan unitTrustAdministrativePlan;

    public void setUnittrustadministrationid(String unittrustadministrationid) {
        this.unittrustadministrationid = unittrustadministrationid;
    }

    public String getUnittrustadministrationid() {
        return unittrustadministrationid;
    }

    public void setUnitTrustAdministrativePlan(org.museframework.bian.unitruadm.dto.cr.UnitTrustAdministrativePlan unitTrustAdministrativePlan) {
        this.unitTrustAdministrativePlan = unitTrustAdministrativePlan;
    }

    public org.museframework.bian.unitruadm.dto.cr.UnitTrustAdministrativePlan getUnitTrustAdministrativePlan() {
        return unitTrustAdministrativePlan;
    }
}