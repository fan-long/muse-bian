package org.museframework.bian.bankguarantee.dto;

public class NotifyBankGuaranteeCollectionsTaskResponse {
    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeCollectionsTask bankGuaranteeCollectionsTask;

    public void setBankGuaranteeCollectionsTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeCollectionsTask bankGuaranteeCollectionsTask) {
        this.bankGuaranteeCollectionsTask = bankGuaranteeCollectionsTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeCollectionsTask getBankGuaranteeCollectionsTask() {
        return bankGuaranteeCollectionsTask;
    }
}