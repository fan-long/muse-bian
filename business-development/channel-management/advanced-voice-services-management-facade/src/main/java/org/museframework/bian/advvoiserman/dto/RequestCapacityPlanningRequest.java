package org.museframework.bian.advvoiserman.dto;

public class RequestCapacityPlanningRequest {
    private String advancedvoiceservicesmanagementid;

    private String capacityplanningid;

    private org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning capacityPlanning;

    public void setAdvancedvoiceservicesmanagementid(String advancedvoiceservicesmanagementid) {
        this.advancedvoiceservicesmanagementid = advancedvoiceservicesmanagementid;
    }

    public String getAdvancedvoiceservicesmanagementid() {
        return advancedvoiceservicesmanagementid;
    }

    public void setCapacityplanningid(String capacityplanningid) {
        this.capacityplanningid = capacityplanningid;
    }

    public String getCapacityplanningid() {
        return capacityplanningid;
    }

    public void setCapacityPlanning(org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning capacityPlanning) {
        this.capacityPlanning = capacityPlanning;
    }

    public org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning getCapacityPlanning() {
        return capacityPlanning;
    }
}