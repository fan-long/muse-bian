package org.museframework.bian.leaiteadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateValuationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leaiteadm.dto.bq.Valuation valuation;

    public void setValuation(org.museframework.bian.leaiteadm.dto.bq.Valuation valuation) {
        this.valuation = valuation;
    }

    public org.museframework.bian.leaiteadm.dto.bq.Valuation getValuation() {
        return valuation;
    }
}