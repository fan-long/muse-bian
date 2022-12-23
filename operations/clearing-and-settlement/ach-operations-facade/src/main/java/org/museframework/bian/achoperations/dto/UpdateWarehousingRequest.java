package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateWarehousingRequest {
    @MetaField
    private String achoperationsid;

    @MetaField
    private String warehousingid;

    @MetaField(ref=true)
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