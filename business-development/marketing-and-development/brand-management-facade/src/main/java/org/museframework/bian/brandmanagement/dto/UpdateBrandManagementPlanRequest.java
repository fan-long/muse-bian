package org.museframework.bian.brandmanagement.dto;

public class UpdateBrandManagementPlanRequest {
    private String brandmanagementid;

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