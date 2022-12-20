package org.museframework.bian.busuniman.dto;

public class UpdateBusinessUnitManagementPlanRequest {
    private String businessunitmanagementid;

    private org.museframework.bian.busuniman.dto.cr.BusinessUnitManagementPlan businessUnitManagementPlan;

    public void setBusinessunitmanagementid(String businessunitmanagementid) {
        this.businessunitmanagementid = businessunitmanagementid;
    }

    public String getBusinessunitmanagementid() {
        return businessunitmanagementid;
    }

    public void setBusinessUnitManagementPlan(org.museframework.bian.busuniman.dto.cr.BusinessUnitManagementPlan businessUnitManagementPlan) {
        this.businessUnitManagementPlan = businessUnitManagementPlan;
    }

    public org.museframework.bian.busuniman.dto.cr.BusinessUnitManagementPlan getBusinessUnitManagementPlan() {
        return businessUnitManagementPlan;
    }
}