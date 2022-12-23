package org.museframework.bian.rewpoiacc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureCaptureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.rewpoiacc.dto.bq.Capture capture;

    public void setCapture(org.museframework.bian.rewpoiacc.dto.bq.Capture capture) {
        this.capture = capture;
    }

    public org.museframework.bian.rewpoiacc.dto.bq.Capture getCapture() {
        return capture;
    }
}