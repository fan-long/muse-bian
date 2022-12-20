package org.museframework.bian.locdatman.dto;

public class UpdateUseRequest {
    private String locationdatamanagementid;

    private String useid;

    private org.museframework.bian.locdatman.dto.bq.Use use;

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

    public void setUse(org.museframework.bian.locdatman.dto.bq.Use use) {
        this.use = use;
    }

    public org.museframework.bian.locdatman.dto.bq.Use getUse() {
        return use;
    }
}