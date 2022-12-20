package org.museframework.bian.accountrecovery.dto;

public class UpdatePlanningResponse {
    private org.museframework.bian.accountrecovery.dto.bq.Planning planning;

    public void setPlanning(org.museframework.bian.accountrecovery.dto.bq.Planning planning) {
        this.planning = planning;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Planning getPlanning() {
        return planning;
    }
}