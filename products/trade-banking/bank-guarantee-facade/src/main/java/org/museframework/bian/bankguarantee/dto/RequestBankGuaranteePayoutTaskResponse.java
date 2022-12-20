package org.museframework.bian.bankguarantee.dto;

public class RequestBankGuaranteePayoutTaskResponse {
    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteePayoutTask bankGuaranteePayoutTask;

    public void setBankGuaranteePayoutTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteePayoutTask bankGuaranteePayoutTask) {
        this.bankGuaranteePayoutTask = bankGuaranteePayoutTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteePayoutTask getBankGuaranteePayoutTask() {
        return bankGuaranteePayoutTask;
    }
}