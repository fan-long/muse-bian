package org.museframework.bian.corporateloan.dto;

public class ExecuteServiceFeesRequest {
    private String corporateloanid;

    private String servicefeesid;

    private org.museframework.bian.corporateloan.dto.bq.ServiceFees serviceFees;

    public void setCorporateloanid(String corporateloanid) {
        this.corporateloanid = corporateloanid;
    }

    public String getCorporateloanid() {
        return corporateloanid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.corporateloan.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.corporateloan.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}