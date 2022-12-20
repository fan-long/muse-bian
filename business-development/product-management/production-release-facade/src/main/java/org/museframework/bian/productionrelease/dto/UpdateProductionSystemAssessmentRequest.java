package org.museframework.bian.productionrelease.dto;

public class UpdateProductionSystemAssessmentRequest {
    private String productionreleaseid;

    private org.museframework.bian.productionrelease.dto.cr.ProductionSystemAssessment productionSystemAssessment;

    public void setProductionreleaseid(String productionreleaseid) {
        this.productionreleaseid = productionreleaseid;
    }

    public String getProductionreleaseid() {
        return productionreleaseid;
    }

    public void setProductionSystemAssessment(org.museframework.bian.productionrelease.dto.cr.ProductionSystemAssessment productionSystemAssessment) {
        this.productionSystemAssessment = productionSystemAssessment;
    }

    public org.museframework.bian.productionrelease.dto.cr.ProductionSystemAssessment getProductionSystemAssessment() {
        return productionSystemAssessment;
    }
}