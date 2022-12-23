package org.museframework.bian.segmentdirection.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInitiativeRequest {
    @MetaField
    private String segmentdirectionid;

    @MetaField
    private String initiativeid;

    @MetaField(ref=true)
    private org.museframework.bian.segmentdirection.dto.bq.Initiative initiative;

    public void setSegmentdirectionid(String segmentdirectionid) {
        this.segmentdirectionid = segmentdirectionid;
    }

    public String getSegmentdirectionid() {
        return segmentdirectionid;
    }

    public void setInitiativeid(String initiativeid) {
        this.initiativeid = initiativeid;
    }

    public String getInitiativeid() {
        return initiativeid;
    }

    public void setInitiative(org.museframework.bian.segmentdirection.dto.bq.Initiative initiative) {
        this.initiative = initiative;
    }

    public org.museframework.bian.segmentdirection.dto.bq.Initiative getInitiative() {
        return initiative;
    }
}