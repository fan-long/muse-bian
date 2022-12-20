package org.museframework.bian.locdatman.dto;

public class RetrieveOccupancyRequest {
    private String locationdatamanagementid;

    private String occupancyid;

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
}