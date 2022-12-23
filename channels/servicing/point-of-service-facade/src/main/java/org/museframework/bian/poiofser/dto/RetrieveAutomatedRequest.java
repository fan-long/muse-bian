package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAutomatedRequest {
    @MetaField
    private String pointofserviceid;

    @MetaField
    private String automatedid;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setAutomatedid(String automatedid) {
        this.automatedid = automatedid;
    }

    public String getAutomatedid() {
        return automatedid;
    }
}