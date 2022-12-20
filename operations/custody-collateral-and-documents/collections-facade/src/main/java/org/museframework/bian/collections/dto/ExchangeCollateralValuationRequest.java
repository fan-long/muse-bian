package org.museframework.bian.collections.dto;

public class ExchangeCollateralValuationRequest {
    private String collectionsid;

    private String collateralvaluationid;

    private org.museframework.bian.collections.dto.bq.CollateralValuation collateralValuation;

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

    public void setCollateralValuation(org.museframework.bian.collections.dto.bq.CollateralValuation collateralValuation) {
        this.collateralValuation = collateralValuation;
    }

    public org.museframework.bian.collections.dto.bq.CollateralValuation getCollateralValuation() {
        return collateralValuation;
    }
}