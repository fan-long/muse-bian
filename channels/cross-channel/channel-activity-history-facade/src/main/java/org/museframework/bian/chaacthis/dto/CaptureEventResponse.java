package org.museframework.bian.chaacthis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureEventResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chaacthis.dto.bq.Event event;

    public void setEvent(org.museframework.bian.chaacthis.dto.bq.Event event) {
        this.event = event;
    }

    public org.museframework.bian.chaacthis.dto.bq.Event getEvent() {
        return event;
    }
}