package org.museframework.bian.opeiteman.dto;

public class ExecuteRepaymentResponse {
    private org.museframework.bian.opeiteman.dto.bq.Repayment repayment;

    public void setRepayment(org.museframework.bian.opeiteman.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.opeiteman.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}