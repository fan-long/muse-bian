package org.museframework.bian.customersurveys.dto;

public class UpdateSurveyAnalysisRequest {
    private String customersurveysid;

    private String surveyanalysisid;

    private org.museframework.bian.customersurveys.dto.bq.SurveyAnalysis surveyAnalysis;

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

    public void setSurveyAnalysis(org.museframework.bian.customersurveys.dto.bq.SurveyAnalysis surveyAnalysis) {
        this.surveyAnalysis = surveyAnalysis;
    }

    public org.museframework.bian.customersurveys.dto.bq.SurveyAnalysis getSurveyAnalysis() {
        return surveyAnalysis;
    }
}