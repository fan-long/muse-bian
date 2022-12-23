package org.museframework.bian.cencashan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureTrackingandAllocationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cencashan.dto.bq.TrackingandAllocation trackingandAllocation;

    public void setTrackingandAllocation(org.museframework.bian.cencashan.dto.bq.TrackingandAllocation trackingandAllocation) {
        this.trackingandAllocation = trackingandAllocation;
    }

    public org.museframework.bian.cencashan.dto.bq.TrackingandAllocation getTrackingandAllocation() {
        return trackingandAllocation;
    }
}