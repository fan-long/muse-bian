package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateInterestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.leasing.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.leasing.dto.bq.Interest getInterest() {
        return interest;
    }
}