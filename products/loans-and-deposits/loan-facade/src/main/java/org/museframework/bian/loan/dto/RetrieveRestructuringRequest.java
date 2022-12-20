package org.museframework.bian.loan.dto;

public class RetrieveRestructuringRequest {
    private String loanid;

    private String restructuringid;

    public void setLoanid(String loanid) {
        this.loanid = loanid;
    }

    public String getLoanid() {
        return loanid;
    }

    public void setRestructuringid(String restructuringid) {
        this.restructuringid = restructuringid;
    }

    public String getRestructuringid() {
        return restructuringid;
    }
}