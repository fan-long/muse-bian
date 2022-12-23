package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTechnicalSpecificationRequest {
    @MetaField
    private String systemdevelopmentid;

    @MetaField
    private String technicalspecificationid;

    public void setSystemdevelopmentid(String systemdevelopmentid) {
        this.systemdevelopmentid = systemdevelopmentid;
    }

    public String getSystemdevelopmentid() {
        return systemdevelopmentid;
    }

    public void setTechnicalspecificationid(String technicalspecificationid) {
        this.technicalspecificationid = technicalspecificationid;
    }

    public String getTechnicalspecificationid() {
        return technicalspecificationid;
    }
}