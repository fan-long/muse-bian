package org.museframework.bian.subcusagr.dto;

public class NotifyPolicyTermRequest {
    private String subcustodianagreementid;

    private String policytermid;

    public void setSubcustodianagreementid(String subcustodianagreementid) {
        this.subcustodianagreementid = subcustodianagreementid;
    }

    public String getSubcustodianagreementid() {
        return subcustodianagreementid;
    }

    public void setPolicytermid(String policytermid) {
        this.policytermid = policytermid;
    }

    public String getPolicytermid() {
        return policytermid;
    }
}