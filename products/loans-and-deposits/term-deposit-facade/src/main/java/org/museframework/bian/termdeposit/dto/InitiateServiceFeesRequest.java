package org.museframework.bian.termdeposit.dto;

public class InitiateServiceFeesRequest {
    private String termdepositid;

    private String servicefeesid;

    private org.museframework.bian.termdeposit.dto.bq.ServiceFees serviceFees;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.termdeposit.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.termdeposit.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}