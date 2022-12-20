package org.museframework.bian.termdeposit.dto;

public class ExecuteServiceFeesResponse {
    private org.museframework.bian.termdeposit.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.termdeposit.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.termdeposit.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}