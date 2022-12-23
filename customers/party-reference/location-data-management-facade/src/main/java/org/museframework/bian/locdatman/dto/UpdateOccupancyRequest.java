package org.museframework.bian.locdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateOccupancyRequest {
    @MetaField
    private String locationdatamanagementid;

    @MetaField
    private String occupancyid;

    @MetaField(ref=true)
    private org.museframework.bian.locdatman.dto.bq.Occupancy occupancy;

    public void setLocationdatamanagementid(String locationdatamanagementid) {
        this.locationdatamanagementid = locationdatamanagementid;
    }

    public String getLocationdatamanagementid() {
        return locationdatamanagementid;
    }

    public void setOccupancyid(String occupancyid) {
        this.occupancyid = occupancyid;
    }

    public String getOccupancyid() {
        return occupancyid;
    }

    public void setOccupancy(org.museframework.bian.locdatman.dto.bq.Occupancy occupancy) {
        this.occupancy = occupancy;
    }

    public org.museframework.bian.locdatman.dto.bq.Occupancy getOccupancy() {
        return occupancy;
    }
}