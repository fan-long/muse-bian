package org.museframework.bian.intpropor.dto;

public class UpdateIntellectualPropertyAdministrativePlanRequest {
    private String intellectualpropertyportfolioid;

    private org.museframework.bian.intpropor.dto.cr.IntellectualPropertyAdministrativePlan intellectualPropertyAdministrativePlan;

    public void setIntellectualpropertyportfolioid(String intellectualpropertyportfolioid) {
        this.intellectualpropertyportfolioid = intellectualpropertyportfolioid;
    }

    public String getIntellectualpropertyportfolioid() {
        return intellectualpropertyportfolioid;
    }

    public void setIntellectualPropertyAdministrativePlan(org.museframework.bian.intpropor.dto.cr.IntellectualPropertyAdministrativePlan intellectualPropertyAdministrativePlan) {
        this.intellectualPropertyAdministrativePlan = intellectualPropertyAdministrativePlan;
    }

    public org.museframework.bian.intpropor.dto.cr.IntellectualPropertyAdministrativePlan getIntellectualPropertyAdministrativePlan() {
        return intellectualPropertyAdministrativePlan;
    }
}