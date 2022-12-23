package org.museframework.bian.promotionalevents.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePromotionalEventManagementPlanRequest {
    @MetaField
    private String promotionaleventsid;

    @MetaField(ref=true)
    private org.museframework.bian.promotionalevents.dto.cr.PromotionalEventManagementPlan promotionalEventManagementPlan;

    public void setPromotionaleventsid(String promotionaleventsid) {
        this.promotionaleventsid = promotionaleventsid;
    }

    public String getPromotionaleventsid() {
        return promotionaleventsid;
    }

    public void setPromotionalEventManagementPlan(org.museframework.bian.promotionalevents.dto.cr.PromotionalEventManagementPlan promotionalEventManagementPlan) {
        this.promotionalEventManagementPlan = promotionalEventManagementPlan;
    }

    public org.museframework.bian.promotionalevents.dto.cr.PromotionalEventManagementPlan getPromotionalEventManagementPlan() {
        return promotionalEventManagementPlan;
    }
}