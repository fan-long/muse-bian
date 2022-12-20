package org.museframework.bian.productionrelease.dto;

public class RetrieveOperationalRiskResponse {
    private org.museframework.bian.productionrelease.dto.bq.OperationalRisk operationalRisk;

    public void setOperationalRisk(org.museframework.bian.productionrelease.dto.bq.OperationalRisk operationalRisk) {
        this.operationalRisk = operationalRisk;
    }

    public org.museframework.bian.productionrelease.dto.bq.OperationalRisk getOperationalRisk() {
        return operationalRisk;
    }
}