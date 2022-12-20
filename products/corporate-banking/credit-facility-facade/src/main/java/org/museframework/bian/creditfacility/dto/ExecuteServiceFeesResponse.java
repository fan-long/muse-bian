package org.museframework.bian.creditfacility.dto;

public class ExecuteServiceFeesResponse {
    private org.museframework.bian.creditfacility.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.creditfacility.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.creditfacility.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}