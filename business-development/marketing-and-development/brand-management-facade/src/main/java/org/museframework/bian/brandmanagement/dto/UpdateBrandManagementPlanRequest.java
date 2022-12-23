package org.museframework.bian.brandmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBrandManagementPlanRequest {
    @MetaField
    private String brandmanagementid;

    @MetaField(ref=true)
    private org.museframework.bian.brandmanagement.dto.cr.BrandManagementPlan brandManagementPlan;

    public void setBrandmanagementid(String brandmanagementid) {
        this.brandmanagementid = brandmanagementid;
    }

    public String getBrandmanagementid() {
        return brandmanagementid;
    }

    public void setBrandManagementPlan(org.museframework.bian.brandmanagement.dto.cr.BrandManagementPlan brandManagementPlan) {
        this.brandManagementPlan = brandManagementPlan;
    }

    public org.museframework.bian.brandmanagement.dto.cr.BrandManagementPlan getBrandManagementPlan() {
        return brandManagementPlan;
    }
}