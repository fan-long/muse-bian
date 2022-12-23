package org.museframework.bian.promotionalevents.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreatePromotionalEventManagementPlanRequest {
    @MetaField(ref=true)
    private org.museframework.bian.promotionalevents.dto.cr.PromotionalEventManagementPlan promotionalEventManagementPlan;

    public void setPromotionalEventManagementPlan(org.museframework.bian.promotionalevents.dto.cr.PromotionalEventManagementPlan promotionalEventManagementPlan) {
        this.promotionalEventManagementPlan = promotionalEventManagementPlan;
    }

    public org.museframework.bian.promotionalevents.dto.cr.PromotionalEventManagementPlan getPromotionalEventManagementPlan() {
        return promotionalEventManagementPlan;
    }
}