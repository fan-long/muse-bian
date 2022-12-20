package org.museframework.bian.bankdrafts.dto;

public class RetrieveBankGuaranteedPaymentRemittanceTaskResponse {
    private org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask bankGuaranteedPaymentRemittanceTask;

    public void setBankGuaranteedPaymentRemittanceTask(org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask bankGuaranteedPaymentRemittanceTask) {
        this.bankGuaranteedPaymentRemittanceTask = bankGuaranteedPaymentRemittanceTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask getBankGuaranteedPaymentRemittanceTask() {
        return bankGuaranteedPaymentRemittanceTask;
    }
}