package org.museframework.bian.fraudevaluation.dto;

public class EvaluateFraudEvaluationAssessmentResponse {
    private org.museframework.bian.fraudevaluation.dto.cr.FraudEvaluationAssessment fraudEvaluationAssessment;

    public void setFraudEvaluationAssessment(org.museframework.bian.fraudevaluation.dto.cr.FraudEvaluationAssessment fraudEvaluationAssessment) {
        this.fraudEvaluationAssessment = fraudEvaluationAssessment;
    }

    public org.museframework.bian.fraudevaluation.dto.cr.FraudEvaluationAssessment getFraudEvaluationAssessment() {
        return fraudEvaluationAssessment;
    }
}