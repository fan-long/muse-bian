package org.museframework.bian.delacchan.dto;

public class RetrieveAssessmentRequest {
    private String delinquentaccounthandlingid;

    private String assessmentid;

    public void setDelinquentaccounthandlingid(String delinquentaccounthandlingid) {
        this.delinquentaccounthandlingid = delinquentaccounthandlingid;
    }

    public String getDelinquentaccounthandlingid() {
        return delinquentaccounthandlingid;
    }

    public void setAssessmentid(String assessmentid) {
        this.assessmentid = assessmentid;
    }

    public String getAssessmentid() {
        return assessmentid;
    }
}