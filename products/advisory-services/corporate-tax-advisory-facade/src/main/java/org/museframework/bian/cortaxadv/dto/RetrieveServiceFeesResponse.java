package org.museframework.bian.cortaxadv.dto;

public class RetrieveServiceFeesResponse {
    private org.museframework.bian.cortaxadv.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.cortaxadv.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.cortaxadv.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}