package org.museframework.bian.bankdrafts.dto;

public class UpdateBankGuaranteedPaymentSpecificationTaskRequest {
    private String bankdraftsid;

    private String bankguaranteedpaymentspecificationtaskid;

    private org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask bankGuaranteedPaymentSpecificationTask;

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

    public void setBankGuaranteedPaymentSpecificationTask(org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask bankGuaranteedPaymentSpecificationTask) {
        this.bankGuaranteedPaymentSpecificationTask = bankGuaranteedPaymentSpecificationTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask getBankGuaranteedPaymentSpecificationTask() {
        return bankGuaranteedPaymentSpecificationTask;
    }
}