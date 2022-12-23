package org.museframework.bian.merchantrelations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyOperationalTermResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merchantrelations.dto.bq.OperationalTerm operationalTerm;

    public void setOperationalTerm(org.museframework.bian.merchantrelations.dto.bq.OperationalTerm operationalTerm) {
        this.operationalTerm = operationalTerm;
    }

    public org.museframework.bian.merchantrelations.dto.bq.OperationalTerm getOperationalTerm() {
        return operationalTerm;
    }
}