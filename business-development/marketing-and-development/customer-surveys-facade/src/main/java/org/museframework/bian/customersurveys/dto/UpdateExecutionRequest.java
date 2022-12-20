package org.museframework.bian.customersurveys.dto;

public class UpdateExecutionRequest {
    private String customersurveysid;

    private String executionid;

    private org.museframework.bian.customersurveys.dto.bq.Execution execution;

    public void setCustomersurveysid(String customersurveysid) {
        this.customersurveysid = customersurveysid;
    }

    public String getCustomersurveysid() {
        return customersurveysid;
    }

    public void setExecutionid(String executionid) {
        this.executionid = executionid;
    }

    public String getExecutionid() {
        return executionid;
    }

    public void setExecution(org.museframework.bian.customersurveys.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.customersurveys.dto.bq.Execution getExecution() {
        return execution;
    }
}