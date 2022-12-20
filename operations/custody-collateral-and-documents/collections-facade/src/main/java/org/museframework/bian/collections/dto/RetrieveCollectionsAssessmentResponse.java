package org.museframework.bian.collections.dto;

public class RetrieveCollectionsAssessmentResponse {
    private org.museframework.bian.collections.dto.bq.CollectionsAssessment collectionsAssessment;

    public void setCollectionsAssessment(org.museframework.bian.collections.dto.bq.CollectionsAssessment collectionsAssessment) {
        this.collectionsAssessment = collectionsAssessment;
    }

    public org.museframework.bian.collections.dto.bq.CollectionsAssessment getCollectionsAssessment() {
        return collectionsAssessment;
    }
}