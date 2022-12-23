package org.museframework.bian.busuniman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBusinessUnitManagementPlanRequest {
    @MetaField
    private String businessunitmanagementid;

    @MetaField(ref=true)
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