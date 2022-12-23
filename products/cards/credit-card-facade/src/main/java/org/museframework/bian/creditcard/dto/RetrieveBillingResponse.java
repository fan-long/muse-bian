package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveBillingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.creditcard.dto.bq.Billing billing;

    public void setBilling(org.museframework.bian.creditcard.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.creditcard.dto.bq.Billing getBilling() {
        return billing;
    }
}