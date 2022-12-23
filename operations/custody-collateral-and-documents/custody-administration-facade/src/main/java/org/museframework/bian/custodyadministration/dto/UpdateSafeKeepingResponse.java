package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateSafeKeepingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.custodyadministration.dto.bq.SafeKeeping safeKeeping;

    public void setSafeKeeping(org.museframework.bian.custodyadministration.dto.bq.SafeKeeping safeKeeping) {
        this.safeKeeping = safeKeeping;
    }

    public org.museframework.bian.custodyadministration.dto.bq.SafeKeeping getSafeKeeping() {
        return safeKeeping;
    }
}