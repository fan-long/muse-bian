package org.museframework.bian.consumerloan.dto;

public class ExecuteServiceFeesResponse {
    private org.museframework.bian.consumerloan.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.consumerloan.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.consumerloan.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}