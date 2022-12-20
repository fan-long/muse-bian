package org.museframework.bian.ebranchmanagement.dto;

public class UpdateCapacityPlanningResponse {
    private org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning capacityPlanning;

    public void setCapacityPlanning(org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning capacityPlanning) {
        this.capacityPlanning = capacityPlanning;
    }

    public org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning getCapacityPlanning() {
        return capacityPlanning;
    }
}