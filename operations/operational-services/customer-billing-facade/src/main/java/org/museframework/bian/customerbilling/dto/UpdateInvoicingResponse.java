package org.museframework.bian.customerbilling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateInvoicingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerbilling.dto.bq.Invoicing invoicing;

    public void setInvoicing(org.museframework.bian.customerbilling.dto.bq.Invoicing invoicing) {
        this.invoicing = invoicing;
    }

    public org.museframework.bian.customerbilling.dto.bq.Invoicing getInvoicing() {
        return invoicing;
    }
}