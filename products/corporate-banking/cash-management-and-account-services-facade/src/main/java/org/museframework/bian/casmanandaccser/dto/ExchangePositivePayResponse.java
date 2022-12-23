package org.museframework.bian.casmanandaccser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangePositivePayResponse {
    @MetaField(ref=true)
    private org.museframework.bian.casmanandaccser.dto.bq.PositivePay positivePay;

    public void setPositivePay(org.museframework.bian.casmanandaccser.dto.bq.PositivePay positivePay) {
        this.positivePay = positivePay;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.PositivePay getPositivePay() {
        return positivePay;
    }
}