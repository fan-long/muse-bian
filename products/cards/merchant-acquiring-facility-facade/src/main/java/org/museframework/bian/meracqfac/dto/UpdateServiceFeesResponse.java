package org.museframework.bian.meracqfac.dto;

public class UpdateServiceFeesResponse {
    private org.museframework.bian.meracqfac.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.meracqfac.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.meracqfac.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}