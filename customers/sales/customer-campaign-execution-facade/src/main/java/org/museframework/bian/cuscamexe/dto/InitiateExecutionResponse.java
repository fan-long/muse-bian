package org.museframework.bian.cuscamexe.dto;

public class InitiateExecutionResponse {
    private org.museframework.bian.cuscamexe.dto.bq.Execution execution;

    public void setExecution(org.museframework.bian.cuscamexe.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.cuscamexe.dto.bq.Execution getExecution() {
        return execution;
    }
}