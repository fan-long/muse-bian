package org.museframework.bian.bankguarantee.dto;

public class UpdateBankGuaranteeIssuanceandBookingTaskRequest {
    private String bankguaranteeid;

    private String bankguaranteeissuanceandbookingtaskid;

    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask bankGuaranteeIssuanceandBookingTask;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setBankguaranteeissuanceandbookingtaskid(String bankguaranteeissuanceandbookingtaskid) {
        this.bankguaranteeissuanceandbookingtaskid = bankguaranteeissuanceandbookingtaskid;
    }

    public String getBankguaranteeissuanceandbookingtaskid() {
        return bankguaranteeissuanceandbookingtaskid;
    }

    public void setBankGuaranteeIssuanceandBookingTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask bankGuaranteeIssuanceandBookingTask) {
        this.bankGuaranteeIssuanceandBookingTask = bankGuaranteeIssuanceandBookingTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask getBankGuaranteeIssuanceandBookingTask() {
        return bankGuaranteeIssuanceandBookingTask;
    }
}