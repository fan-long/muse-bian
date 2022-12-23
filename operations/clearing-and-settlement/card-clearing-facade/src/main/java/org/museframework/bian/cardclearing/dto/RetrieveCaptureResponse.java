package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCaptureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardclearing.dto.bq.Capture capture;

    public void setCapture(org.museframework.bian.cardclearing.dto.bq.Capture capture) {
        this.capture = capture;
    }

    public org.museframework.bian.cardclearing.dto.bq.Capture getCapture() {
        return capture;
    }
}