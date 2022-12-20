package org.museframework.bian.currentaccount.dto;

public class InitiateServiceFeesRequest {
    private String currentaccountid;

    private String servicefeesid;

    private org.museframework.bian.currentaccount.dto.bq.ServiceFees serviceFees;

    public void setCurrentaccountid(String currentaccountid) {
        this.currentaccountid = currentaccountid;
    }

    public String getCurrentaccountid() {
        return currentaccountid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.currentaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.currentaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}