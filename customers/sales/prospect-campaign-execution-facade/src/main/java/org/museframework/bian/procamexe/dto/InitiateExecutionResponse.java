package org.museframework.bian.procamexe.dto;

public class InitiateExecutionResponse {
    private org.museframework.bian.procamexe.dto.bq.Execution execution;

    public void setExecution(org.museframework.bian.procamexe.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.procamexe.dto.bq.Execution getExecution() {
        return execution;
    }
}