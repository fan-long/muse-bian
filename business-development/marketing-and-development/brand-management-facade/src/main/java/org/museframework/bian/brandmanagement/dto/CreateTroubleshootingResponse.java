package org.museframework.bian.brandmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CreateTroubleshootingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.brandmanagement.dto.bq.Troubleshooting troubleshooting;

    public void setTroubleshooting(org.museframework.bian.brandmanagement.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.brandmanagement.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}