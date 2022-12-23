package org.museframework.bian.bralocope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreateBranchLocationAdministrativePlanRequest {
    @MetaField(ref=true)
    private org.museframework.bian.bralocope.dto.cr.BranchLocationAdministrativePlan branchLocationAdministrativePlan;

    public void setBranchLocationAdministrativePlan(org.museframework.bian.bralocope.dto.cr.BranchLocationAdministrativePlan branchLocationAdministrativePlan) {
        this.branchLocationAdministrativePlan = branchLocationAdministrativePlan;
    }

    public org.museframework.bian.bralocope.dto.cr.BranchLocationAdministrativePlan getBranchLocationAdministrativePlan() {
        return branchLocationAdministrativePlan;
    }
}