package org.museframework.bian.bankguarantee.dto;

public class NotifyBankGuaranteePayoutTaskRequest {
    private String bankguaranteeid;

    private String bankguaranteepayouttaskid;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setBankguaranteepayouttaskid(String bankguaranteepayouttaskid) {
        this.bankguaranteepayouttaskid = bankguaranteepayouttaskid;
    }

    public String getBankguaranteepayouttaskid() {
        return bankguaranteepayouttaskid;
    }
}