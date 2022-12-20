package org.museframework.bian.busuniman.dto;

public class UpdatePerformanceResponse {
    private org.museframework.bian.busuniman.dto.bq.Performance performance;

    public void setPerformance(org.museframework.bian.busuniman.dto.bq.Performance performance) {
        this.performance = performance;
    }

    public org.museframework.bian.busuniman.dto.bq.Performance getPerformance() {
        return performance;
    }
}