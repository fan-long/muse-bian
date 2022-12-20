package org.museframework.bian.currentaccount.dto;

public class InitiateServiceFeesResponse {
    private org.museframework.bian.currentaccount.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.currentaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.currentaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}