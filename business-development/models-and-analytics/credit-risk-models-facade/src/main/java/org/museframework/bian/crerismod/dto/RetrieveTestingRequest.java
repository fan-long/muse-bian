package org.museframework.bian.crerismod.dto;

public class RetrieveTestingRequest {
    private String creditriskmodelsid;

    private String testingid;

    public void setCreditriskmodelsid(String creditriskmodelsid) {
        this.creditriskmodelsid = creditriskmodelsid;
    }

    public String getCreditriskmodelsid() {
        return creditriskmodelsid;
    }

    public void setTestingid(String testingid) {
        this.testingid = testingid;
    }

    public String getTestingid() {
        return testingid;
    }
}