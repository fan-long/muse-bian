package org.museframework.bian.merchandisingloan.dto;

public class RequestServiceFeesResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.merchandisingloan.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}