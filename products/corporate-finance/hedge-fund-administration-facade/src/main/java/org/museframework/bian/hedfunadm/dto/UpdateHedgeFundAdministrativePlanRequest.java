package org.museframework.bian.hedfunadm.dto;

public class UpdateHedgeFundAdministrativePlanRequest {
    private String hedgefundadministrationid;

    private org.museframework.bian.hedfunadm.dto.cr.HedgeFundAdministrativePlan hedgeFundAdministrativePlan;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setHedgeFundAdministrativePlan(org.museframework.bian.hedfunadm.dto.cr.HedgeFundAdministrativePlan hedgeFundAdministrativePlan) {
        this.hedgeFundAdministrativePlan = hedgeFundAdministrativePlan;
    }

    public org.museframework.bian.hedfunadm.dto.cr.HedgeFundAdministrativePlan getHedgeFundAdministrativePlan() {
        return hedgeFundAdministrativePlan;
    }
}