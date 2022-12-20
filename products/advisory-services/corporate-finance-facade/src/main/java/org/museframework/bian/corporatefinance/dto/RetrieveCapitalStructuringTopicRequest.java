package org.museframework.bian.corporatefinance.dto;

public class RetrieveCapitalStructuringTopicRequest {
    private String corporatefinanceid;

    private String capitalstructuringtopicid;

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
}