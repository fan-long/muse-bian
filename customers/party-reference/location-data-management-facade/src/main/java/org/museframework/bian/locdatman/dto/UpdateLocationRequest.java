package org.museframework.bian.locdatman.dto;

public class UpdateLocationRequest {
    private String locationdatamanagementid;

    private String locationid;

    private org.museframework.bian.locdatman.dto.bq.Location location;

    public void setLocationdatamanagementid(String locationdatamanagementid) {
        this.locationdatamanagementid = locationdatamanagementid;
    }

    public String getLocationdatamanagementid() {
        return locationdatamanagementid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocation(org.museframework.bian.locdatman.dto.bq.Location location) {
        this.location = location;
    }

    public org.museframework.bian.locdatman.dto.bq.Location getLocation() {
        return location;
    }
}