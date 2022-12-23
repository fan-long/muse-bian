package org.museframework.bian.busuniman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateTroubleshootingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.busuniman.dto.bq.Troubleshooting troubleshooting;

    public void setTroubleshooting(org.museframework.bian.busuniman.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.busuniman.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}