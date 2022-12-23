package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateInterestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.mortgageloan.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Interest getInterest() {
        return interest;
    }
}