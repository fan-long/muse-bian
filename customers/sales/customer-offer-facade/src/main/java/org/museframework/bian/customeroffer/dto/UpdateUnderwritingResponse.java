package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateUnderwritingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Underwriting underwriting;

    public void setUnderwriting(org.museframework.bian.customeroffer.dto.bq.Underwriting underwriting) {
        this.underwriting = underwriting;
    }

    public org.museframework.bian.customeroffer.dto.bq.Underwriting getUnderwriting() {
        return underwriting;
    }
}