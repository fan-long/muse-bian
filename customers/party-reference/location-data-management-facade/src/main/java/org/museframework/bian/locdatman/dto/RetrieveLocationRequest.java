package org.museframework.bian.locdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveLocationRequest {
    @MetaField
    private String locationdatamanagementid;

    @MetaField
    private String locationid;

    public void setLocationdatamanagementid(String locationdatamanagementid) {
        this.locationdatamanagementid = locationdatamanagementid;
    }

    public String getLocationdatamanagementid() {
        return locationdatamanagementid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    public String getLocationid() {
        return locationid;
    }
}