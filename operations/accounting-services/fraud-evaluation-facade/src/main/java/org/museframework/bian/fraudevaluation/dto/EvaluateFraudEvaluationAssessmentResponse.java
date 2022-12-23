package org.museframework.bian.fraudevaluation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class EvaluateFraudEvaluationAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fraudevaluation.dto.cr.FraudEvaluationAssessment fraudEvaluationAssessment;

    public void setFraudEvaluationAssessment(org.museframework.bian.fraudevaluation.dto.cr.FraudEvaluationAssessment fraudEvaluationAssessment) {
        this.fraudEvaluationAssessment = fraudEvaluationAssessment;
    }

    public org.museframework.bian.fraudevaluation.dto.cr.FraudEvaluationAssessment getFraudEvaluationAssessment() {
        return fraudEvaluationAssessment;
    }
}