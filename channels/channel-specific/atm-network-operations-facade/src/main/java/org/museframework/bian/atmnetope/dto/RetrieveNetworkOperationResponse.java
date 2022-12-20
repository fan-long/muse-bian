package org.museframework.bian.atmnetope.dto;

public class RetrieveNetworkOperationResponse {
    private org.museframework.bian.atmnetope.dto.bq.NetworkOperation networkOperation;

    public void setNetworkOperation(org.museframework.bian.atmnetope.dto.bq.NetworkOperation networkOperation) {
        this.networkOperation = networkOperation;
    }

    public org.museframework.bian.atmnetope.dto.bq.NetworkOperation getNetworkOperation() {
        return networkOperation;
    }
}