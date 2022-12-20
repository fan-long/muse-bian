package org.museframework.bian.bracurdis.dto;

public class ExchangeDistributionPlanningResponse {
    private org.museframework.bian.bracurdis.dto.bq.DistributionPlanning distributionPlanning;

    public void setDistributionPlanning(org.museframework.bian.bracurdis.dto.bq.DistributionPlanning distributionPlanning) {
        this.distributionPlanning = distributionPlanning;
    }

    public org.museframework.bian.bracurdis.dto.bq.DistributionPlanning getDistributionPlanning() {
        return distributionPlanning;
    }
}