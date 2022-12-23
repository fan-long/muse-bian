package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateBillingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.Billing billing;

    public void setBilling(org.museframework.bian.merchandisingloan.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Billing getBilling() {
        return billing;
    }
}