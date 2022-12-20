package org.museframework.bian.customersurveys.dto;

public class RetrieveExecutionRequest {
    private String customersurveysid;

    private String executionid;

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
}