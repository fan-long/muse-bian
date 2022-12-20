package org.museframework.bian.promotionalevents.dto;

public class CreatePromotionalEventManagementPlanRequest {
    private org.museframework.bian.promotionalevents.dto.cr.PromotionalEventManagementPlan promotionalEventManagementPlan;

    public void setPromotionalEventManagementPlan(org.museframework.bian.promotionalevents.dto.cr.PromotionalEventManagementPlan promotionalEventManagementPlan) {
        this.promotionalEventManagementPlan = promotionalEventManagementPlan;
    }

    public org.museframework.bian.promotionalevents.dto.cr.PromotionalEventManagementPlan getPromotionalEventManagementPlan() {
        return promotionalEventManagementPlan;
    }
}