package org.museframework.bian.brandmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBrandAdviceRequest {
    @MetaField
    private String brandmanagementid;

    @MetaField
    private String brandadviceid;

    public void setBrandmanagementid(String brandmanagementid) {
        this.brandmanagementid = brandmanagementid;
    }

    public String getBrandmanagementid() {
        return brandmanagementid;
    }

    public void setBrandadviceid(String brandadviceid) {
        this.brandadviceid = brandadviceid;
    }

    public String getBrandadviceid() {
        return brandadviceid;
    }
}