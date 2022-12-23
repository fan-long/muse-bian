package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateMailingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proinvdis.dto.bq.Mailing mailing;

    public void setMailing(org.museframework.bian.proinvdis.dto.bq.Mailing mailing) {
        this.mailing = mailing;
    }

    public org.museframework.bian.proinvdis.dto.bq.Mailing getMailing() {
        return mailing;
    }
}