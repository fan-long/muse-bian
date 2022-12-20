package org.museframework.bian.loan.dto;

public class ExecuteServiceFeesRequest {
    private String loanid;

    private String servicefeesid;

    private org.museframework.bian.loan.dto.bq.ServiceFees serviceFees;

    public void setLoanid(String loanid) {
        this.loanid = loanid;
    }

    public String getLoanid() {
        return loanid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.loan.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.loan.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}