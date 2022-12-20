package org.museframework.bian.busuniman.dto;

public class CreateBusinessUnitManagementPlanRequest {
    private org.museframework.bian.busuniman.dto.cr.BusinessUnitManagementPlan businessUnitManagementPlan;

    public void setBusinessUnitManagementPlan(org.museframework.bian.busuniman.dto.cr.BusinessUnitManagementPlan businessUnitManagementPlan) {
        this.businessUnitManagementPlan = businessUnitManagementPlan;
    }

    public org.museframework.bian.busuniman.dto.cr.BusinessUnitManagementPlan getBusinessUnitManagementPlan() {
        return businessUnitManagementPlan;
    }
}