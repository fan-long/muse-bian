package org.museframework.bian.loan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateRestructuringResponse {
    @MetaField(ref=true)
    private org.museframework.bian.loan.dto.bq.Restructuring restructuring;

    public void setRestructuring(org.museframework.bian.loan.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.loan.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}