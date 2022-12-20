package org.museframework.bian.corporatefinance.dto;

public class RetrieveStrategicFundingTopicRequest {
    private String corporatefinanceid;

    private String strategicfundingtopicid;

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
}