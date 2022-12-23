package org.museframework.bian.systemsadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateITSystemAdministrativePlanRequest {
    @MetaField
    private String systemsadministrationid;

    @MetaField(ref=true)
    private org.museframework.bian.systemsadministration.dto.cr.ITSystemAdministrativePlan iTSystemAdministrativePlan;

    public void setSystemsadministrationid(String systemsadministrationid) {
        this.systemsadministrationid = systemsadministrationid;
    }

    public String getSystemsadministrationid() {
        return systemsadministrationid;
    }

    public void setiTSystemAdministrativePlan(org.museframework.bian.systemsadministration.dto.cr.ITSystemAdministrativePlan iTSystemAdministrativePlan) {
        this.iTSystemAdministrativePlan = iTSystemAdministrativePlan;
    }

    public org.museframework.bian.systemsadministration.dto.cr.ITSystemAdministrativePlan getiTSystemAdministrativePlan() {
        return iTSystemAdministrativePlan;
    }
}