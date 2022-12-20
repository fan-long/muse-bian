package org.museframework.bian.collections.dto;

public class RetrieveCollateralValuationRequest {
    private String collectionsid;

    private String collateralvaluationid;

    public void setCollectionsid(String collectionsid) {
        this.collectionsid = collectionsid;
    }

    public String getCollectionsid() {
        return collectionsid;
    }

    public void setCollateralvaluationid(String collateralvaluationid) {
        this.collateralvaluationid = collateralvaluationid;
    }

    public String getCollateralvaluationid() {
        return collateralvaluationid;
    }
}