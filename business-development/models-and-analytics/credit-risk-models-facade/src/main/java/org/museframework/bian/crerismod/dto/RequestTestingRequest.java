package org.museframework.bian.crerismod.dto;

public class RequestTestingRequest {
    private String creditriskmodelsid;

    private String testingid;

    private org.museframework.bian.crerismod.dto.bq.Testing testing;

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

    public void setTesting(org.museframework.bian.crerismod.dto.bq.Testing testing) {
        this.testing = testing;
    }

    public org.museframework.bian.crerismod.dto.bq.Testing getTesting() {
        return testing;
    }
}