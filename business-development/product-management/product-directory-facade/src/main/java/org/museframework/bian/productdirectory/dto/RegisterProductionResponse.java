package org.museframework.bian.productdirectory.dto;

public class RegisterProductionResponse {
    private org.museframework.bian.productdirectory.dto.bq.Production production;

    public void setProduction(org.museframework.bian.productdirectory.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.productdirectory.dto.bq.Production getProduction() {
        return production;
    }
}