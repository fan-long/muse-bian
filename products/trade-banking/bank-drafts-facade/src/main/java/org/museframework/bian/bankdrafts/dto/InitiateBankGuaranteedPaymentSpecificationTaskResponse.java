package org.museframework.bian.bankdrafts.dto;

public class InitiateBankGuaranteedPaymentSpecificationTaskResponse {
    private org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask bankGuaranteedPaymentSpecificationTask;

    public void setBankGuaranteedPaymentSpecificationTask(org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask bankGuaranteedPaymentSpecificationTask) {
        this.bankGuaranteedPaymentSpecificationTask = bankGuaranteedPaymentSpecificationTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask getBankGuaranteedPaymentSpecificationTask() {
        return bankGuaranteedPaymentSpecificationTask;
    }
}