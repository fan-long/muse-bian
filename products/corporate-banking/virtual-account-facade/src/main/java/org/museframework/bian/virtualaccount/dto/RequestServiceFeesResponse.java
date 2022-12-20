package org.museframework.bian.virtualaccount.dto;

public class RequestServiceFeesResponse {
    private org.museframework.bian.virtualaccount.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.virtualaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.virtualaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}