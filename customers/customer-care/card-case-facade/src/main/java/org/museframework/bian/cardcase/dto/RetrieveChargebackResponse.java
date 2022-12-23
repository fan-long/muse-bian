package org.museframework.bian.cardcase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveChargebackResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardcase.dto.bq.Chargeback chargeback;

    public void setChargeback(org.museframework.bian.cardcase.dto.bq.Chargeback chargeback) {
        this.chargeback = chargeback;
    }

    public org.museframework.bian.cardcase.dto.bq.Chargeback getChargeback() {
        return chargeback;
    }
}