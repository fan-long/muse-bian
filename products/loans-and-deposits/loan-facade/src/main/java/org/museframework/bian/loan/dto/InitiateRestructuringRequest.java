package org.museframework.bian.loan.dto;

public class InitiateRestructuringRequest {
    private String loanid;

    private String restructuringid;

    private org.museframework.bian.loan.dto.bq.Restructuring restructuring;

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

    public void setRestructuring(org.museframework.bian.loan.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.loan.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}