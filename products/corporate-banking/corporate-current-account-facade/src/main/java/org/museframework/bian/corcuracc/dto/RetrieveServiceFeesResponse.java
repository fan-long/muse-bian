package org.museframework.bian.corcuracc.dto;

public class RetrieveServiceFeesResponse {
    private org.museframework.bian.corcuracc.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.corcuracc.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.corcuracc.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}