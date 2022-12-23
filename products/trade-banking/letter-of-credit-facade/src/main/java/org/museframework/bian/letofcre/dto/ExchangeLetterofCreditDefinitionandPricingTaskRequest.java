package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeLetterofCreditDefinitionandPricingTaskRequest {
    @MetaField
    private String letterofcreditid;

    @MetaField
    private String letterofcreditdefinitionandpricingtaskid;

    @MetaField(ref=true)
    private org.museframework.bian.letofcre.dto.bq.LetterofCreditDefinitionandPricingTask letterofCreditDefinitionandPricingTask;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setLetterofcreditdefinitionandpricingtaskid(String letterofcreditdefinitionandpricingtaskid) {
        this.letterofcreditdefinitionandpricingtaskid = letterofcreditdefinitionandpricingtaskid;
    }

    public String getLetterofcreditdefinitionandpricingtaskid() {
        return letterofcreditdefinitionandpricingtaskid;
    }

    public void setLetterofCreditDefinitionandPricingTask(org.museframework.bian.letofcre.dto.bq.LetterofCreditDefinitionandPricingTask letterofCreditDefinitionandPricingTask) {
        this.letterofCreditDefinitionandPricingTask = letterofCreditDefinitionandPricingTask;
    }

    public org.museframework.bian.letofcre.dto.bq.LetterofCreditDefinitionandPricingTask getLetterofCreditDefinitionandPricingTask() {
        return letterofCreditDefinitionandPricingTask;
    }
}