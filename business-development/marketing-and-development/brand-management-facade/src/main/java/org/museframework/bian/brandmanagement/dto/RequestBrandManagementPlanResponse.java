package org.museframework.bian.brandmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestBrandManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.brandmanagement.dto.cr.BrandManagementPlan brandManagementPlan;

    public void setBrandManagementPlan(org.museframework.bian.brandmanagement.dto.cr.BrandManagementPlan brandManagementPlan) {
        this.brandManagementPlan = brandManagementPlan;
    }

    public org.museframework.bian.brandmanagement.dto.cr.BrandManagementPlan getBrandManagementPlan() {
        return brandManagementPlan;
    }
}