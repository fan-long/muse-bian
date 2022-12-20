package org.museframework.bian.casmanandaccser.dto;

public class ExecuteServiceFeesResponse {
    private org.museframework.bian.casmanandaccser.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.casmanandaccser.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}