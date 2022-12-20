package org.museframework.bian.corporateloan.dto;

public class UpdateRepaymentRequest {
    private String corporateloanid;

    private String repaymentid;

    private org.museframework.bian.corporateloan.dto.bq.Repayment repayment;

    public void setCorporateloanid(String corporateloanid) {
        this.corporateloanid = corporateloanid;
    }

    public String getCorporateloanid() {
        return corporateloanid;
    }

    public void setRepaymentid(String repaymentid) {
        this.repaymentid = repaymentid;
    }

    public String getRepaymentid() {
        return repaymentid;
    }

    public void setRepayment(org.museframework.bian.corporateloan.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.corporateloan.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}