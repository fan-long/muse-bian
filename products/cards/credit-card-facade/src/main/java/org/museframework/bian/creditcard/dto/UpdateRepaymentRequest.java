package org.museframework.bian.creditcard.dto;

public class UpdateRepaymentRequest {
    private String creditcardid;

    private String repaymentid;

    private org.museframework.bian.creditcard.dto.bq.Repayment repayment;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setRepaymentid(String repaymentid) {
        this.repaymentid = repaymentid;
    }

    public String getRepaymentid() {
        return repaymentid;
    }

    public void setRepayment(org.museframework.bian.creditcard.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.creditcard.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}