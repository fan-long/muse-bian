package org.museframework.bian.corporatefinance.dto;

public class UpdateCapitalStructuringTopicResponse {
    private org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic capitalStructuringTopic;

    public void setCapitalStructuringTopic(org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic capitalStructuringTopic) {
        this.capitalStructuringTopic = capitalStructuringTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic getCapitalStructuringTopic() {
        return capitalStructuringTopic;
    }
}