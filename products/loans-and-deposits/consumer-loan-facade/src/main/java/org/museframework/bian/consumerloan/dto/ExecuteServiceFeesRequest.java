package org.museframework.bian.consumerloan.dto;

public class ExecuteServiceFeesRequest {
    private String consumerloanid;

    private String servicefeesid;

    private org.museframework.bian.consumerloan.dto.bq.ServiceFees serviceFees;

    public void setConsumerloanid(String consumerloanid) {
        this.consumerloanid = consumerloanid;
    }

    public String getConsumerloanid() {
        return consumerloanid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.consumerloan.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.consumerloan.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}