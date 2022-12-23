package org.museframework.bian.bankguarantee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestBankGuaranteeDefinitionandPricingTaskRequest {
    @MetaField
    private String bankguaranteeid;

    @MetaField
    private String bankguaranteedefinitionandpricingtaskid;

    @MetaField(ref=true)
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