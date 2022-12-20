package org.museframework.bian.creditcard.dto;

public class UpdateRepaymentResponse {
    private org.museframework.bian.creditcard.dto.bq.Repayment repayment;

    public void setRepayment(org.museframework.bian.creditcard.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.creditcard.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}