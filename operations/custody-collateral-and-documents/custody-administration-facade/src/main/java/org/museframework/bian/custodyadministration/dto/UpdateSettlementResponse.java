package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateSettlementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.custodyadministration.dto.bq.Settlement settlement;

    public void setSettlement(org.museframework.bian.custodyadministration.dto.bq.Settlement settlement) {
        this.settlement = settlement;
    }

    public org.museframework.bian.custodyadministration.dto.bq.Settlement getSettlement() {
        return settlement;
    }
}