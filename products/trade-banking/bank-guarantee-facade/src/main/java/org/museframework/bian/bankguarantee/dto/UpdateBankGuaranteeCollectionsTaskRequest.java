package org.museframework.bian.bankguarantee.dto;

public class UpdateBankGuaranteeCollectionsTaskRequest {
    private String bankguaranteeid;

    private String bankguaranteecollectionstaskid;

    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeCollectionsTask bankGuaranteeCollectionsTask;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setBankguaranteecollectionstaskid(String bankguaranteecollectionstaskid) {
        this.bankguaranteecollectionstaskid = bankguaranteecollectionstaskid;
    }

    public String getBankguaranteecollectionstaskid() {
        return bankguaranteecollectionstaskid;
    }

    public void setBankGuaranteeCollectionsTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeCollectionsTask bankGuaranteeCollectionsTask) {
        this.bankGuaranteeCollectionsTask = bankGuaranteeCollectionsTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeCollectionsTask getBankGuaranteeCollectionsTask() {
        return bankGuaranteeCollectionsTask;
    }
}