package org.museframework.bian.cuscamexe.dto;

public class RequestExecutionRequest {
    private String customercampaignexecutionid;

    private String executionid;

    private org.museframework.bian.cuscamexe.dto.bq.Execution execution;

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

    public void setExecution(org.museframework.bian.cuscamexe.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.cuscamexe.dto.bq.Execution getExecution() {
        return execution;
    }
}