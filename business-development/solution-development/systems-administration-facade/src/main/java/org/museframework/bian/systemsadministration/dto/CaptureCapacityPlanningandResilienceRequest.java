package org.museframework.bian.systemsadministration.dto;

public class CaptureCapacityPlanningandResilienceRequest {
    private String systemsadministrationid;

    private String capacityplanningandresilienceid;

    private org.museframework.bian.systemsadministration.dto.bq.CapacityPlanningandResilience capacityPlanningandResilience;

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

    public void setCapacityPlanningandResilience(org.museframework.bian.systemsadministration.dto.bq.CapacityPlanningandResilience capacityPlanningandResilience) {
        this.capacityPlanningandResilience = capacityPlanningandResilience;
    }

    public org.museframework.bian.systemsadministration.dto.bq.CapacityPlanningandResilience getCapacityPlanningandResilience() {
        return capacityPlanningandResilience;
    }
}