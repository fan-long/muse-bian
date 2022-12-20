package org.museframework.bian.collections.dto;

public class RetrieveCollectionsAssessmentRequest {
    private String collectionsid;

    private String collectionsassessmentid;

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
}