package org.museframework.bian.bankguarantee.dto;

public class NotifyBankGuaranteeIssuanceandBookingTaskRequest {
    private String bankguaranteeid;

    private String bankguaranteeissuanceandbookingtaskid;

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
}