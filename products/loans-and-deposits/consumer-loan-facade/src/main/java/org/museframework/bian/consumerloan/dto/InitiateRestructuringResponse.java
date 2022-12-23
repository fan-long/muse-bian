package org.museframework.bian.consumerloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateRestructuringResponse {
    @MetaField(ref=true)
    private org.museframework.bian.consumerloan.dto.bq.Restructuring restructuring;

    public void setRestructuring(org.museframework.bian.consumerloan.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.consumerloan.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}