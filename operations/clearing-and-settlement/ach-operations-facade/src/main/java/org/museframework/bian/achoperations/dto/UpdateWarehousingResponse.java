package org.museframework.bian.achoperations.dto;

public class UpdateWarehousingResponse {
    private org.museframework.bian.achoperations.dto.bq.Warehousing warehousing;

    public void setWarehousing(org.museframework.bian.achoperations.dto.bq.Warehousing warehousing) {
        this.warehousing = warehousing;
    }

    public org.museframework.bian.achoperations.dto.bq.Warehousing getWarehousing() {
        return warehousing;
    }
}