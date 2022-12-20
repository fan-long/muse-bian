package org.museframework.bian.customersurveys.dto;

public class CaptureExecutionResponse {
    private org.museframework.bian.customersurveys.dto.bq.Execution execution;

    public void setExecution(org.museframework.bian.customersurveys.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.customersurveys.dto.bq.Execution getExecution() {
        return execution;
    }
}