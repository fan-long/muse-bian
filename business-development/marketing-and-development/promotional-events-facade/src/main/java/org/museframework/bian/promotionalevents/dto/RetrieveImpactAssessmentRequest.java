package org.museframework.bian.promotionalevents.dto;

public class RetrieveImpactAssessmentRequest {
    private String promotionaleventsid;

    private String impactassessmentid;

    public void setPromotionaleventsid(String promotionaleventsid) {
        this.promotionaleventsid = promotionaleventsid;
    }

    public String getPromotionaleventsid() {
        return promotionaleventsid;
    }

    public void setImpactassessmentid(String impactassessmentid) {
        this.impactassessmentid = impactassessmentid;
    }

    public String getImpactassessmentid() {
        return impactassessmentid;
    }
}