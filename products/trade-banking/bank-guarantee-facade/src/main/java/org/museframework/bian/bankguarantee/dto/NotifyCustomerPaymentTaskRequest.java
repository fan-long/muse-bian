package org.museframework.bian.bankguarantee.dto;

public class NotifyCustomerPaymentTaskRequest {
    private String bankguaranteeid;

    private String customerpaymenttaskid;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setCustomerpaymenttaskid(String customerpaymenttaskid) {
        this.customerpaymenttaskid = customerpaymenttaskid;
    }

    public String getCustomerpaymenttaskid() {
        return customerpaymenttaskid;
    }
}