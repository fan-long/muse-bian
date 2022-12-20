package org.museframework.bian.advvoiserman.dto;

public class RetrieveCapacityPlanningRequest {
    private String advancedvoiceservicesmanagementid;

    private String capacityplanningid;

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
}