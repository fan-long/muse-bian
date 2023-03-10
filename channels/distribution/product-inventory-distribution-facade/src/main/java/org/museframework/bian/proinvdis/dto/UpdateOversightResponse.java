package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateOversightResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proinvdis.dto.bq.Oversight oversight;

    public void setOversight(org.museframework.bian.proinvdis.dto.bq.Oversight oversight) {
        this.oversight = oversight;
    }

    public org.museframework.bian.proinvdis.dto.bq.Oversight getOversight() {
        return oversight;
    }
}