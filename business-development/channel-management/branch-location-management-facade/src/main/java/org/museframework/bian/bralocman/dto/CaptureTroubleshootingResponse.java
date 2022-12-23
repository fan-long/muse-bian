package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureTroubleshootingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bralocman.dto.bq.Troubleshooting troubleshooting;

    public void setTroubleshooting(org.museframework.bian.bralocman.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.bralocman.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}