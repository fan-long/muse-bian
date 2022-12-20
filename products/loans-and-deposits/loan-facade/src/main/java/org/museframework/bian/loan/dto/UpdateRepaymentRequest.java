package org.museframework.bian.loan.dto;

public class UpdateRepaymentRequest {
    private String loanid;

    private String repaymentid;

    private org.museframework.bian.loan.dto.bq.Repayment repayment;

    public void setLoanid(String loanid) {
        this.loanid = loanid;
    }

    public String getLoanid() {
        return loanid;
    }

    public void setRepaymentid(String repaymentid) {
        this.repaymentid = repaymentid;
    }

    public String getRepaymentid() {
        return repaymentid;
    }

    public void setRepayment(org.museframework.bian.loan.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.loan.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}