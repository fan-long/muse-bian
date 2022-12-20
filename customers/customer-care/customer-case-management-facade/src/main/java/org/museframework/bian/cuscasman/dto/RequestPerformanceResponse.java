package org.museframework.bian.cuscasman.dto;

public class RequestPerformanceResponse {
    private org.museframework.bian.cuscasman.dto.bq.Performance performance;

    public void setPerformance(org.museframework.bian.cuscasman.dto.bq.Performance performance) {
        this.performance = performance;
    }

    public org.museframework.bian.cuscasman.dto.bq.Performance getPerformance() {
        return performance;
    }
}