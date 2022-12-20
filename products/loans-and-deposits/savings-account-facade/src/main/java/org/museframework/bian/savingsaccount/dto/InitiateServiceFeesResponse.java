package org.museframework.bian.savingsaccount.dto;

public class InitiateServiceFeesResponse {
    private org.museframework.bian.savingsaccount.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.savingsaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.savingsaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}