package org.museframework.bian.bankdrafts.dto;

public class NotifyBankGuaranteedPaymentSpecificationTaskRequest {
    private String bankdraftsid;

    private String bankguaranteedpaymentspecificationtaskid;

    public void setBankdraftsid(String bankdraftsid) {
        this.bankdraftsid = bankdraftsid;
    }

    public String getBankdraftsid() {
        return bankdraftsid;
    }

    public void setBankguaranteedpaymentspecificationtaskid(String bankguaranteedpaymentspecificationtaskid) {
        this.bankguaranteedpaymentspecificationtaskid = bankguaranteedpaymentspecificationtaskid;
    }

    public String getBankguaranteedpaymentspecificationtaskid() {
        return bankguaranteedpaymentspecificationtaskid;
    }
}