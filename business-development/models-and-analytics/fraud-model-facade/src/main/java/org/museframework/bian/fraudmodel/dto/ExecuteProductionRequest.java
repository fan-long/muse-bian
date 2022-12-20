package org.museframework.bian.fraudmodel.dto;

public class ExecuteProductionRequest {
    private String fraudmodelid;

    private String productionid;

    private org.museframework.bian.fraudmodel.dto.bq.Production production;

    public void setFraudmodelid(String fraudmodelid) {
        this.fraudmodelid = fraudmodelid;
    }

    public String getFraudmodelid() {
        return fraudmodelid;
    }

    public void setProductionid(String productionid) {
        this.productionid = productionid;
    }

    public String getProductionid() {
        return productionid;
    }

    public void setProduction(org.museframework.bian.fraudmodel.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.fraudmodel.dto.bq.Production getProduction() {
        return production;
    }
}