package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveLetterofCreditDefinitionandPricingTaskRequest {
    @MetaField
    private String letterofcreditid;

    @MetaField
    private String letterofcreditdefinitionandpricingtaskid;

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
}