package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateFeesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.custodyadministration.dto.bq.Fees fees;

    public void setFees(org.museframework.bian.custodyadministration.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.custodyadministration.dto.bq.Fees getFees() {
        return fees;
    }
}