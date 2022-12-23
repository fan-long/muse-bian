package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteCashPositionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.poiofser.dto.bq.CashPosition cashPosition;

    public void setCashPosition(org.museframework.bian.poiofser.dto.bq.CashPosition cashPosition) {
        this.cashPosition = cashPosition;
    }

    public org.museframework.bian.poiofser.dto.bq.CashPosition getCashPosition() {
        return cashPosition;
    }
}