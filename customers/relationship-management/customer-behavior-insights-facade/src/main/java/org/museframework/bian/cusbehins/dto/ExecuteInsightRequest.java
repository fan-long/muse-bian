package org.museframework.bian.cusbehins.dto;

public class ExecuteInsightRequest {
    private String customerbehaviorinsightsid;

    private String insightid;

    private org.museframework.bian.cusbehins.dto.bq.Insight insight;

    public void setCustomerbehaviorinsightsid(String customerbehaviorinsightsid) {
        this.customerbehaviorinsightsid = customerbehaviorinsightsid;
    }

    public String getCustomerbehaviorinsightsid() {
        return customerbehaviorinsightsid;
    }

    public void setInsightid(String insightid) {
        this.insightid = insightid;
    }

    public String getInsightid() {
        return insightid;
    }

    public void setInsight(org.museframework.bian.cusbehins.dto.bq.Insight insight) {
        this.insight = insight;
    }

    public org.museframework.bian.cusbehins.dto.bq.Insight getInsight() {
        return insight;
    }
}