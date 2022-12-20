package org.museframework.bian.advvoiserman.dto;

public class RequestCapacityPlanningResponse {
    private org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning capacityPlanning;

    public void setCapacityPlanning(org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning capacityPlanning) {
        this.capacityPlanning = capacityPlanning;
    }

    public org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning getCapacityPlanning() {
        return capacityPlanning;
    }
}