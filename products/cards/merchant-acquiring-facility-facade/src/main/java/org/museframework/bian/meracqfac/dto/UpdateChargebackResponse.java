package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateChargebackResponse {
    @MetaField(ref=true)
    private org.museframework.bian.meracqfac.dto.bq.Chargeback chargeback;

    public void setChargeback(org.museframework.bian.meracqfac.dto.bq.Chargeback chargeback) {
        this.chargeback = chargeback;
    }

    public org.museframework.bian.meracqfac.dto.bq.Chargeback getChargeback() {
        return chargeback;
    }
}