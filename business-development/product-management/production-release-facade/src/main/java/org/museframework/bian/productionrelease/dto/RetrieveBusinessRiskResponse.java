package org.museframework.bian.productionrelease.dto;

public class RetrieveBusinessRiskResponse {
    private org.museframework.bian.productionrelease.dto.bq.BusinessRisk businessRisk;

    public void setBusinessRisk(org.museframework.bian.productionrelease.dto.bq.BusinessRisk businessRisk) {
        this.businessRisk = businessRisk;
    }

    public org.museframework.bian.productionrelease.dto.bq.BusinessRisk getBusinessRisk() {
        return businessRisk;
    }
}