package org.museframework.bian.conadvser.dto;

public class UpdateServiceFeesResponse {
    private org.museframework.bian.conadvser.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.conadvser.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.conadvser.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}