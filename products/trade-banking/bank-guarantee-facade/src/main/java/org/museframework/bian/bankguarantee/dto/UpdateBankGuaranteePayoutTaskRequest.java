package org.museframework.bian.bankguarantee.dto;

public class UpdateBankGuaranteePayoutTaskRequest {
    private String bankguaranteeid;

    private String bankguaranteepayouttaskid;

    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteePayoutTask bankGuaranteePayoutTask;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setBankguaranteepayouttaskid(String bankguaranteepayouttaskid) {
        this.bankguaranteepayouttaskid = bankguaranteepayouttaskid;
    }

    public String getBankguaranteepayouttaskid() {
        return bankguaranteepayouttaskid;
    }

    public void setBankGuaranteePayoutTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteePayoutTask bankGuaranteePayoutTask) {
        this.bankGuaranteePayoutTask = bankGuaranteePayoutTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteePayoutTask getBankGuaranteePayoutTask() {
        return bankGuaranteePayoutTask;
    }
}