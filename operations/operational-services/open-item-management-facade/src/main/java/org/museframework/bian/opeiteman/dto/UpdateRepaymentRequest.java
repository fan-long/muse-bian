package org.museframework.bian.opeiteman.dto;

public class UpdateRepaymentRequest {
    private String openitemmanagementid;

    private String repaymentid;

    private org.museframework.bian.opeiteman.dto.bq.Repayment repayment;

    public void setOpenitemmanagementid(String openitemmanagementid) {
        this.openitemmanagementid = openitemmanagementid;
    }

    public String getOpenitemmanagementid() {
        return openitemmanagementid;
    }

    public void setRepaymentid(String repaymentid) {
        this.repaymentid = repaymentid;
    }

    public String getRepaymentid() {
        return repaymentid;
    }

    public void setRepayment(org.museframework.bian.opeiteman.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.opeiteman.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}