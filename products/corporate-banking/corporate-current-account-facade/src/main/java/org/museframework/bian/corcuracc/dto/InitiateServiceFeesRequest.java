package org.museframework.bian.corcuracc.dto;

public class InitiateServiceFeesRequest {
    private String corporatecurrentaccountid;

    private String servicefeesid;

    private org.museframework.bian.corcuracc.dto.bq.ServiceFees serviceFees;

    public void setCorporatecurrentaccountid(String corporatecurrentaccountid) {
        this.corporatecurrentaccountid = corporatecurrentaccountid;
    }

    public String getCorporatecurrentaccountid() {
        return corporatecurrentaccountid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.corcuracc.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.corcuracc.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}