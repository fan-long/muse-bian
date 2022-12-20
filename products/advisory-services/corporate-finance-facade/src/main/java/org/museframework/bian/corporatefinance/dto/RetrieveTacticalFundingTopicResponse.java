package org.museframework.bian.corporatefinance.dto;

public class RetrieveTacticalFundingTopicResponse {
    private org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic tacticalFundingTopic;

    public void setTacticalFundingTopic(org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic tacticalFundingTopic) {
        this.tacticalFundingTopic = tacticalFundingTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic getTacticalFundingTopic() {
        return tacticalFundingTopic;
    }
}