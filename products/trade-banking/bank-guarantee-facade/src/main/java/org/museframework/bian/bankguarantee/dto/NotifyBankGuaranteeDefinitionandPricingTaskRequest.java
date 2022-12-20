package org.museframework.bian.bankguarantee.dto;

public class NotifyBankGuaranteeDefinitionandPricingTaskRequest {
    private String bankguaranteeid;

    private String bankguaranteedefinitionandpricingtaskid;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setBankguaranteedefinitionandpricingtaskid(String bankguaranteedefinitionandpricingtaskid) {
        this.bankguaranteedefinitionandpricingtaskid = bankguaranteedefinitionandpricingtaskid;
    }

    public String getBankguaranteedefinitionandpricingtaskid() {
        return bankguaranteedefinitionandpricingtaskid;
    }
}