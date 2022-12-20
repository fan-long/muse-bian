package org.museframework.bian.productdeployment.dto;

public class UpdateProductionSupportResponse {
    private org.museframework.bian.productdeployment.dto.bq.ProductionSupport productionSupport;

    public void setProductionSupport(org.museframework.bian.productdeployment.dto.bq.ProductionSupport productionSupport) {
        this.productionSupport = productionSupport;
    }

    public org.museframework.bian.productdeployment.dto.bq.ProductionSupport getProductionSupport() {
        return productionSupport;
    }
}