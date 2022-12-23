package org.museframework.bian.customersurveys.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSurveyAnalysisRequest {
    @MetaField
    private String customersurveysid;

    @MetaField
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