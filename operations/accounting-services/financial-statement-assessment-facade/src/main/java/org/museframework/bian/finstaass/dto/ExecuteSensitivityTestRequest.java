package org.museframework.bian.finstaass.dto;

public class ExecuteSensitivityTestRequest {
    private String financialstatementassessmentid;

    private String sensitivitytestid;

    private org.museframework.bian.finstaass.dto.bq.SensitivityTest sensitivityTest;

    public void setFinancialstatementassessmentid(String financialstatementassessmentid) {
        this.financialstatementassessmentid = financialstatementassessmentid;
    }

    public String getFinancialstatementassessmentid() {
        return financialstatementassessmentid;
    }

    public void setSensitivitytestid(String sensitivitytestid) {
        this.sensitivitytestid = sensitivitytestid;
    }

    public String getSensitivitytestid() {
        return sensitivitytestid;
    }

    public void setSensitivityTest(org.museframework.bian.finstaass.dto.bq.SensitivityTest sensitivityTest) {
        this.sensitivityTest = sensitivityTest;
    }

    public org.museframework.bian.finstaass.dto.bq.SensitivityTest getSensitivityTest() {
        return sensitivityTest;
    }
}