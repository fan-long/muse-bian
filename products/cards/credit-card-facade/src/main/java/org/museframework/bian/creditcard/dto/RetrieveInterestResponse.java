package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveInterestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.creditcard.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.creditcard.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.creditcard.dto.bq.Interest getInterest() {
        return interest;
    }
}