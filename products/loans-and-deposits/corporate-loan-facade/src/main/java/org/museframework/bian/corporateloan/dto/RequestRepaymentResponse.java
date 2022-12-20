package org.museframework.bian.corporateloan.dto;

public class RequestRepaymentResponse {
    private org.museframework.bian.corporateloan.dto.bq.Repayment repayment;

    public void setRepayment(org.museframework.bian.corporateloan.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.corporateloan.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}