package org.museframework.bian.brandmanagement.dto;

public class UpdateBrandManagementPlanResponse {
    private org.museframework.bian.brandmanagement.dto.cr.BrandManagementPlan brandManagementPlan;

    public void setBrandManagementPlan(org.museframework.bian.brandmanagement.dto.cr.BrandManagementPlan brandManagementPlan) {
        this.brandManagementPlan = brandManagementPlan;
    }

    public org.museframework.bian.brandmanagement.dto.cr.BrandManagementPlan getBrandManagementPlan() {
        return brandManagementPlan;
    }
}