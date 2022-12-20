package org.museframework.bian.productdeployment.dto;

public class RequestHROperationsResponse {
    private org.museframework.bian.productdeployment.dto.bq.HROperations hROperations;

    public void sethROperations(org.museframework.bian.productdeployment.dto.bq.HROperations hROperations) {
        this.hROperations = hROperations;
    }

    public org.museframework.bian.productdeployment.dto.bq.HROperations gethROperations() {
        return hROperations;
    }
}