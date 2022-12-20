package org.museframework.bian.loan.dto;

public class ExecuteRepaymentResponse {
    private org.museframework.bian.loan.dto.bq.Repayment repayment;

    public void setRepayment(org.museframework.bian.loan.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.loan.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}