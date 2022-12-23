package org.museframework.bian.ebranchmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CreateeBranchChannelManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.ebranchmanagement.dto.cr.eBranchChannelManagementPlan eBranchChannelManagementPlan;

    public void seteBranchChannelManagementPlan(org.museframework.bian.ebranchmanagement.dto.cr.eBranchChannelManagementPlan eBranchChannelManagementPlan) {
        this.eBranchChannelManagementPlan = eBranchChannelManagementPlan;
    }

    public org.museframework.bian.ebranchmanagement.dto.cr.eBranchChannelManagementPlan geteBranchChannelManagementPlan() {
        return eBranchChannelManagementPlan;
    }
}