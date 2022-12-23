package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateBillingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Billing billing;

    public void setBilling(org.museframework.bian.mortgageloan.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Billing getBilling() {
        return billing;
    }
}