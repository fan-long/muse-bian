package org.museframework.bian.cencashan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTrackingandAllocationRequest {
    @MetaField
    private String centralcashhandlingid;

    @MetaField
    private String trackingandallocationid;

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
}