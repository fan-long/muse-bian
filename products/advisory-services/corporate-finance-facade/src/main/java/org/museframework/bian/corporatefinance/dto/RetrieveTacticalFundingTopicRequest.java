package org.museframework.bian.corporatefinance.dto;

public class RetrieveTacticalFundingTopicRequest {
    private String corporatefinanceid;

    private String tacticalfundingtopicid;

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
}