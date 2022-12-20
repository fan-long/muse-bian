package org.museframework.bian.bankguarantee.dto;

public class NotifyBankGuaranteeIssuanceandBookingTaskResponse {
    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask bankGuaranteeIssuanceandBookingTask;

    public void setBankGuaranteeIssuanceandBookingTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask bankGuaranteeIssuanceandBookingTask) {
        this.bankGuaranteeIssuanceandBookingTask = bankGuaranteeIssuanceandBookingTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask getBankGuaranteeIssuanceandBookingTask() {
        return bankGuaranteeIssuanceandBookingTask;
    }
}