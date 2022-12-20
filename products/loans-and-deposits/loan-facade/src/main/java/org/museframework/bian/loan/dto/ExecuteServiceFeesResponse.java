package org.museframework.bian.loan.dto;

public class ExecuteServiceFeesResponse {
    private org.museframework.bian.loan.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.loan.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.loan.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}