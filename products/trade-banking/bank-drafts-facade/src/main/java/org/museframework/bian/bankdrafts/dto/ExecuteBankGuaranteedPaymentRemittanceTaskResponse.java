package org.museframework.bian.bankdrafts.dto;

public class ExecuteBankGuaranteedPaymentRemittanceTaskResponse {
    private org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask bankGuaranteedPaymentRemittanceTask;

    public void setBankGuaranteedPaymentRemittanceTask(org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask bankGuaranteedPaymentRemittanceTask) {
        this.bankGuaranteedPaymentRemittanceTask = bankGuaranteedPaymentRemittanceTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask getBankGuaranteedPaymentRemittanceTask() {
        return bankGuaranteedPaymentRemittanceTask;
    }
}