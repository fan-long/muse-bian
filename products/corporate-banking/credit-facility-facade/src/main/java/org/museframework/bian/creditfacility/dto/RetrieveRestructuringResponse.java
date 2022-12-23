package org.museframework.bian.creditfacility.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveRestructuringResponse {
    @MetaField(ref=true)
    private org.museframework.bian.creditfacility.dto.bq.Restructuring restructuring;

    public void setRestructuring(org.museframework.bian.creditfacility.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.creditfacility.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}