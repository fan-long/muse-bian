package org.museframework.bian.achoperations.dto;

public class RetrieveWarehousingRequest {
    private String achoperationsid;

    private String warehousingid;

    public void setAchoperationsid(String achoperationsid) {
        this.achoperationsid = achoperationsid;
    }

    public String getAchoperationsid() {
        return achoperationsid;
    }

    public void setWarehousingid(String warehousingid) {
        this.warehousingid = warehousingid;
    }

    public String getWarehousingid() {
        return warehousingid;
    }
}