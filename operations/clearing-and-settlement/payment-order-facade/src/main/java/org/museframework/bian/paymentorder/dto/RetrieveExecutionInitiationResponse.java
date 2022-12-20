package org.museframework.bian.paymentorder.dto;

public class RetrieveExecutionInitiationResponse {
    private org.museframework.bian.paymentorder.dto.bq.ExecutionInitiation executionInitiation;

    public void setExecutionInitiation(org.museframework.bian.paymentorder.dto.bq.ExecutionInitiation executionInitiation) {
        this.executionInitiation = executionInitiation;
    }

    public org.museframework.bian.paymentorder.dto.bq.ExecutionInitiation getExecutionInitiation() {
        return executionInitiation;
    }
}