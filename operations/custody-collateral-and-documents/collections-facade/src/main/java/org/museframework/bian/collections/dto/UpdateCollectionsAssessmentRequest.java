package org.museframework.bian.collections.dto;

public class UpdateCollectionsAssessmentRequest {
    private String collectionsid;

    private String collectionsassessmentid;

    private org.museframework.bian.collections.dto.bq.CollectionsAssessment collectionsAssessment;

    public void setCollectionsid(String collectionsid) {
        this.collectionsid = collectionsid;
    }

    public String getCollectionsid() {
        return collectionsid;
    }

    public void setCollectionsassessmentid(String collectionsassessmentid) {
        this.collectionsassessmentid = collectionsassessmentid;
    }

    public String getCollectionsassessmentid() {
        return collectionsassessmentid;
    }

    public void setCollectionsAssessment(org.museframework.bian.collections.dto.bq.CollectionsAssessment collectionsAssessment) {
        this.collectionsAssessment = collectionsAssessment;
    }

    public org.museframework.bian.collections.dto.bq.CollectionsAssessment getCollectionsAssessment() {
        return collectionsAssessment;
    }
}