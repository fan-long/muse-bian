package org.museframework.bian.brokeredproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyBrokeredProductManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan brokeredProductManagementPlan;

    public void setBrokeredProductManagementPlan(org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan brokeredProductManagementPlan) {
        this.brokeredProductManagementPlan = brokeredProductManagementPlan;
    }

    public org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan getBrokeredProductManagementPlan() {
        return brokeredProductManagementPlan;
    }
}