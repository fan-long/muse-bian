package org.museframework.bian.corporatefinance.dto;

public class RequestTacticalFundingTopicRequest {
    private String corporatefinanceid;

    private String tacticalfundingtopicid;

    private org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic tacticalFundingTopic;

    public void setCorporatefinanceid(String corporatefinanceid) {
        this.corporatefinanceid = corporatefinanceid;
    }

    public String getCorporatefinanceid() {
        return corporatefinanceid;
    }

    public void setTacticalfundingtopicid(String tacticalfundingtopicid) {
        this.tacticalfundingtopicid = tacticalfundingtopicid;
    }

    public String getTacticalfundingtopicid() {
        return tacticalfundingtopicid;
    }

    public void setTacticalFundingTopic(org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic tacticalFundingTopic) {
        this.tacticalFundingTopic = tacticalFundingTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic getTacticalFundingTopic() {
        return tacticalFundingTopic;
    }
}