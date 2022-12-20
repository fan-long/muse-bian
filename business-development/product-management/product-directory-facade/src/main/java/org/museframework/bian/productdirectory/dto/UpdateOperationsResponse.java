package org.museframework.bian.productdirectory.dto;

public class UpdateOperationsResponse {
    private org.museframework.bian.productdirectory.dto.bq.Operations operations;

    public void setOperations(org.museframework.bian.productdirectory.dto.bq.Operations operations) {
        this.operations = operations;
    }

    public org.museframework.bian.productdirectory.dto.bq.Operations getOperations() {
        return operations;
    }
}