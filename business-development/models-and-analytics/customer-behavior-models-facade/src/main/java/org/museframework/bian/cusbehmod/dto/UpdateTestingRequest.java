package org.museframework.bian.cusbehmod.dto;

public class UpdateTestingRequest {
    private String customerbehaviormodelsid;

    private String testingid;

    private org.museframework.bian.cusbehmod.dto.bq.Testing testing;

    public void setCustomerbehaviormodelsid(String customerbehaviormodelsid) {
        this.customerbehaviormodelsid = customerbehaviormodelsid;
    }

    public String getCustomerbehaviormodelsid() {
        return customerbehaviormodelsid;
    }

    public void setTestingid(String testingid) {
        this.testingid = testingid;
    }

    public String getTestingid() {
        return testingid;
    }

    public void setTesting(org.museframework.bian.cusbehmod.dto.bq.Testing testing) {
        this.testing = testing;
    }

    public org.museframework.bian.cusbehmod.dto.bq.Testing getTesting() {
        return testing;
    }
}