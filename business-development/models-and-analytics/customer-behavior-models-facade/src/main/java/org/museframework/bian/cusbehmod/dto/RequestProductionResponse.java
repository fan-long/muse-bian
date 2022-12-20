package org.museframework.bian.cusbehmod.dto;

public class RequestProductionResponse {
    private org.museframework.bian.cusbehmod.dto.bq.Production production;

    public void setProduction(org.museframework.bian.cusbehmod.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.cusbehmod.dto.bq.Production getProduction() {
        return production;
    }
}