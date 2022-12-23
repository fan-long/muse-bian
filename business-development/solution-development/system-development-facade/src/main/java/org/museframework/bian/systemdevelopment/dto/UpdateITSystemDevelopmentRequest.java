package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateITSystemDevelopmentRequest {
    @MetaField
    private String systemdevelopmentid;

    @MetaField(ref=true)
    private org.museframework.bian.systemdevelopment.dto.cr.ITSystemDevelopment iTSystemDevelopment;

    public void setSystemdevelopmentid(String systemdevelopmentid) {
        this.systemdevelopmentid = systemdevelopmentid;
    }

    public String getSystemdevelopmentid() {
        return systemdevelopmentid;
    }

    public void setiTSystemDevelopment(org.museframework.bian.systemdevelopment.dto.cr.ITSystemDevelopment iTSystemDevelopment) {
        this.iTSystemDevelopment = iTSystemDevelopment;
    }

    public org.museframework.bian.systemdevelopment.dto.cr.ITSystemDevelopment getiTSystemDevelopment() {
        return iTSystemDevelopment;
    }
}