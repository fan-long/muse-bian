package org.museframework.bian.producttraining.dto;

public class UpdateServiceEvaluationResponse {
    private org.museframework.bian.producttraining.dto.bq.ServiceEvaluation serviceEvaluation;

    public void setServiceEvaluation(org.museframework.bian.producttraining.dto.bq.ServiceEvaluation serviceEvaluation) {
        this.serviceEvaluation = serviceEvaluation;
    }

    public org.museframework.bian.producttraining.dto.bq.ServiceEvaluation getServiceEvaluation() {
        return serviceEvaluation;
    }
}