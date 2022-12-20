package org.museframework.bian.producttraining.dto;

public class UpdateServiceEvaluationRequest {
    private String producttrainingid;

    private String serviceevaluationid;

    private org.museframework.bian.producttraining.dto.bq.ServiceEvaluation serviceEvaluation;

    public void setProducttrainingid(String producttrainingid) {
        this.producttrainingid = producttrainingid;
    }

    public String getProducttrainingid() {
        return producttrainingid;
    }

    public void setServiceevaluationid(String serviceevaluationid) {
        this.serviceevaluationid = serviceevaluationid;
    }

    public String getServiceevaluationid() {
        return serviceevaluationid;
    }

    public void setServiceEvaluation(org.museframework.bian.producttraining.dto.bq.ServiceEvaluation serviceEvaluation) {
        this.serviceEvaluation = serviceEvaluation;
    }

    public org.museframework.bian.producttraining.dto.bq.ServiceEvaluation getServiceEvaluation() {
        return serviceEvaluation;
    }
}