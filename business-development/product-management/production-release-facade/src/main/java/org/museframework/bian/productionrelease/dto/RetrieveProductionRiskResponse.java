package org.museframework.bian.productionrelease.dto;

public class RetrieveProductionRiskResponse {
    private org.museframework.bian.productionrelease.dto.bq.ProductionRisk productionRisk;

    public void setProductionRisk(org.museframework.bian.productionrelease.dto.bq.ProductionRisk productionRisk) {
        this.productionRisk = productionRisk;
    }

    public org.museframework.bian.productionrelease.dto.bq.ProductionRisk getProductionRisk() {
        return productionRisk;
    }
}