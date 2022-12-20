package org.museframework.bian.mutfunadm.dto;

public class ControlMutualFundAdministrativePlanRequest {
    private String mutualfundadministrationid;

    private org.museframework.bian.mutfunadm.dto.cr.MutualFundAdministrativePlan mutualFundAdministrativePlan;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setMutualFundAdministrativePlan(org.museframework.bian.mutfunadm.dto.cr.MutualFundAdministrativePlan mutualFundAdministrativePlan) {
        this.mutualFundAdministrativePlan = mutualFundAdministrativePlan;
    }

    public org.museframework.bian.mutfunadm.dto.cr.MutualFundAdministrativePlan getMutualFundAdministrativePlan() {
        return mutualFundAdministrativePlan;
    }
}