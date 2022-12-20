package org.museframework.bian.investmentaccount.dto;

public class ExecuteServiceFeesResponse {
    private org.museframework.bian.investmentaccount.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.investmentaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.investmentaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}