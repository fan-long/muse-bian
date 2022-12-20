package org.museframework.bian.marketorder.dto;

public class RetrieveCustomerProcessingResponse {
    private org.museframework.bian.marketorder.dto.bq.CustomerProcessing customerProcessing;

    public void setCustomerProcessing(org.museframework.bian.marketorder.dto.bq.CustomerProcessing customerProcessing) {
        this.customerProcessing = customerProcessing;
    }

    public org.museframework.bian.marketorder.dto.bq.CustomerProcessing getCustomerProcessing() {
        return customerProcessing;
    }
}