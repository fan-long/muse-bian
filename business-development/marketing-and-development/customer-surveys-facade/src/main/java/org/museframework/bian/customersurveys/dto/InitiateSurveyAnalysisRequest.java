package org.museframework.bian.customersurveys.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSurveyAnalysisRequest {
    @MetaField
    private String customersurveysid;

    @MetaField
    private String surveyanalysisid;

    @MetaField(ref=true)
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