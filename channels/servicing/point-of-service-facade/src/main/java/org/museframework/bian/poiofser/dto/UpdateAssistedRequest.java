package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAssistedRequest {
    @MetaField
    private String pointofserviceid;

    @MetaField
    private String assistedid;

    @MetaField(ref=true)
    private org.museframework.bian.poiofser.dto.bq.Assisted assisted;

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

    public void setAssisted(org.museframework.bian.poiofser.dto.bq.Assisted assisted) {
        this.assisted = assisted;
    }

    public org.museframework.bian.poiofser.dto.bq.Assisted getAssisted() {
        return assisted;
    }
}