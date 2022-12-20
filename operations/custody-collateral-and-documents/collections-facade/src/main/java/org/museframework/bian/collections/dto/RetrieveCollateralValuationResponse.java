package org.museframework.bian.collections.dto;

public class RetrieveCollateralValuationResponse {
    private org.museframework.bian.collections.dto.bq.CollateralValuation collateralValuation;

    public void setCollateralValuation(org.museframework.bian.collections.dto.bq.CollateralValuation collateralValuation) {
        this.collateralValuation = collateralValuation;
    }

    public org.museframework.bian.collections.dto.bq.CollateralValuation getCollateralValuation() {
        return collateralValuation;
    }
}