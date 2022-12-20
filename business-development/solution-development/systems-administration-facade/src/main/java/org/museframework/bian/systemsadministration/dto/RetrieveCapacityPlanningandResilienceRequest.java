package org.museframework.bian.systemsadministration.dto;

public class RetrieveCapacityPlanningandResilienceRequest {
    private String systemsadministrationid;

    private String capacityplanningandresilienceid;

    public void setSystemsadministrationid(String systemsadministrationid) {
        this.systemsadministrationid = systemsadministrationid;
    }

    public String getSystemsadministrationid() {
        return systemsadministrationid;
    }

    public void setCapacityplanningandresilienceid(String capacityplanningandresilienceid) {
        this.capacityplanningandresilienceid = capacityplanningandresilienceid;
    }

    public String getCapacityplanningandresilienceid() {
        return capacityplanningandresilienceid;
    }
}