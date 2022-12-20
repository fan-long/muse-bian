package org.museframework.bian.promotionalevents.dto;

public class RetrieveImpactAssessmentResponse {
    private org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment impactAssessment;

    public void setImpactAssessment(org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment impactAssessment) {
        this.impactAssessment = impactAssessment;
    }

    public org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment getImpactAssessment() {
        return impactAssessment;
    }
}