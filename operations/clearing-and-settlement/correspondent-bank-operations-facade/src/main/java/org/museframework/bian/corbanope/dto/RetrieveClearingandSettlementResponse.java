package org.museframework.bian.corbanope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveClearingandSettlementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corbanope.dto.bq.ClearingandSettlement clearingandSettlement;

    public void setClearingandSettlement(org.museframework.bian.corbanope.dto.bq.ClearingandSettlement clearingandSettlement) {
        this.clearingandSettlement = clearingandSettlement;
    }

    public org.museframework.bian.corbanope.dto.bq.ClearingandSettlement getClearingandSettlement() {
        return clearingandSettlement;
    }
}