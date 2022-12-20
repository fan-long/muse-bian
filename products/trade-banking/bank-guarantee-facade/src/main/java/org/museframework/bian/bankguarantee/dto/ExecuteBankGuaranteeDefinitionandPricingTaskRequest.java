package org.museframework.bian.bankguarantee.dto;

public class ExecuteBankGuaranteeDefinitionandPricingTaskRequest {
    private String bankguaranteeid;

    private String bankguaranteedefinitionandpricingtaskid;

    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeDefinitionandPricingTask bankGuaranteeDefinitionandPricingTask;

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

    public void setBankGuaranteeDefinitionandPricingTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeDefinitionandPricingTask bankGuaranteeDefinitionandPricingTask) {
        this.bankGuaranteeDefinitionandPricingTask = bankGuaranteeDefinitionandPricingTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeDefinitionandPricingTask getBankGuaranteeDefinitionandPricingTask() {
        return bankGuaranteeDefinitionandPricingTask;
    }
}