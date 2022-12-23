package org.museframework.bian.cencashan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTrackingandAllocationRequest {
    @MetaField
    private String centralcashhandlingid;

    @MetaField
    private String trackingandallocationid;

    @MetaField(ref=true)
    private org.museframework.bian.cencashan.dto.bq.TrackingandAllocation trackingandAllocation;

    public void setCentralcashhandlingid(String centralcashhandlingid) {
        this.centralcashhandlingid = centralcashhandlingid;
    }

    public String getCentralcashhandlingid() {
        return centralcashhandlingid;
    }

    public void setTrackingandallocationid(String trackingandallocationid) {
        this.trackingandallocationid = trackingandallocationid;
    }

    public String getTrackingandallocationid() {
        return trackingandallocationid;
    }

    public void setTrackingandAllocation(org.museframework.bian.cencashan.dto.bq.TrackingandAllocation trackingandAllocation) {
        this.trackingandAllocation = trackingandAllocation;
    }

    public org.museframework.bian.cencashan.dto.bq.TrackingandAllocation getTrackingandAllocation() {
        return trackingandAllocation;
    }
}