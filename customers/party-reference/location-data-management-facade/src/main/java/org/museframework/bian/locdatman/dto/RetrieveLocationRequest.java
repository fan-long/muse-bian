package org.museframework.bian.locdatman.dto;

public class RetrieveLocationRequest {
    private String locationdatamanagementid;

    private String locationid;

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
}