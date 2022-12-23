package org.museframework.bian.virtualaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeInterestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.virtualaccount.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.virtualaccount.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.virtualaccount.dto.bq.Interest getInterest() {
        return interest;
    }
}