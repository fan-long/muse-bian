package org.museframework.bian.cusbehins.dto;

public class RequestInsightResponse {
    private org.museframework.bian.cusbehins.dto.bq.Insight insight;

    public void setInsight(org.museframework.bian.cusbehins.dto.bq.Insight insight) {
        this.insight = insight;
    }

    public org.museframework.bian.cusbehins.dto.bq.Insight getInsight() {
        return insight;
    }
}