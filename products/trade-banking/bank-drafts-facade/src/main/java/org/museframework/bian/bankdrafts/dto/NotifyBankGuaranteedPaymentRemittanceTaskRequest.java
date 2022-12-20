package org.museframework.bian.bankdrafts.dto;

public class NotifyBankGuaranteedPaymentRemittanceTaskRequest {
    private String bankdraftsid;

    private String bankguaranteedpaymentremittancetaskid;

    public void setBankdraftsid(String bankdraftsid) {
        this.bankdraftsid = bankdraftsid;
    }

    public String getBankdraftsid() {
        return bankdraftsid;
    }

    public void setBankguaranteedpaymentremittancetaskid(String bankguaranteedpaymentremittancetaskid) {
        this.bankguaranteedpaymentremittancetaskid = bankguaranteedpaymentremittancetaskid;
    }

    public String getBankguaranteedpaymentremittancetaskid() {
        return bankguaranteedpaymentremittancetaskid;
    }
}