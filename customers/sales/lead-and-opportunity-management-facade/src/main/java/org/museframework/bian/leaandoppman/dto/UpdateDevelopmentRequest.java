package org.museframework.bian.leaandoppman.dto;

public class UpdateDevelopmentRequest {
    private String leadandopportunitymanagementid;

    private String developmentid;

    private org.museframework.bian.leaandoppman.dto.bq.Development development;

    public void setLeadandopportunitymanagementid(String leadandopportunitymanagementid) {
        this.leadandopportunitymanagementid = leadandopportunitymanagementid;
    }

    public String getLeadandopportunitymanagementid() {
        return leadandopportunitymanagementid;
    }

    public void setDevelopmentid(String developmentid) {
        this.developmentid = developmentid;
    }

    public String getDevelopmentid() {
        return developmentid;
    }

    public void setDevelopment(org.museframework.bian.leaandoppman.dto.bq.Development development) {
        this.development = development;
    }

    public org.museframework.bian.leaandoppman.dto.bq.Development getDevelopment() {
        return development;
    }
}