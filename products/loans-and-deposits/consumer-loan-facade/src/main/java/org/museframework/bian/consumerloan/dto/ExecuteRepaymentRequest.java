package org.museframework.bian.consumerloan.dto;

public class ExecuteRepaymentRequest {
    private String consumerloanid;

    private String repaymentid;

    private org.museframework.bian.consumerloan.dto.bq.Repayment repayment;

    public void setConsumerloanid(String consumerloanid) {
        this.consumerloanid = consumerloanid;
    }

    public String getConsumerloanid() {
        return consumerloanid;
    }

    public void setRepaymentid(String repaymentid) {
        this.repaymentid = repaymentid;
    }

    public String getRepaymentid() {
        return repaymentid;
    }

    public void setRepayment(org.museframework.bian.consumerloan.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.consumerloan.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}