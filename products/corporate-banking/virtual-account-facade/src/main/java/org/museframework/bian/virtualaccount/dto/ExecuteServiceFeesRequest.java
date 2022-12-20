package org.museframework.bian.virtualaccount.dto;

public class ExecuteServiceFeesRequest {
    private String virtualaccountid;

    private String servicefeesid;

    private org.museframework.bian.virtualaccount.dto.bq.ServiceFees serviceFees;

    public void setVirtualaccountid(String virtualaccountid) {
        this.virtualaccountid = virtualaccountid;
    }

    public String getVirtualaccountid() {
        return virtualaccountid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.virtualaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.virtualaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}