package org.museframework.bian.opeiteman.dto;

public class RetrieveRepaymentRequest {
    private String openitemmanagementid;

    private String repaymentid;

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
}