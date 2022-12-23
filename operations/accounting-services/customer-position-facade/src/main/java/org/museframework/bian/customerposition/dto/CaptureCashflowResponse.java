package org.museframework.bian.customerposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureCashflowResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerposition.dto.bq.Cashflow cashflow;

    public void setCashflow(org.museframework.bian.customerposition.dto.bq.Cashflow cashflow) {
        this.cashflow = cashflow;
    }

    public org.museframework.bian.customerposition.dto.bq.Cashflow getCashflow() {
        return cashflow;
    }
}