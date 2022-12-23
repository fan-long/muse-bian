package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAssistedRequest {
    @MetaField
    private String pointofserviceid;

    @MetaField
    private String assistedid;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setAssistedid(String assistedid) {
        this.assistedid = assistedid;
    }

    public String getAssistedid() {
        return assistedid;
    }
}