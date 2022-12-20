package org.museframework.bian.finstaass.dto;

public class ExecuteSensitivityTestResponse {
    private org.museframework.bian.finstaass.dto.bq.SensitivityTest sensitivityTest;

    public void setSensitivityTest(org.museframework.bian.finstaass.dto.bq.SensitivityTest sensitivityTest) {
        this.sensitivityTest = sensitivityTest;
    }

    public org.museframework.bian.finstaass.dto.bq.SensitivityTest getSensitivityTest() {
        return sensitivityTest;
    }
}