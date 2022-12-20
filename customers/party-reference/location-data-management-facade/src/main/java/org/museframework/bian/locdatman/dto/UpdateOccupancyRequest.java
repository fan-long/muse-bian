package org.museframework.bian.locdatman.dto;

public class UpdateOccupancyRequest {
    private String locationdatamanagementid;

    private String occupancyid;

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