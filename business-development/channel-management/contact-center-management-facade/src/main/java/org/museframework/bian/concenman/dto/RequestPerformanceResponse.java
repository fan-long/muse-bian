package org.museframework.bian.concenman.dto;

public class RequestPerformanceResponse {
    private org.museframework.bian.concenman.dto.bq.Performance performance;

    public void setPerformance(org.museframework.bian.concenman.dto.bq.Performance performance) {
        this.performance = performance;
    }

    public org.museframework.bian.concenman.dto.bq.Performance getPerformance() {
        return performance;
    }
}