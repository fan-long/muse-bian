package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePointofServiceOperatingSessionRequest {
    @MetaField
    private String pointofserviceid;

    @MetaField(ref=true)
    private org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession pointofServiceOperatingSession;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setPointofServiceOperatingSession(org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession pointofServiceOperatingSession) {
        this.pointofServiceOperatingSession = pointofServiceOperatingSession;
    }

    public org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession getPointofServiceOperatingSession() {
        return pointofServiceOperatingSession;
    }
}