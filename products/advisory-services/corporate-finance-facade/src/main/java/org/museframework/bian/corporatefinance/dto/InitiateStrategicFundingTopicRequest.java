package org.museframework.bian.corporatefinance.dto;

public class InitiateStrategicFundingTopicRequest {
    private String corporatefinanceid;

    private String strategicfundingtopicid;

    private org.museframework.bian.corporatefinance.dto.bq.StrategicFundingTopic strategicFundingTopic;

    public void setCorporatefinanceid(String corporatefinanceid) {
        this.corporatefinanceid = corporatefinanceid;
    }

    public String getCorporatefinanceid() {
        return corporatefinanceid;
    }

    public void setStrategicfundingtopicid(String strategicfundingtopicid) {
        this.strategicfundingtopicid = strategicfundingtopicid;
    }

    public String getStrategicfundingtopicid() {
        return strategicfundingtopicid;
    }

    public void setStrategicFundingTopic(org.museframework.bian.corporatefinance.dto.bq.StrategicFundingTopic strategicFundingTopic) {
        this.strategicFundingTopic = strategicFundingTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.StrategicFundingTopic getStrategicFundingTopic() {
        return strategicFundingTopic;
    }
}