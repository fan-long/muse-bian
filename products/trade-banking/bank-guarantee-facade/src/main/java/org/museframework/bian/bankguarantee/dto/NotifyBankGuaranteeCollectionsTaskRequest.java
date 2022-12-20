package org.museframework.bian.bankguarantee.dto;

public class NotifyBankGuaranteeCollectionsTaskRequest {
    private String bankguaranteeid;

    private String bankguaranteecollectionstaskid;

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
}