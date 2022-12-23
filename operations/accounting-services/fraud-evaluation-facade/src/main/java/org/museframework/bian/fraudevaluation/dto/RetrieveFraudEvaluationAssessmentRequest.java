package org.museframework.bian.fraudevaluation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFraudEvaluationAssessmentRequest {
    @MetaField
    private String fraudevaluationid;

    public void setFraudevaluationid(String fraudevaluationid) {
        this.fraudevaluationid = fraudevaluationid;
    }

    public String getFraudevaluationid() {
        return fraudevaluationid;
    }
}