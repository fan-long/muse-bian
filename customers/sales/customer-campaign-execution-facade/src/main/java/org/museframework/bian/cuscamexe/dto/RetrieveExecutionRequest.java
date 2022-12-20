package org.museframework.bian.cuscamexe.dto;

public class RetrieveExecutionRequest {
    private String customercampaignexecutionid;

    private String executionid;

    public void setCustomercampaignexecutionid(String customercampaignexecutionid) {
        this.customercampaignexecutionid = customercampaignexecutionid;
    }

    public String getCustomercampaignexecutionid() {
        return customercampaignexecutionid;
    }

    public void setExecutionid(String executionid) {
        this.executionid = executionid;
    }

    public String getExecutionid() {
        return executionid;
    }
}