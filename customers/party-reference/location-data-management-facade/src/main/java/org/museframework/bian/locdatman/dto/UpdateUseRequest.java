package org.museframework.bian.locdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateUseRequest {
    @MetaField
    private String locationdatamanagementid;

    @MetaField
    private String useid;

    @MetaField(ref=true)
    private org.museframework.bian.locdatman.dto.bq.Use use;

    public void setLocationdatamanagementid(String locationdatamanagementid) {
        this.locationdatamanagementid = locationdatamanagementid;
    }

    public String getLocationdatamanagementid() {
        return locationdatamanagementid;
    }

    public void setUseid(String useid) {
        this.useid = useid;
    }

    public String getUseid() {
        return useid;
    }

    public void setUse(org.museframework.bian.locdatman.dto.bq.Use use) {
        this.use = use;
    }

    public org.museframework.bian.locdatman.dto.bq.Use getUse() {
        return use;
    }
}