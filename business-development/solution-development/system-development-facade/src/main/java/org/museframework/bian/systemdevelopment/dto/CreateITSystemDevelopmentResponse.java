package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CreateITSystemDevelopmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.systemdevelopment.dto.cr.ITSystemDevelopment iTSystemDevelopment;

    public void setiTSystemDevelopment(org.museframework.bian.systemdevelopment.dto.cr.ITSystemDevelopment iTSystemDevelopment) {
        this.iTSystemDevelopment = iTSystemDevelopment;
    }

    public org.museframework.bian.systemdevelopment.dto.cr.ITSystemDevelopment getiTSystemDevelopment() {
        return iTSystemDevelopment;
    }
}