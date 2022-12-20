package org.museframework.bian.fraudmodel.dto;

public class RetrieveTestingRequest {
    private String fraudmodelid;

    private String testingid;

    public void setFraudmodelid(String fraudmodelid) {
        this.fraudmodelid = fraudmodelid;
    }

    public String getFraudmodelid() {
        return fraudmodelid;
    }

    public void setTestingid(String testingid) {
        this.testingid = testingid;
    }

    public String getTestingid() {
        return testingid;
    }
}