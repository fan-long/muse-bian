package org.museframework.bian.colassadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CreateValuationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.colassadm.dto.bq.Valuation valuation;

    public void setValuation(org.museframework.bian.colassadm.dto.bq.Valuation valuation) {
        this.valuation = valuation;
    }

    public org.museframework.bian.colassadm.dto.bq.Valuation getValuation() {
        return valuation;
    }
}