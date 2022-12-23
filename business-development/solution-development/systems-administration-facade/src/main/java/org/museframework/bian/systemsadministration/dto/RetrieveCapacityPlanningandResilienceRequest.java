package org.museframework.bian.systemsadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCapacityPlanningandResilienceRequest {
    @MetaField
    private String systemsadministrationid;

    @MetaField
    private String capacityplanningandresilienceid;

    public void setSystemsadministrationid(String systemsadministrationid) {
        this.systemsadministrationid = systemsadministrationid;
    }

    public String getSystemsadministrationid() {
        return systemsadministrationid;
    }

    public void setCapacityplanningandresilienceid(String capacityplanningandresilienceid) {
        this.capacityplanningandresilienceid = capacityplanningandresilienceid;
    }

    public String getCapacityplanningandresilienceid() {
        return capacityplanningandresilienceid;
    }
}