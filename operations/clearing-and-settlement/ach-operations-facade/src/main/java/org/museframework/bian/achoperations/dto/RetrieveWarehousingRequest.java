package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveWarehousingRequest {
    @MetaField
    private String achoperationsid;

    @MetaField
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