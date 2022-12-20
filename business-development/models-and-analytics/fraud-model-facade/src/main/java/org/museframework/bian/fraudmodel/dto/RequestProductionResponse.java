package org.museframework.bian.fraudmodel.dto;

public class RequestProductionResponse {
    private org.museframework.bian.fraudmodel.dto.bq.Production production;

    public void setProduction(org.museframework.bian.fraudmodel.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.fraudmodel.dto.bq.Production getProduction() {
        return production;
    }
}