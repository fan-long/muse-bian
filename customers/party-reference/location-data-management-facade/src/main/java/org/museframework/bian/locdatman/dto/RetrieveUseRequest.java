package org.museframework.bian.locdatman.dto;

public class RetrieveUseRequest {
    private String locationdatamanagementid;

    private String useid;

    public void setLocationdatamanagementid(String locationdatamanagementid) {
        this.locationdatamanagementid = locationdatamanagementid;
    }

    public String getLocationdatamanagementid() {
        return locationdatamanagementid;
    }

    public void setUseid(String useid) {
        this.useid = useid;
    }

    public String getUseid() {
        return useid;
    }
}