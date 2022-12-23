package org.museframework.bian.customersurveys.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateSurveyAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customersurveys.dto.bq.SurveyAnalysis surveyAnalysis;

    public void setSurveyAnalysis(org.museframework.bian.customersurveys.dto.bq.SurveyAnalysis surveyAnalysis) {
        this.surveyAnalysis = surveyAnalysis;
    }

    public org.museframework.bian.customersurveys.dto.bq.SurveyAnalysis getSurveyAnalysis() {
        return surveyAnalysis;
    }
}