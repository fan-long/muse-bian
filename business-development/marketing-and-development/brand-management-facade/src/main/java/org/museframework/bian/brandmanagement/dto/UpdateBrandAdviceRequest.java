package org.museframework.bian.brandmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBrandAdviceRequest {
    @MetaField
    private String brandmanagementid;

    @MetaField
    private String brandadviceid;

    @MetaField(ref=true)
    private org.museframework.bian.brandmanagement.dto.bq.BrandAdvice brandAdvice;

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

    public void setBrandAdvice(org.museframework.bian.brandmanagement.dto.bq.BrandAdvice brandAdvice) {
        this.brandAdvice = brandAdvice;
    }

    public org.museframework.bian.brandmanagement.dto.bq.BrandAdvice getBrandAdvice() {
        return brandAdvice;
    }
}