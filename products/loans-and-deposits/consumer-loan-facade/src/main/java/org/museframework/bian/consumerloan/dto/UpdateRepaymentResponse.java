package org.museframework.bian.consumerloan.dto;

public class UpdateRepaymentResponse {
    private org.museframework.bian.consumerloan.dto.bq.Repayment repayment;

    public void setRepayment(org.museframework.bian.consumerloan.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.consumerloan.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}