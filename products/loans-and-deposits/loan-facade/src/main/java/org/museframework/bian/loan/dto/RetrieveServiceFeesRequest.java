package org.museframework.bian.loan.dto;

public class RetrieveServiceFeesRequest {
    private String loanid;

    private String servicefeesid;

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
}