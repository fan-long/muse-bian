package org.museframework.bian.regandlegaut.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestTroubleshootingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.regandlegaut.dto.bq.Troubleshooting troubleshooting;

    public void setTroubleshooting(org.museframework.bian.regandlegaut.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.regandlegaut.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}