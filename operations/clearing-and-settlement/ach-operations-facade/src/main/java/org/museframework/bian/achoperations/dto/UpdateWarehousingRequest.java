package org.museframework.bian.achoperations.dto;

public class UpdateWarehousingRequest {
    private String achoperationsid;

    private String warehousingid;

    private org.museframework.bian.achoperations.dto.bq.Warehousing warehousing;

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

    public void setWarehousing(org.museframework.bian.achoperations.dto.bq.Warehousing warehousing) {
        this.warehousing = warehousing;
    }

    public org.museframework.bian.achoperations.dto.bq.Warehousing getWarehousing() {
        return warehousing;
    }
}