package org.museframework.bian.cusbehins.dto;

public class RetrieveInsightRequest {
    private String customerbehaviorinsightsid;

    private String insightid;

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
}