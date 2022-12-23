package org.museframework.bian.loan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveInterestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.loan.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.loan.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.loan.dto.bq.Interest getInterest() {
        return interest;
    }
}