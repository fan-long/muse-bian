package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAddressingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardclearing.dto.bq.Addressing addressing;

    public void setAddressing(org.museframework.bian.cardclearing.dto.bq.Addressing addressing) {
        this.addressing = addressing;
    }

    public org.museframework.bian.cardclearing.dto.bq.Addressing getAddressing() {
        return addressing;
    }
}