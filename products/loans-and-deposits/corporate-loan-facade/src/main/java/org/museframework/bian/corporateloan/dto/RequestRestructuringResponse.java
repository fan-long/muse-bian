package org.museframework.bian.corporateloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestRestructuringResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateloan.dto.bq.Restructuring restructuring;

    public void setRestructuring(org.museframework.bian.corporateloan.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.corporateloan.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}