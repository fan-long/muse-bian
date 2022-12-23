package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureBranchLocationManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan branchLocationManagementPlan;

    public void setBranchLocationManagementPlan(org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan branchLocationManagementPlan) {
        this.branchLocationManagementPlan = branchLocationManagementPlan;
    }

    public org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan getBranchLocationManagementPlan() {
        return branchLocationManagementPlan;
    }
}