package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePointofServiceOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession pointofServiceOperatingSession;

    public void setPointofServiceOperatingSession(org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession pointofServiceOperatingSession) {
        this.pointofServiceOperatingSession = pointofServiceOperatingSession;
    }

    public org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession getPointofServiceOperatingSession() {
        return pointofServiceOperatingSession;
    }
}