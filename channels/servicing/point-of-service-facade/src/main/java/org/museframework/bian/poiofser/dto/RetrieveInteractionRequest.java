package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInteractionRequest {
    @MetaField
    private String pointofserviceid;

    @MetaField
    private String interactionid;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setInteractionid(String interactionid) {
        this.interactionid = interactionid;
    }

    public String getInteractionid() {
        return interactionid;
    }
}