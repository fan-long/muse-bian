package org.museframework.bian.productionrelease.dto;

public class RetrieveFunctionalRiskResponse {
    private org.museframework.bian.productionrelease.dto.bq.FunctionalRisk functionalRisk;

    public void setFunctionalRisk(org.museframework.bian.productionrelease.dto.bq.FunctionalRisk functionalRisk) {
        this.functionalRisk = functionalRisk;
    }

    public org.museframework.bian.productionrelease.dto.bq.FunctionalRisk getFunctionalRisk() {
        return functionalRisk;
    }
}