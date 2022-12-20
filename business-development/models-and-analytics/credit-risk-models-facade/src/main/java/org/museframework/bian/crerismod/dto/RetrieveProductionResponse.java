package org.museframework.bian.crerismod.dto;

public class RetrieveProductionResponse {
    private org.museframework.bian.crerismod.dto.bq.Production production;

    public void setProduction(org.museframework.bian.crerismod.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.crerismod.dto.bq.Production getProduction() {
        return production;
    }
}