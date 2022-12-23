package org.museframework.bian.carterope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCaptureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carterope.dto.bq.Capture capture;

    public void setCapture(org.museframework.bian.carterope.dto.bq.Capture capture) {
        this.capture = capture;
    }

    public org.museframework.bian.carterope.dto.bq.Capture getCapture() {
        return capture;
    }
}