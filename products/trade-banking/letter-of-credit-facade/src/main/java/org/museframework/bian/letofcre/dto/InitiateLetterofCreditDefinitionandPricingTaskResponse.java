package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateLetterofCreditDefinitionandPricingTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.letofcre.dto.bq.LetterofCreditDefinitionandPricingTask letterofCreditDefinitionandPricingTask;

    public void setLetterofCreditDefinitionandPricingTask(org.museframework.bian.letofcre.dto.bq.LetterofCreditDefinitionandPricingTask letterofCreditDefinitionandPricingTask) {
        this.letterofCreditDefinitionandPricingTask = letterofCreditDefinitionandPricingTask;
    }

    public org.museframework.bian.letofcre.dto.bq.LetterofCreditDefinitionandPricingTask getLetterofCreditDefinitionandPricingTask() {
        return letterofCreditDefinitionandPricingTask;
    }
}