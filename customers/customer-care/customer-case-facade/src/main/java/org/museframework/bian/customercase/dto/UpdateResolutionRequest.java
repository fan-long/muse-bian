package org.museframework.bian.customercase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateResolutionRequest {
    @MetaField
    private String customercaseid;

    @MetaField
    private String resolutionid;

    @MetaField(ref=true)
    private org.museframework.bian.customercase.dto.bq.Resolution resolution;

    public void setCustomercaseid(String customercaseid) {
        this.customercaseid = customercaseid;
    }

    public String getCustomercaseid() {
        return customercaseid;
    }

    public void setResolutionid(String resolutionid) {
        this.resolutionid = resolutionid;
    }

    public String getResolutionid() {
        return resolutionid;
    }

    public void setResolution(org.museframework.bian.customercase.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.customercase.dto.bq.Resolution getResolution() {
        return resolution;
    }
}