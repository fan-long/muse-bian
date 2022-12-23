package org.museframework.bian.bankguarantee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteBankGuaranteeDefinitionandPricingTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeDefinitionandPricingTask bankGuaranteeDefinitionandPricingTask;

    public void setBankGuaranteeDefinitionandPricingTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeDefinitionandPricingTask bankGuaranteeDefinitionandPricingTask) {
        this.bankGuaranteeDefinitionandPricingTask = bankGuaranteeDefinitionandPricingTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeDefinitionandPricingTask getBankGuaranteeDefinitionandPricingTask() {
        return bankGuaranteeDefinitionandPricingTask;
    }
}