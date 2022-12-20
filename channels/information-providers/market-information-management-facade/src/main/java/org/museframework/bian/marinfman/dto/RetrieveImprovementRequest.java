package org.museframework.bian.marinfman.dto;

public class RetrieveImprovementRequest {
    private String marketinformationmanagementid;

    private String improvementid;

    public void setMarketinformationmanagementid(String marketinformationmanagementid) {
        this.marketinformationmanagementid = marketinformationmanagementid;
    }

    public String getMarketinformationmanagementid() {
        return marketinformationmanagementid;
    }

    public void setImprovementid(String improvementid) {
        this.improvementid = improvementid;
    }

    public String getImprovementid() {
        return improvementid;
    }
}