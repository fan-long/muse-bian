package org.museframework.bian.finstaass.dto;

public class NotifySensitivityTestRequest {
    private String financialstatementassessmentid;

    private String sensitivitytestid;

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
}