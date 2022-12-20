package org.museframework.bian.casmanandaccser.dto;

public class InitiateServiceFeesRequest {
    private String cashmanagementandaccountservicesid;

    private String servicefeesid;

    private org.museframework.bian.casmanandaccser.dto.bq.ServiceFees serviceFees;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.casmanandaccser.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}