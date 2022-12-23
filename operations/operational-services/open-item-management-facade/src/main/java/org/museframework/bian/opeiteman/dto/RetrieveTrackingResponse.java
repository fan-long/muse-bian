package org.museframework.bian.opeiteman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTrackingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.opeiteman.dto.bq.Tracking tracking;

    public void setTracking(org.museframework.bian.opeiteman.dto.bq.Tracking tracking) {
        this.tracking = tracking;
    }

    public org.museframework.bian.opeiteman.dto.bq.Tracking getTracking() {
        return tracking;
    }
}