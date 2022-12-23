package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateClearingandSettlementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.achoperations.dto.bq.ClearingandSettlement clearingandSettlement;

    public void setClearingandSettlement(org.museframework.bian.achoperations.dto.bq.ClearingandSettlement clearingandSettlement) {
        this.clearingandSettlement = clearingandSettlement;
    }

    public org.museframework.bian.achoperations.dto.bq.ClearingandSettlement getClearingandSettlement() {
        return clearingandSettlement;
    }
}