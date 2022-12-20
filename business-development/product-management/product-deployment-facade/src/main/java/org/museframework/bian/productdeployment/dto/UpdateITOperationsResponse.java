package org.museframework.bian.productdeployment.dto;

public class UpdateITOperationsResponse {
    private org.museframework.bian.productdeployment.dto.bq.ITOperations iTOperations;

    public void setiTOperations(org.museframework.bian.productdeployment.dto.bq.ITOperations iTOperations) {
        this.iTOperations = iTOperations;
    }

    public org.museframework.bian.productdeployment.dto.bq.ITOperations getiTOperations() {
        return iTOperations;
    }
}