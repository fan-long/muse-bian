package org.museframework.bian.producttraining.dto;

public class RetrieveServiceEvaluationRequest {
    private String producttrainingid;

    private String serviceevaluationid;

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
}