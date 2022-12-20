package org.museframework.bian.promotionalevents.dto;

public class CreateImpactAssessmentRequest {
    private String promotionaleventsid;

    private String impactassessmentid;

    private org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment impactAssessment;

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

    public void setImpactAssessment(org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment impactAssessment) {
        this.impactAssessment = impactAssessment;
    }

    public org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment getImpactAssessment() {
        return impactAssessment;
    }
}