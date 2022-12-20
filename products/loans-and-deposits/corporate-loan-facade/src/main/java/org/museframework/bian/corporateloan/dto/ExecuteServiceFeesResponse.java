package org.museframework.bian.corporateloan.dto;

public class ExecuteServiceFeesResponse {
    private org.museframework.bian.corporateloan.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.corporateloan.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.corporateloan.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}