package org.museframework.bian.procamexe.dto;

public class InitiateExecutionRequest {
    private String prospectcampaignexecutionid;

    private String executionid;

    private org.museframework.bian.procamexe.dto.bq.Execution execution;

    public void setProspectcampaignexecutionid(String prospectcampaignexecutionid) {
        this.prospectcampaignexecutionid = prospectcampaignexecutionid;
    }

    public String getProspectcampaignexecutionid() {
        return prospectcampaignexecutionid;
    }

    public void setExecutionid(String executionid) {
        this.executionid = executionid;
    }

    public String getExecutionid() {
        return executionid;
    }

    public void setExecution(org.museframework.bian.procamexe.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.procamexe.dto.bq.Execution getExecution() {
        return execution;
    }
}