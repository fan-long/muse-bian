package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveSettlementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.meracqfac.dto.bq.Settlement settlement;

    public void setSettlement(org.museframework.bian.meracqfac.dto.bq.Settlement settlement) {
        this.settlement = settlement;
    }

    public org.museframework.bian.meracqfac.dto.bq.Settlement getSettlement() {
        return settlement;
    }
}