package org.museframework.bian.customersurveys.dto;

public class RetrieveSurveyAnalysisResponse {
    private org.museframework.bian.customersurveys.dto.bq.SurveyAnalysis surveyAnalysis;

    public void setSurveyAnalysis(org.museframework.bian.customersurveys.dto.bq.SurveyAnalysis surveyAnalysis) {
        this.surveyAnalysis = surveyAnalysis;
    }

    public org.museframework.bian.customersurveys.dto.bq.SurveyAnalysis getSurveyAnalysis() {
        return surveyAnalysis;
    }
}