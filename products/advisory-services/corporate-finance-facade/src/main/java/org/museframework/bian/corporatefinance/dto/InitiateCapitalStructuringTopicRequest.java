package org.museframework.bian.corporatefinance.dto;

public class InitiateCapitalStructuringTopicRequest {
    private String corporatefinanceid;

    private String capitalstructuringtopicid;

    private org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic capitalStructuringTopic;

    public void setCorporatefinanceid(String corporatefinanceid) {
        this.corporatefinanceid = corporatefinanceid;
    }

    public String getCorporatefinanceid() {
        return corporatefinanceid;
    }

    public void setCapitalstructuringtopicid(String capitalstructuringtopicid) {
        this.capitalstructuringtopicid = capitalstructuringtopicid;
    }

    public String getCapitalstructuringtopicid() {
        return capitalstructuringtopicid;
    }

    public void setCapitalStructuringTopic(org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic capitalStructuringTopic) {
        this.capitalStructuringTopic = capitalStructuringTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic getCapitalStructuringTopic() {
        return capitalStructuringTopic;
    }
}