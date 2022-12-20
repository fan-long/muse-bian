package org.museframework.bian.promotionalevents.dto;

public class RequestPromotionalEventManagementPlanRequest {
    private String promotionaleventsid;

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