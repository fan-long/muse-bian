package org.museframework.bian.customersurveys.dto;

public class RetrieveSurveyAnalysisRequest {
    private String customersurveysid;

    private String surveyanalysisid;

    public void setCustomersurveysid(String customersurveysid) {
        this.customersurveysid = customersurveysid;
    }

    public String getCustomersurveysid() {
        return customersurveysid;
    }

    public void setSurveyanalysisid(String surveyanalysisid) {
        this.surveyanalysisid = surveyanalysisid;
    }

    public String getSurveyanalysisid() {
        return surveyanalysisid;
    }
}