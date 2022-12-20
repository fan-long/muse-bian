package org.museframework.bian.loan.dto;

public class RetrieveDisbursementRequest {
    private String loanid;

    private String disbursementid;

    public void setLoanid(String loanid) {
        this.loanid = loanid;
    }

    public String getLoanid() {
        return loanid;
    }

    public void setDisbursementid(String disbursementid) {
        this.disbursementid = disbursementid;
    }

    public String getDisbursementid() {
        return disbursementid;
    }
}