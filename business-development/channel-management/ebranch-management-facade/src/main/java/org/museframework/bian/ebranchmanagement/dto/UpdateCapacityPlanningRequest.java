package org.museframework.bian.ebranchmanagement.dto;

public class UpdateCapacityPlanningRequest {
    private String ebranchmanagementid;

    private String capacityplanningid;

    private org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning capacityPlanning;

    public void setEbranchmanagementid(String ebranchmanagementid) {
        this.ebranchmanagementid = ebranchmanagementid;
    }

    public String getEbranchmanagementid() {
        return ebranchmanagementid;
    }

    public void setCapacityplanningid(String capacityplanningid) {
        this.capacityplanningid = capacityplanningid;
    }

    public String getCapacityplanningid() {
        return capacityplanningid;
    }

    public void setCapacityPlanning(org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning capacityPlanning) {
        this.capacityPlanning = capacityPlanning;
    }

    public org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning getCapacityPlanning() {
        return capacityPlanning;
    }
}