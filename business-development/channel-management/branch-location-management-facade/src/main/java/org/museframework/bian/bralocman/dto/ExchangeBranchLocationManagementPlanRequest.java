package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeBranchLocationManagementPlanRequest {
    @MetaField
    private String branchlocationmanagementid;

    @MetaField(ref=true)
    private org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan branchLocationManagementPlan;

    public void setBranchlocationmanagementid(String branchlocationmanagementid) {
        this.branchlocationmanagementid = branchlocationmanagementid;
    }

    public String getBranchlocationmanagementid() {
        return branchlocationmanagementid;
    }

    public void setBranchLocationManagementPlan(org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan branchLocationManagementPlan) {
        this.branchLocationManagementPlan = branchLocationManagementPlan;
    }

    public org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan getBranchLocationManagementPlan() {
        return branchLocationManagementPlan;
    }
}