package org.museframework.bian.productdeployment.dto;

public class RequestProductionResponse {
    private org.museframework.bian.productdeployment.dto.bq.Production production;

    public void setProduction(org.museframework.bian.productdeployment.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.productdeployment.dto.bq.Production getProduction() {
        return production;
    }
}