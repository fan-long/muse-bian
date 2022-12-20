package org.museframework.bian.productdesign.dto;

public class ExecuteProductionResponse {
    private org.museframework.bian.productdesign.dto.bq.Production production;

    public void setProduction(org.museframework.bian.productdesign.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.productdesign.dto.bq.Production getProduction() {
        return production;
    }
}