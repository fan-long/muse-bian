package org.museframework.bian.bankdrafts.dto;

public class UpdateBankGuaranteedPaymentRemittanceTaskRequest {
    private String bankdraftsid;

    private String bankguaranteedpaymentremittancetaskid;

    private org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask bankGuaranteedPaymentRemittanceTask;

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

    public void setBankGuaranteedPaymentRemittanceTask(org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask bankGuaranteedPaymentRemittanceTask) {
        this.bankGuaranteedPaymentRemittanceTask = bankGuaranteedPaymentRemittanceTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask getBankGuaranteedPaymentRemittanceTask() {
        return bankGuaranteedPaymentRemittanceTask;
    }
}