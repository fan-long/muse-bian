package org.museframework.bian.systemsadministration.dto;

public class GrantITSystemAdministrativePlanRequest {
    private String systemsadministrationid;

    private org.museframework.bian.systemsadministration.dto.cr.ITSystemAdministrativePlan iTSystemAdministrativePlan;

    public void setSystemsadministrationid(String systemsadministrationid) {
        this.systemsadministrationid = systemsadministrationid;
    }

    public String getSystemsadministrationid() {
        return systemsadministrationid;
    }

    public void setiTSystemAdministrativePlan(org.museframework.bian.systemsadministration.dto.cr.ITSystemAdministrativePlan iTSystemAdministrativePlan) {
        this.iTSystemAdministrativePlan = iTSystemAdministrativePlan;
    }

    public org.museframework.bian.systemsadministration.dto.cr.ITSystemAdministrativePlan getiTSystemAdministrativePlan() {
        return iTSystemAdministrativePlan;
    }
}